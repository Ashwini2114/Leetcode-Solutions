class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        //Transpose T.C - 0(n/2 * n/2)
        for(int i = 0; i < n-1; i++)
        {
            for(int j = i+1; j < n; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //Reverse T.C - 0(n * n/2)
        for(int i = 0; i < n; i++)
        {
            reverse(matrix[i]);
        }
    }

    public void reverse(int[] matrixRow)
    {
        int start = 0;
        int end = matrixRow.length-1;
        while(start <= end)
        {
            int temp = matrixRow[start];
            matrixRow[start] = matrixRow[end];
            matrixRow[end] = temp;
            start++;
            end--;
        }
    }
}