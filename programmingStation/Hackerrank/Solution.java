package Hackerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;


public class Solution extends MyScanner {

    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Solution in = new Solution();
        int t = in.nextInt();
        while(t>0){
            int m = in.nextInt();
            int n = in.nextInt();
            int[] a = new int[n];
            boolean flag = false;
            HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
            for(int i = 1 ; i <n; i++){
            	a[i] = Integer.parseInt(in.nextToken()) ;
            	if(a[i] <m && (flag == false)){
            		if(hm.containsKey(m-a[i])){
                		int value = hm.get(m-a[i]);
                		System.out.println(value + " " + i );
                		flag = true;
                	}else{
                		hm.put(a[i],i);
                	}
            	}
            	
            }
            hm.clear();
            
            t--;
        }
    }
}
