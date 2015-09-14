package LeetCode;

import java.util.HashMap;

/*
public class MaximumProductSumArray {
    public int maxProduct(int[] nums) {
        int l = nums.length;
        // if there is only one element .
        if( l == 1 )
            return nums[0];
        //If there are more than one elements then count number of negative numbers     
        int count = 0;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i = 0 ; i<l ; i++){
            // Count number of negative numbers 
            if(nums[i] < 0)
                count++;
            hm.put(i,count);    
        }
        long product = 0;
        if(count%2 == 0){
            for(int i = 0 ; i < l ; i++){
                product *= nums[i];
            }
        }else{
            // Now search for the previous even count of negative number as well as check out that the numbers that we are leaving are                  //smaller or not
            int storeId = 0;
            long another_product = 0 ; 
            for(int i = l-1 ; i > 0 ;i--  ){
                int a = hm.get(i);
                if(a%2 == 0){
                    storeId = i;
                    break;
                }else{
                    another_product *= nums[i];
                }
            }
            for(int i = 0 ; i < storeId ; i++){
                        product *= nums[i];
                    }
                
            if(another_product > product){
                return (int) another_product;
            }else{
                return (int) product;
            }        
          
        }
        return (int) product ;
    }
}

*/

public class MaximumProductSumArray {
    public int maxProduct(int[] A) {
        
        int max = A[0];
        int positive_history = A[0];
        int negative_history = A[0];

        for(int i = 1; i < A.length; i++){
            
            positive_history *= A[i];
            negative_history *= A[i];

            if(negative_history > positive_history){
                int t = negative_history;
                negative_history = positive_history;
                positive_history = t;
            }

            positive_history = Math.max(A[i], positive_history);
            negative_history = Math.min(A[i], negative_history);


            max = Math.max(max, positive_history);
        }
        
        return max;
    }
}
