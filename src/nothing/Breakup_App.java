import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Breakup_App {
	public static void main(String args[]) throws IOException{
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String line = br.readLine();
	        int N = Integer.parseInt(line);
	        String[] conversation = new String[N];
	        
	        for (int i = 0; i < N; i++) {
	            conversation[i] = br.readLine();
	        }
	        
	        Map<Integer, Integer> weightage = new HashMap<Integer, Integer>();
	        for (int i = 0; i < N; i++) {
	        	char speaker = conversation[i].charAt(0);
	        	String[] words = conversation[i].split(" ");
	        	int noOfWords = words.length;
	        	for(int j=0; j<noOfWords; j++)
	        	{
	        		String word = words[j];
	        		if(word.length()==2)
	        		{
	        			if((Character.isDigit(word.charAt(0)))&&(Character.isDigit(word.charAt(1))))
	        			{
	        				int date = Integer.parseInt(word);
	        				int weight=0;
	        				
	        				if(weightage.containsKey(date))
	        				{
	        					weight = weightage.get(date);
	        					weightage.remove(date);
	        				}
	        				if(speaker == 'G')
	        					weight += 2;
	        				else
	    						weight += 1;
	        				weightage.put(date, weight);
	        			}
	        		}
	        	}
	        }
	        if(!weightage.isEmpty())
	        {
	        	Set<Integer> dates = weightage.keySet();
		        Iterator<Integer> it = dates.iterator();
		        int maxdate = it.next();
		        int maxWeightage = weightage.get(maxdate);
		        
		        while(it.hasNext())
		        {
		        	int date = it.next();
		        	if(weightage.get(date) > maxWeightage)
		        	{
		        		maxWeightage = weightage.get(date);
		        		maxdate = date;
		        	}
		        	else if(weightage.get(date) == maxWeightage)
		        	{
		        		maxdate = 19;
		        		maxWeightage = weightage.get(date);
		        	}
		        }
		        if((maxdate == 19)||(maxdate==20))
		        	System.out.println("Date");
		        else
		        	System.out.println("No Date");
	        }
	        else
	        	System.out.println("No Date");

}
	}
