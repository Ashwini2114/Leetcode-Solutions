class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0;
        int bottom = m-1;
        int left = 0;
        int right = n-1;
        //Right
        while(left <= right && top <= bottom)
        {

            for(int i = left; i <= right;i++)
            {
                list.add(matrix[top][i]);
            }
            top++;
            //Bottom
            for(int i = top; i <= bottom; i++)
            {
                list.add(matrix[i][right]);
            }
            right--;
            //left
            if(top <= bottom)
            { 
                for(int i = right; i >= left; i--)
                {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            //top
            if(left <= right)
            {
                for(int i = bottom; i >= top; i--)
                {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}
//Time complexity - 0(m*n)
//Space complexity - 0(m*n) --> For storing the answer
