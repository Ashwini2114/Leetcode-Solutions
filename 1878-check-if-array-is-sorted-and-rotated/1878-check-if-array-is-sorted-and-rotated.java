class Solution {
    public boolean check(int[] nums) {
        //Check if nums is sorted or not if yes then return true
        if(isSorted(nums))
        {
            return true;
        }
        int count = 0;
        //Check from which index you have to rotate so that array become sorted if possible
         for(int i = 0; i < nums.length-1; i++)
         {
            if(nums[i+1]<nums[i])
            {
                count=i+1;//From here nums is not sorted
                break;
            }
         }
         //Create a new array and rotate the nums from index you found earlier
         int[] answer = new int[nums.length];
         for(int i = 0; i < nums.length; i++)
         {
            answer[i] = nums[(i+count)%nums.length];
         }
         //Now check if answer is sorted or not
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