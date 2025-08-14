class Solution {
    public int maximalRectangle(char[][] matrix) {
        //We should check if the matrix is empty 
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
        {
            return 0;
        }
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] pSum = new int[n][m];
        int maxArea = 0;
        for(int j = 0; j < m; j++)
        {
            int sum = 0;
            for(int i = 0; i < n; i++)
            {
                sum += matrix[i][j] == '1' ? 1 : 0;
                if (matrix[i][j] == '0')
                {
                    sum = 0;
                }
                pSum[i][j] = sum;
            }
        }

        for(int i = 0; i < pSum.length; i++)
        {
            maxArea = Math.max(maxArea, largestRectangleArea(pSum[i]));
        }
        return maxArea;
    }

    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        for(int i = 0; i < heights.length; i++)
        {
            while(!stack.isEmpty() && heights[stack.peek()] > heights[i])
            {
                int element = stack.peek();
                stack.pop();
                int nse = i;
                int pse = stack.isEmpty() ? -1 : stack.peek();
                maxArea = Math.max(heights[element] * (nse - pse - 1), maxArea);
            }
            stack.push(i);
        }
        while(!stack.isEmpty())
        {
            int nse = heights.length;
            int element = stack.peek();
            stack.pop(); 
            int pse = stack.isEmpty() ? -1 : stack.peek();
            maxArea = Math.max(heights[element] * (nse - pse - 1), maxArea);
        }
        return maxArea;
    }
}