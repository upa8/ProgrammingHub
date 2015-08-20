package Testing;

import java.util.Scanner;



class event{
    int l;
    int a[];
    event(){
        
    }
    
    event(int x){
      l = x;    
      a= new int[l];
      for(int i=0;i<l;i++)
      {
          a[i]=0;
      }
   }
}

public class Vecclk {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
    	System.out.println("Enter the number of processes");
        int n = sc.nextInt();
        int status[] = new int[n];
        event obj = new event(n); 
        
        // There is no such constructor in EVENT class which has two parameters 
        //Following line is wrong according to me bro . 
        
        event array[][] = new event[n][10];
        
        for(int p=0;p<n;p++){
            for(int q=0;q<10;q++){
                array[p][q]= new event(p);
            }
        }
        
        for(int i=0;i<n;i++){
            System.out.println();
            for(int j=0;j<10;j++){
                System.out.print("  :  ");
                for(int k=0;k<n;k++){
                    System.out.print(array[i][j].a[0] + " ");
                }
        }
        }
        
    }
}
