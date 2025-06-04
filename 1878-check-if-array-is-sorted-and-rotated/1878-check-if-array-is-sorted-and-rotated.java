class Solution {
    public boolean check(int[] nums) {
        if(isSorted(nums))
        {
            return true;
        }
        int count = 0;
         for(int i = 0; i < nums.length-1; i++)
         {
            if(nums[i+1]<nums[i])
            {
                count=i+1;
                break;
            }
         }
         int[] answer = new int[nums.length];
         for(int i = 0; i < nums.length; i++)
         {
            answer[i] = nums[(i+count)%nums.length];
         }
         return isSorted(answer);
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}