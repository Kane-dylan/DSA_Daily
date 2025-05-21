package basic;

import java.util.*;

//public class Solution {
//    public boolean containsDuplicate(int[] nums) {
//            Arrays.sort(nums);
//            int n=nums.length;
//            for(int i=0; i<n; i++){
//                if(nums[i]==nums[i - 1]){
//                    return true;
//                }
//            }
//            return false;
//        }
//}
 class Solution {
     public boolean containsDuplicate(int[] nums) {
         Arrays.sort(nums);
         int n=nums.length;
         for(int i=0; i<n; i++){
             if(nums[i]==nums[i - 1]){
                 return true;
             }
         }
         return false;
     }
 }