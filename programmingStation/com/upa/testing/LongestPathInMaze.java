package com.upa.testing;

import java.util.ArrayList;
import java.util.List;

import com.upa.templates.MyScanner;

public class LongestPathInMaze extends MyScanner {

	public static void main(String[] args) throws Exception {
		LongestPathInMaze in = new LongestPathInMaze();
		int m = in.nextInt();
		int n = in.nextInt();
		boolean[][] maze = new boolean[m][n];
		makeRandomMaze(maze);
		int h = in.nextInt();
		// add hurdles
		for (int i = 0; i < h; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			maze[x][y] = false;
		}
		int startCellX = in.nextInt();
		int startCellY = in.nextInt();
		int endCellX = in.nextInt();
		int endCellY = in.nextInt();
		printMaze(maze);
		List<Cell> path = findLongestPath(maze, startCellX, startCellY,
				endCellX, endCellY);
		if (path == null) {
			System.out.println("-1");
			// return;
		}

		long count = 0;
		for (Cell cell : path) {
			// System.out.print(cell + ",");
			count++;
		}
		System.out.println(count / 2);
		printMaze(maze);
	}

	private static List<Cell> findLongestPath(boolean[][] maze, int sX, int sY,
			int lX, int lY) {
		Cell start = new Cell(sX, sY);
		Cell end = new Cell(lX, lY);
		List<Cell> path = findLongestPath(maze, start, end);
		return path;
	}

	private static List<Cell> findLongestPath(boolean[][] maze, Cell start,
			Cell end) {
		List<Cell> result = null;
		int rows = maze.length;
		int cols = maze[0].length;
		if ((start.row < 0) || (start.col < 0)) {
			return null;
		}
		if ((start.row == rows) || (start.col == cols)) {
			return null;
		}
		if (maze[start.row][start.col] == true) {
			return null;
		}
		if (start.equals(end)) {
			List<Cell> path = new ArrayList<Cell>();
			path.add(start);
			return path;
		}
		maze[start.row][start.col] = true;
		Cell[] nextCells = new Cell[4];
		nextCells[0] = new Cell(start.row + 1, start.col);
		nextCells[2] = new Cell(start.row, start.col + 1);
		nextCells[1] = new Cell(start.row - 1, start.col);
		nextCells[3] = new Cell(start.row, start.col - 1);
		int maxLength = -1;
		for (Cell nextCell : nextCells) {
			List<Cell> path = findLongestPath(maze, nextCell, end);
			if ((path != null) && (path.size() > maxLength)) {
				maxLength = path.size();
				path.add(0, start);
				result = path;
			}
		}
		maze[start.row][start.col] = false;
		if ((result == null) || (result.size() == 0)) {
			return null;
		}
		return result;
	}

	private static class Cell {
		public int row;
		public int col;

		public Cell(int row, int column) {
			this.row = row;
			this.col = column;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if ((obj == null) || (obj.getClass() != this.getClass())) {
				return false;
			}
			Cell cell = (Cell) obj;
			if ((this.row == cell.row) && (this.col == cell.col)) {
				return true;
			}
			return false;
		}

		@Override
		public String toString() {
			return "(" + this.row + "," + this.col + ")";
		}
	}

	private static void printMaze(boolean[][] maze) {
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[i].length; j++) {
				if (maze[i][j]) {
					System.out.print(" 1 ");
				} else {
					System.out.print(" 0 ");
				}
			}
			System.out.println();
		}
	}

	private static void makeRandomMaze(boolean[][] maze) {
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[0].length; j++) {
				maze[i][j] = true;
			}
		}
		// maze[0][0] = true;
		// maze[maze.length - 1][maze[0].length - 1] = false;

	}
}
