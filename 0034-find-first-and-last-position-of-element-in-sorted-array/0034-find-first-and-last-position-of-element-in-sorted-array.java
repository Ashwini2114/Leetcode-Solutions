class Solution {
    public int[] searchRange(int[] nums, int target) {
        // int lb = lowerBound(nums,target);
        // if(lb == nums.length || nums[lb] != target) return new int[]{-1, -1};
        // return new int[]{lb, upperBound(nums,target)-1};

        int first = firstOccurence(nums, target);
        if(first == -1) return new int[]{-1, -1};
        return new int[] {first, lastOccurence(nums, target)};
    }
    public int firstOccurence(int[] nums, int x)
    {
        int low = 0;
        int high = nums.length-1;
        int first = -1;
        while(low <= high)
        {
            int mid = (low+high)/2;
            if(nums[mid] == x)
            {
                first = mid;
                high = mid-1;
            }
            else if(nums[mid] < x) low = mid+1;
            else high = mid-1;
        }
        return first;
    }
    public int lastOccurence(int[] nums, int x)
    {
        int low = 0;
        int high = nums.length-1;
        int last = -1;
        while(low <= high)
        {
            int mid = (low+high)/2;
            if(nums[mid] == x)
            {
                last = mid;
                low = mid+1;
            }
            else if(nums[mid] < x) low = mid+1;
            else high = mid-1;
        }
        return last;
    }
}
    // public int lowerBound(int[] nums, int x)
    // {
    //     int low = 0;
    //     int high = nums.length-1;
    //     int lb = nums.length;
    //     while(low <= high)
    //     {
    //         int mid = (low+high)/2;
    //         if(nums[mid] >= x)
    //         {
    //             lb = mid;
    //             high = mid-1;
    //         }
    //         else
    //         {
    //             low = mid+1;
    //         }
    //     }
    //     return lb;
    // }
    // public int upperBound(int[] nums, int x)
    // {
    //     int low = 0;
    //     int high = nums.length-1;
    //     int ub = nums.length;
    //     while(low <= high)
    //     {
    //         int mid = (low+high)/2;
    //         if(nums[mid] > x)
    //         {
    //             ub = mid;
    //             high = mid-1;
    //         }
    //         else
    //         {
    //             low = mid+1;
    //         }
    //     }
    //     return ub;
    // }