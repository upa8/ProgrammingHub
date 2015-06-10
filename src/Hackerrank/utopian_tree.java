package Hackerrank;

import java.io.IOException;
import java.util.Scanner;

public class utopian_tree {
	  public static void main(String[] args) throws IOException{ 
	    	Scanner sc = new Scanner(System.in);
	    	int t = sc.nextInt();
	        for(int i = 0 ; i < t ; i++){
	        	int  x = sc.nextInt();
	        	int h = 1 ;
	        	if(x == 0 ){
	        		System.out.println(h);
	        	}else{
		        	for(int j = 1 ; j<= x ; j++){
		        		if((j % 2) == 0)
		        			h=h+1;
		        		else
		        			h=h*2;
		        		}
		        	System.out.println(h);
		        } 	
	        }
	    }

}
