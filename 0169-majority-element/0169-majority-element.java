class Solution {
    public int majorityElement(int[] nums) {

        // Initialize count = 0 and candidate = 0.
        // Traverse the array:
        // If count == 0, set candidate = current element.
        // If current element == candidate, increment count.
        // Else, decrement count.
        // At the end, candidate will be the majority element.
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;


        //2nd Approach
        // Arrays.sort(nums);
        // return nums[nums.length/2];

        //3rd Approach
        // Map<Integer, Integer> countMap = new HashMap<>();
        // int n = nums.length;

        // for (int num : nums) {
        //     int count = countMap.getOrDefault(num, 0) + 1;
        //     countMap.put(num, count);
            
        //     if (count > n / 2) {
        //         return num;
        //     }
        // }

        // return -1;
    }
}