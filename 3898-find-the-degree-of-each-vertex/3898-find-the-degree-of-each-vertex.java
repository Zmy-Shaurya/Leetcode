class Solution {
    public int[] findDegrees(int[][] matrix) {
        int[] result = new int[matrix.length];
        for(int i = 0; i<matrix.length ; i++){
            int counter = 0;
            for(int j:  matrix[i]){
                if (j==1) counter++;
            }
            result[i] = counter;
        }
        return result;
    }
}