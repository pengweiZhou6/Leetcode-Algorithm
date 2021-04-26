// 169. Majority Element
// https://leetcode.com/problems/majority-element/
class Solution {
    public int majorityElement(int[] nums) {
        int gate = nums.length/2;
        for(int i : nums){
            int count = 0;
            for(int j :nums){
                if(i==j){
                    count++;
                }
            }

            if(count > gate){
                return i;
            }

        }
        return -1;
    }
}