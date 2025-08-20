class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] rearranged = new int[nums.length];
        int pos = 0;
        int neg = 1;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > 0)
            {
                rearranged[pos] = nums[i];
                pos+=2;
            }
            else
            {
                rearranged[neg] = nums[i];
                neg +=2;
            }
        }
        return rearranged;
    }
}