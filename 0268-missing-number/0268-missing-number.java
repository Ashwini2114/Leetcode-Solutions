class Solution {
    public int missingNumber(int[] nums) {
        // int n = nums.length;
        // int sum = n*(n+1)/2;
        // int s = 0;
        // for(int i = 0; i < nums.length; i++)
        // {
        //     s+=nums[i];
        // }
        // return sum - s;
        int xor1 = 0;
        int xor2 = 0;
        for(int i = 0; i < nums.length; i++)
        {
            xor1^=i;
            xor2^=nums[i];
        }
        xor1^=nums.length;
        return xor1^xor2;
    }
}