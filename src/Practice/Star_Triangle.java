package Practice;

public class Star_Triangle {
	public static void main(String args[]){
	
		for ( int i = 0 ; i < 4 ; i ++ ){	
	        for( int j = 0 ; j < (7-(2*i)) ; j ++){
	            if(j%2==0){
	                System.out.print("*");
	            }else{
	                System.out.print("_");
	            }
	        }
            System.out.println("\n");
	    }
	  
	}
}
