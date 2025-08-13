class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[nums.length];
        for(int i = 2*nums.length-1; i >=0; i--)
        {
            while(!stack.isEmpty() && stack.peek() <= nums[i%nums.length])
            {
                stack.pop();
            }
            if(i < nums.length)
            {
                answer[i] = stack.isEmpty() ? -1 : stack.peek();
            }
            stack.push(nums[i%nums.length]);
        }
        return answer;
    }
}

// int[] answer = new int[nums.length];
//         for(int i = 0; i < nums.length; i++)
//         {
//             for(int j = i+1; j <= i+nums.length; j++)
//             {
//                 int index = j%nums.length;
//                 if(nums[index] > nums[i])
//                 {
//                     answer[i] = nums[index];
//                     break;
//                 }
//                 else
//                 {
//                     answer[i] = -1;
//                 }   
//             }
//         }
//         return answer;