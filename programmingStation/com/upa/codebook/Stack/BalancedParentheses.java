
package balancedparentheses;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParentheses {

    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();
        boolean result = areParenthesisBalanced(exp);
        if(result)
        {
            System.out.println("Expression is balanced");
        }
        else
        {
            System.out.println("Expression is not balanced");

        }
    }
     static boolean areParenthesisBalanced(String exp)
{
    // Create a stack 
      Stack<Character> stack = new Stack<>();
      String s;
    
    
 
    // Scan all characters one by one
    for (int i = 0; i<exp.length(); i++)
    {   s=exp.substring(i, i+1);
        char c = s.charAt(0);
        // if scanned character in opening parenthesis 
        if(c=='('||c=='{'||c=='[')
        {
           stack.push(c);
        }
         if (c == '}' || c == ')' || c == ']')
      {
             
          /*If we see an ending parenthesis without a pair then return false*/
         if (stack.empty())
           return false; 
 
         /* Pop the top element from stack, if it is not a pair 
            parenthesis of character then there is a mismatch.
            This happens for expressions like {(}) */
         else if ( !isMatchingPair(stack.pop(),c ) )
           return false;
      }
            
        
       
    }
     /* If there is something left in expression then there is a starting
      parenthesis without a closing parenthesis */
   if (stack.empty())
     return true; /*balanced*/
   else
     return false;  /*not balanced*/
} 
    

     static boolean isMatchingPair(char character1, char character2)
{
   if (character1 == '(' && character2 == ')')
     return true;
   else if (character1 == '{' && character2 == '}')
     return true;
   else if (character1 == '[' && character2 == ']')
     return true;
   else
     return false;
}
}
