package com.upa.websites.leetCode;
/*
 * Author : Pratik Upacharya
 * question :  https://leetcode.com/problems/first-bad-version/
 * 
 */


/* The isBadVersion API is defined in the parent class VersionControl.
boolean isBadVersion(int version); */



public class FirstBadVersion  {
	public static int firstBadVersion(int n) {
		  long low = 1;
		  long high = n;
		  long mid = (low + high)/2;
		  boolean first = false;
		  if(n == 1){
		      if(isBadVersion(1)){
		          return 1;
		      }
		  }
		  if(n == 2){
		      if(isBadVersion(1)){
		          return 1;
		      }else{
		          if(isBadVersion(2)){
		          return 2;
		          }   
		      }
		  }
		  int m = 5;
		  while(!first){
			            if(isBadVersion((int)mid)){             
		                  if(isBadVersion((int)mid-1)){
		                	  high = mid-1;
		                	  mid = (high + low)/2;
		                	   if(low == high){
			                	   first = true;
			                       return (int)low;
			                   } 
			                  }else{
			                	  return (int)mid;
			                  }
		              }else{
		            	       if(isBadVersion((int)mid+1)){
		                      	
		                    	  first = true;
		                    	  return (int)(mid+1);
		                      }else{
		                          	
		                          low = mid;  
		                          mid = (low+high)/2;
		                      }
		                  }   
		  }
		  return -1;
		  
	}
	public static boolean a[];
	public static void main(String args[]){
		FirstBadVersion in = new FirstBadVersion();
		a = new boolean[101];
		for(int i = 1 ; i <=10 ; i++){
			if(i >= 5){
				a[i] = false;
			}else{
				a[i] = true;
			}
			System.out.print(i+" "+a[i]);
		}
		
		System.out.println( "Hey" + firstBadVersion(20));
		
	}
	public static boolean isBadVersion(int n){
		if(a[n] == false){
			return true;
		}else{
			return false;
		}
	}

}