package Data_Structures;

//DFS AND BFS Algorithmsimport java.util.InputMismatchException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;
 
public class DFS
{
    private Stack<Integer> stack;
 
    public DFS() 
    {
        stack = new Stack<Integer>();
    }
 
    public void dfs(int adjacency_matrix[][], int source)
    {
    	// Count the number of nodes 
    	int nodesNumber = adjacency_matrix[source].length;
    	// create a visited array 
    	int [] visited = new int[nodesNumber]; 
    	// fil this array with zeros
    	Arrays.fill(visited, 0);
    	// Make source node visited
    	visited[source] = 1;
    	// add source node to stack
    	stack.add(source);
    	System.out.print(source +" ");
    	while(!stack.isEmpty()){
    		// get the top element from stack 
    		int m = stack.peek();
    		// now check the adjecent elements of the v
    		for(int i = 0 ; i <nodesNumber; i++ ){
    			if(adjacency_matrix[m][i] == 1 && visited[i] == 0 ){
    				// now we found a node which has path and it is not visited
    				// make it visited first
    				visited[i] = 1;
    				// print it 
    				System.out.print(i);
    				// now push it onto stack 
    				stack.add(i);
    				break;
    			}
    					
    		}
        	
    	}
    	/*
        int number_of_nodes = adjacency_matrix[source].length - 1;
        int visited[] = new int[number_of_nodes + 1];		
        
        int element = source;		
        int i = source;		
        System.out.print(element + "\t");		
        visited[source] = 1;		
        stack.push(source);
 
        while (!stack.isEmpty())
        {
        	// select the top element of stack 
            element = stack.peek();
            i = element;	
            
	    while (i <= number_of_nodes)
	    {
     	        if (adjacency_matrix[element][i] == 1 && visited[i] == 0)
     	        {
                    stack.push(i);
                    visited[i] = 1;
                    element = i;
                    i = 1;
                    System.out.print(element + "\t");
                    continue;
                }
                i++;
	    }
            stack.pop();	
        }	
    */
    }
 
    public static void main(String...arg)
    {
        int number_of_nodes, source;
        Scanner scanner = null;
 	try
        {
	    System.out.println("Enter the number of nodes in the graph");
            scanner = new Scanner(System.in);
            number_of_nodes = scanner.nextInt();
 
	    int adjacency_matrix[][] = new int[number_of_nodes + 1][number_of_nodes + 1];
	    System.out.println("Enter the adjacency matrix");
	    for (int i = 0; i <= number_of_nodes; i++)
	        for (int j = 0; j <= number_of_nodes; j++)
                    adjacency_matrix[i][j] = scanner.nextInt();
 
	    System.out.println("Enter the source for the graph");
            source = scanner.nextInt(); 
 
            System.out.println("The DFS Traversal for the graph is given by ");
            DFS dfs = new DFS();
            dfs.dfs(adjacency_matrix, source);					
        }catch(InputMismatchException inputMismatch)
        {
            System.out.println("Wrong Input format");
        }	
        scanner.close();	
    }	
}