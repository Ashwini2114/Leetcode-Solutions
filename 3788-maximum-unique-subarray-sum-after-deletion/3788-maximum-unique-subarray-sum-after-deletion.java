import java.util.HashSet;
class Solution {
    public int maxSum(int[] nums) {
        int maxSum = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++)
        {
            set.add(nums[i]);
        }
        if(Collections.max(set)<0)
        {
            return Collections.max(set);
        }
        for (int num : set) {
            maxSum = Math.max(maxSum, maxSum+num);
        }
        return maxSum;
    }
}