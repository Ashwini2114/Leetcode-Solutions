class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>stack = new Stack<>();

        for( int a : asteroids)
        {
            boolean positive = true;
            //Only checks collisions when a negative asteroid meets a positive one.
            while(positive && a < 0 && !stack.isEmpty() && stack.peek() > 0)
            {
                if(stack.peek() < -a)
                {
                    stack.pop();
                }
                else if(stack.peek() == -a)
                {
                    stack.pop();
                    positive = false;
                }
                else
                {
                    positive = false;
                }
            }
            if(positive)
            {
                stack.push(a);
            }
        }
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }
}