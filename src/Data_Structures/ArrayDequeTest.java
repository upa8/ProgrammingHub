package Data_Structures;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Stack;
 
public class ArrayDequeTest {
	public static void main(String... args){
		Stack<Integer > st = new Stack<Integer>();
		
		ArrayDeque<String> aq= new ArrayDeque<String>();
		aq.add("A");
		aq.add("B");
		aq.add("C");
		
		
		//offerFirst-adds elements at the front of the ArrayDeque 
		aq.offerFirst("D");
		
		//offerLast inserts the element at the last of ArrayDeque 
		aq.offerLast("E");
		
		Iterator<String> itr= aq.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}
}