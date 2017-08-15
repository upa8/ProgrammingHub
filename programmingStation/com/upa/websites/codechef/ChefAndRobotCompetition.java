package com.upa.websites.codechef;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class ChefAndRobotCompetition extends MyScanner {
	static int infi = Integer.MAX_VALUE;
	static int R1visited[][];
	static int R2visited[][];
	static int visited[][];
	static int distMat[][];
	static ArrayDeque<Point> queue;
	static char a[][];
	static int n;
	static int m;
	static int k1;
	static int k2;

	public static void main(String args[]) throws Exception {
		ChefAndRobotCompetition in = new ChefAndRobotCompetition();
		// System.out.println("Start ");
		int t = in.nextInt();
		while (t-- > 0) {
			n = in.nextInt();
			m = in.nextInt();
			k1 = in.nextInt();
			k2 = in.nextInt();
			R1visited = new int[n + 1][m + 1];
			R2visited = new int[n + 1][m + 1];
			visited = new int[n + 1][m + 1];
			distMat = new int[n + 1][m + 1];
			// Arrays.fill(distMat, infi);
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= m; j++) {
					distMat[i][j] = infi;
				}
			}
			queue = new ArrayDeque<Point>();
			queue.clear();
			a = new char[n + 1][m + 1];
			a[1][1] = 'S';
			a[1][m] = 'E';
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= m; j++) {
					int x = in.nextInt();
					if (((i == 1) && (j == 1)) || ((i == 1) && (j == (m)))) {
						distMat[i][j] = 0;
						continue;
					} else {
						if (x == 1) {
							a[i][j] = 'W';

						} else {
							a[i][j] = '0';
						}
					}
				}
			}
			System.out.println(in.sol());

		}
	}

	public int sol() {
		// TODO Auto-generated method stub
		// edgeCase
		if (m == 0) {
			return 0;
		}
		int finalAnswer = 0;
		Point r1 = new Point(1, 1, 1);
		Point r2 = new Point(1, m, 2);
		queue.offer(r1);
		queue.offer(r2);
		// System.out.println("Size of queue" + queue.size());
		while (!queue.isEmpty()) {
			Point p = queue.poll();
			int x = p.getX();
			int y = p.getY();
			int z = p.getK();
			if (z == 1) {
				finalAnswer = this.getPath(x, y, k1, z);
			} else {
				finalAnswer = this.getPath(x, y, k2, z);
			}
			if (finalAnswer != -1) {
				return finalAnswer;
			}

		}
		return -1;
	}

	public int getPath(int x, int y, int maxDistanceToTravel, int whichRobot) {
		int ans = -1;
		for (int index = 1; index <= maxDistanceToTravel; ++index) {
			// go left
			ans = this.traverseNeighbours(x, y + index, index, 1, -1,
					distMat[x][y], whichRobot);
			if (ans != -1) {
				return ans;
			}
			// go down
			ans = this.traverseNeighbours(x, y - index, index, -1, 1,
					distMat[x][y], whichRobot);
			if (ans != -1) {
				return ans;
			}
			// go upward diagonally
			ans = this.traverseNeighbours(x + index, y, index, -1, -1,
					distMat[x][y], whichRobot);
			if (ans != -1) {
				return ans;
			}
			// downward diagonally
			ans = this.traverseNeighbours(x - index, y, index, 1, 1,
					distMat[x][y], whichRobot);
			if (ans != -1) {
				return ans;
			}
		}
		return ans;
	}

	int traverseNeighbours(int x, int y, int counter, int newX, int newY,
			int initialDist, int whichRobot) {
		while (counter-- > 0) {
			// Check robot's boundry condition
			if ((x > 0) && (x <= n) && (y > 0) && (y <= m)) {
				// if the robot is reached where the other
				// robot has reached then return

				if ((whichRobot == 1) && (R2visited[x][y] == 2)) {
					return initialDist + 1;
				}
				// if the robot is reached where the other
				// robot has reached then return

				if ((whichRobot == 2) && (R1visited[x][y] == 1)) {
					return initialDist + 1;
				}

				// Check whether there is no
				// block or obstacle in
				// way

				if (!(a[x][y] == 'W')) {
					// only if there is no obstacle
					// check wheher the distance is visited
					// or not
					if (distMat[x][y] == infi) {
						// get the previous distance
						distMat[x][y] = initialDist + 1;
						Point p = new Point(x, y, whichRobot);
						queue.offer(p);

					}

					// Check which robot we are in
					if (whichRobot == 1) {
						R1visited[x][y] = 1;
					} else {
						R2visited[x][y] = 2;
					}
				}
			}
			x = x + newX;
			y = y + newY;
		}
		return -1;
	}
	// Attempt 1
	// Passing only cases for k1 nd k2 = 1

	public int sol1(int n, int m, int k1, int k2, char[][] a) {
		// TODO Auto-generated method stub
		int max = Math.max(k1, k2);
		int min = Math.min(k1, k2);
		int x = getPath(a, n, m, max, min);
		// int y = getPath(a, n, m, min);
		// System.out.println("X: " + x);
		if ((x == 0)) {
			return -1;
		} else {
			return x;
		}
	}

	private static List<Position> getNeighour(Position p, int row, int col) {
		List<Position> neighours = new ArrayList<Position>();

		Position posLeft = p.getLeft();
		if ((posLeft.row >= 0) && (posLeft.row < row) && (posLeft.col >= 0)
				&& (posLeft.col < col)) {
			neighours.add(posLeft);
		}
		Position posRight = p.getRight();
		if ((posRight.row >= 0) && (posRight.row < row) && (posRight.col >= 0)
				&& (posRight.col < col)) {
			neighours.add(posRight);
		}
		Position posUp = p.getUp();
		if ((posUp.row >= 0) && (posUp.row < row) && (posUp.col >= 0)
				&& (posUp.col < col)) {
			neighours.add(posUp);
		}
		Position posDown = p.getBottom();
		if ((posDown.row >= 0) && (posDown.row < row) && (posDown.col >= 0)
				&& (posDown.col < col)) {
			neighours.add(posDown);
		}

		return neighours;

	}

	public static int getPath(char[][] arr, int row, int col, int k1, int k2) {
		final int[][] grid1 = new int[row][col];
		final int[][] grid2 = new int[row][col];
		final int[][] visited = new int[row][col];
		/*
		 * PriorityQueue<Position> queue1 = new PriorityQueue<Position>(col *
		 * row, new Comparator<Position>() {
		 *
		 * @Override public int compare(Position o1, Position o2) { if
		 * (grid[o1.row][o1.col] < grid[o2.row][o2.col]) { return -1; } else if
		 * (grid[o1.row][o1.col] > grid[o2.row][o2.col]) { return 1; } else {
		 * return 0; } } });
		 */
		/*
		 * PriorityQueue<Position> queue2 = new PriorityQueue<Position>(col *
		 * row, new Comparator<Position>() {
		 *
		 * @Override public int compare(Position o1, Position o2) { if
		 * (grid[o1.row][o1.col] < grid[o2.row][o2.col]) { return -1; } else if
		 * (grid[o1.row][o1.col] > grid[o2.row][o2.col]) { return 1; } else {
		 * return 0; } } });
		 */
		ArrayDeque<Position> queue1 = new ArrayDeque<Position>();
		ArrayDeque<Position> queue2 = new ArrayDeque<Position>();
		queue1.offer(new Position(0, 0, k1));
		grid1[0][0] = 0;
		visited[0][0] = 1;
		queue2.offer(new Position(0, col - 1, k2));
		grid2[0][col - 1] = 0;
		visited[0][col - 1] = 2;
		int step = 0;
		int countStep = 0;
		while (!queue1.isEmpty() && !queue2.isEmpty()) {
			Position current;
			int which = 0;
			if ((step % 2) == 0) {
				current = queue1.poll();
				which = 1;
			} else {
				which = 2;
				current = queue2.poll();
			}

			List<Position> neighours = getNeighour(current, row, col);
			int moved = 0;
			for (Position neighour : neighours) {
				if (which == 1) {
					if (!(arr[neighour.row][neighour.col] == 'W')
							&& (grid1[neighour.row][neighour.col] == 0)) {
						grid1[neighour.row][neighour.col] = grid1[current.row][current.col]
								+ 1;
						if (visited[neighour.row][neighour.col] == 2) {
							// we reached
							// return step + 1;
							return countStep + 1;
						}
						visited[neighour.row][neighour.col] = 1;
						queue1.offer(neighour);
						// step++;
						moved = 1;
					}

				} else {
					if (!(arr[neighour.row][neighour.col] == 'W')
							&& (grid2[neighour.row][neighour.col] == 0)) {
						grid2[neighour.row][neighour.col] = grid2[current.row][current.col]
								+ 1;
						if (visited[neighour.row][neighour.col] == 1) {
							// we reached
							// return step + 1;
							return countStep + 1;
						}
						visited[neighour.row][neighour.col] = 2;
						queue2.offer(neighour);
						// step++;
						moved = 1;
					}

				}

				// if (arr[neighour.row][neighour.col] == 'E') {
				// return step + 1;
				// return grid[current.row][current.col] + 1;
				// }
			} /*
				 * for (int i = 0; i < row; i++) { for (int j = 0; j < col; j++)
				 * { // System.out.print(visited[i][j] + " "); } //
				 * System.out.println(); }
				 */
			// System.out.println("Step " + (step));
			if (moved == 1) {
				countStep++;
				// System.out.println("Count " + countStep);
			}
			step++;
		}
		return 0;
	}

	static class Point {
		public int x;
		public int y;
		public int k;

		public Point(int x, int y, int k) {
			this.x = x;
			this.y = y;
			this.k = k;
		}

		public int getX() {
			return this.x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return this.y;
		}

		public void setY(int y) {
			this.y = y;
		}

		public int getK() {
			return this.k;
		}

		public void setK(int k) {
			this.k = k;
		}

	}

	static class Position {
		public int row;
		public int col;
		public int k;

		public Position(int row, int col, int k) {
			this.row = row;
			this.col = col;
			this.k = k;
		}

		public Position getLeft() {
			return new Position(this.row, this.col - this.k, this.k);
		}

		public Position getRight() {
			return new Position(this.row, this.col + this.k, this.k);
		}

		public Position getBottom() {
			return new Position(this.row + this.k, this.col, this.k);
		}

		public Position getUp() {
			return new Position(this.row - this.k, this.col, this.k);
		}
	}
}
