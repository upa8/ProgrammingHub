class Calculation{ 
   int z;
   public void addition(int x, int y){
      z=x+y;
      System.out.println("The sum of the given numbers:"+z);
   }
   public void Subtraction(int x,int y){
      z=x-y;
      System.out.println("The difference between the given numbers:"+z);
   }
}

public class testing extends Calculation{    
   int z;
   public void multiplication(int x, int y){
      z=x*y;
      System.out.println("The product of the given numbers:"+z);
   }
   public static void main(String args[]){
      int a=20, b=10;
      Inheritance_Demo demo = new Inheritance_Demo();
      demo.addition(a, b);
      demo.Substraction(a, b);
      demo.multiplication(a, b);
   }

}