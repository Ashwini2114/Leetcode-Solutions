class Solution {
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
