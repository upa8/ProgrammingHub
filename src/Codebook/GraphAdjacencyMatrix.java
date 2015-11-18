package Codebook;

/*
 * This program is to create AdjacencyMatrix Representation of Graph 
 * 
 */

public class GraphAdjacencyMatrix extends MyScanner {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		GraphAdjacencyMatrix in = new GraphAdjacencyMatrix();
		int adj[][];
		int n, m;

		n = in.nextInt();
		m = in.nextInt();
		adj = new int[n][m];
		// Fill the adj Matrix with the initial values 
		for ( int i = 0 ; i < n ; i++ ) {
			for ( int j = 0 ; j < m ; j++ ) {
				adj[i][j] = -1;
			}
			// For the same vertices 
			adj[i][i] = 0;
		}
		// Now read the number of edges and their values into the adj matrix 
		// Let's suppose there are total 'm' number of edges in the graph 
		// So we have to run our loop to add those edges and their weight into our 
		// adj matrix 

		for ( int i = 0 ; i < m ; i++ ) {
			// Read the starting of edge  
			int f = in.nextInt() - 1; //(-1 because index starts from 1)
			// Read the ending of edge
			int e = in.nextInt() - 1; //(-1 because index starts from 1)
			// Now read the cost value and put that cost value 
			// in two places in adjmatrix   adj[f][e] and adj[e][f] 
			// Also , f and e should not be same because if they are same then  there is edge from same vertext to the same vertext 
			adj[f][e] = adj[e][f] = 6;//in.nextInt();
		}

		in.printMatrix(adj, n, m);

	}

	public void printMatrix(int a[][], int n, int m) {
		for ( int i = 0 ; i < n ; i++ ) {
			for ( int j = 0 ; j < m ; j++ ) {
				System.out.println((i + 1) + "->" + (j + 1) + ":" + a[i][j]);
			}
		}
	}
}
