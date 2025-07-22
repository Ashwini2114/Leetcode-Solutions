class Solution {
    public int removeDuplicates(int[] nums) {
        int a = 0;
        for(int i = 1; i < nums.length; i++)
        {
            if( nums[i] != nums[a])
            {
                nums[a+1] = nums[i];
                a+=1;
            }
        }
        return a+1;
    }
}