import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Algebric_To_ReversePolishNotation{

  public static void main(String[] args) throws NumberFormatException, IOException{
    int i,j;
    j = 0;
    String x = "";

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
    j = Integer.parseInt(br.readLine());
    for(i=0;i<j;i++){
        x = br.readLine();
        System.out.println(rpn(x));
    }    
  }

  public static String rpn(String x){
    String result = "";
    char c = 'a';
    int i;
    Stack<Character> s = new Stack<Character>();
    
    for(i=0;i<x.length();i++){
      c = x.charAt(i);
      if(c>='a'&&c<='z')
        result += c;
      else if(c==')'){
        while((c = s.pop())!='(')
          result += c;
      }
      else
        s.push(c);
    }
    return result;
  }

}