// https://leetcode.com/explore/featured/card/february-leetcoding-challenge-2021/587/week-4-february-22nd-february-28th/3650/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if(matrix[row][col] == target){
                    return true;
                }
            }
        }
        return false;
    }
}