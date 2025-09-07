class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans = nums.length;
        int start = 0;
        int end = nums.length -1;    
        while(start <= end)
        {
             int mid = start + (end-start)/2;
             if(nums[mid] >= target)
             {
                 ans = mid;
                 end = mid-1;
             }
             else start = mid+1;
        }
        return ans;
    }
}
        // int i = 0;
        // while(i<nums.length && nums[i]<=target)
        // {
        //     if(nums[i] == target)
        //     {
        //         return i;
        //     }
        //     i++;
        // }
        // return i;