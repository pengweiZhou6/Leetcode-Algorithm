//136. Single Number
 //https://leetcode.com/problems/single-number/

 class Solution {
     public int singleNumber(int[] nums) {
         List<Integer> temp = new ArrayList<>();
         for(int i : nums){
             if(temp.contains(i)){
                 temp.remove(Integer.valueOf(i));
             }else{
                 temp.add(i);
             }
         }
         return temp.get(0);
     }
 }