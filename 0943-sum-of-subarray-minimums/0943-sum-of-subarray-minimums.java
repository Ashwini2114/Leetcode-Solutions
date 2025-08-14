class Solution {
    public int sumSubarrayMins(int[] arr) {
        int[] nse = findNSE(arr);
        int[] psee = findPSEE(arr);
        long total = 0;
        int mod = (int)(1e9 + 7);

        for(int i = 0; i < arr.length; i++)
        {
            long left = i - psee[i];
            long right = nse[i] - i;
            total = (total + (long)(right*left*arr[i])%mod)%mod;
        }
        return (int)total;
    }

    public int[] findNSE(int[] arr)
    {
        Stack<Integer> stack = new Stack<>();
        int[] nse = new int[arr.length];
        for(int i = nse.length -1; i >= 0; i--)
        {
            while(!stack.isEmpty() && (arr[stack.peek()] > arr[i]))
            {
                stack.pop();
            }
            nse[i] = stack.isEmpty() ? nse.length : stack.peek();
            stack.push(i);
        }
        return nse;
    }
    public int[] findPSEE(int[] arr)
    {
        Stack<Integer> stack = new Stack<>();
        int[] psee = new int[arr.length];
        for(int i = 0; i < psee.length; i++)
        {
            while(!stack.isEmpty() && (arr[stack.peek()] >= arr[i]))
            {
                stack.pop();
            }
            psee[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        return psee;
    }
}

