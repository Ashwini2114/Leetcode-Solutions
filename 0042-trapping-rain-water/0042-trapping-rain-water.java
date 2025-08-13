class Solution {
    public int trap(int[] height) {
        int lMax = 0;
        int rMax = 0;
        int total = 0;
        int l = 0;
        int r = height.length-1;
        while(l < r)
        {
            if(height[l] <= height[r])
            {
                if(lMax > height[l])
                {
                    total+=lMax-height[l];
                }
                else
                {
                    lMax = height[l];
                }
                l = l + 1;
            }
            else
            {
                if(rMax > height[r])
                {
                    total += rMax - height[r];
                }
                else
                {
                    rMax = height[r];
                }
                r = r -1;
            }
        }
        return total;
    }
}



// int[] prefix = new int[height.length];
//         prefix[0] = height[0];
//         for(int i = 1; i < prefix.length; i++)
//         {
//             prefix[i] = Math.max(prefix[i-1], height[i]);
//         }
//         int[] suffix = new int[height.length];
//         suffix[height.length-1] = height[height.length-1];
//         for(int i = height.length-2; i >= 0; i--)
//         {
//             suffix[i] = Math.max(suffix[i+1], height[i]);
//         }
//         int total = 0;
//         for(int i = 0; i < height.length; i++)
//         {
//             if(height[i] < prefix[i] && height[i] < suffix[i])
//             {
//                 total += Math.min(prefix[i], suffix[i]) - height[i];
//             }
//         }
//         return total;