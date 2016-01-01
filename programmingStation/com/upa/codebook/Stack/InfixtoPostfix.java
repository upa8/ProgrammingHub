
package inf;

import java.util.Scanner;
import java.util.Stack;

public class InfixtoPostfix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String infix = sc.nextLine();
        String postfix= InfixtoPostfix( infix );
        System.out.println(postfix);
    }
    static boolean isOperand(char ch)
{
        
        return Character.isAlphabetic(ch);
    
}
    // Method used to check precedence
    static int Prec(char ch)
{
    switch (ch)
    {
    case '+':
    case '-':
        return 1;
 
    case '*':
    case '/':
        return 2;
 
    case '^':
        return 3;
    }
    return -1;
}//abcd^e-fgh*+^*+i-
    static String InfixtoPostfix(String infix )
    {
           String postfix="",s;
        Stack<String> stack = new Stack<>();
        for(int i=0;i<infix.length();i++)
        {
            s=infix.substring(i, i+1);
            char c = s.charAt(0);
            // if char is a operand then output it
            if(isOperand( c))
            {
                postfix+=s;
            }
            // if char is '(' then push it to stack
            else if (c == '(')
            {
                stack.push(s);
            }
            // if char is ')' then pop elements until u encounter '('
             else if (c == ')')
        {
            while (!stack.empty() &&  !"(".equals(stack.peek()))
                postfix += stack.pop();
            if (!stack.empty() &&  !"(".equals(stack.peek()))
            {}       
            else
               // pop the remaining '(' 
            stack.pop();
        }
             else // an operator is encountered
        {    // if precedence of current operator is less than/ equal to top of stack 
             // then pop until it is less than
                 
            while ( !stack.empty()  && Prec(c) <= Prec(stack.peek().charAt(0)) )
               postfix += stack.pop();
            // push new oterator
              stack.push(s);
        }
            
        }
        // pop remaining elements to empty the stack
         while (!stack.empty())
          postfix += stack.pop();
        
         
         return postfix;
    
    
        
    }
    
}
