class Solution {
    public int maximumDifference(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = nums.length-1; j >= 0; j--)
            {
                if(nums[j] - nums[i] > max && i < j)
                {
                    max = nums[j] - nums[i];
                }
            }
        }
        if(max <= 0)
        {
            return -1;
        }
        return max;
    }
}