// class Solution {
//     public boolean isZeroArray(int[] nums, int[][] queries) {
//         for(int i = 0; i < queries.length; i++)
//         {
//             for(int j = queries[i][0]; j <= queries[i][1]; j++)
//             {
//                 if(nums[j] == 0)
//                     nums[j] = nums[j];
//                 else
//                     nums[j] = nums[j]-1;
//             }
//         }
//         for(int num : nums)
//         {
//             if(num != 0)
//             {
//                 return false;
//             }
//         }
//         return true;
//     }
// }
class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] diff = new int[n + 1];

        // Apply range updates efficiently using difference array
        for (int[] query : queries) {
            int l = query[0];
            int r = query[1];
            diff[l] += 1;
            if (r + 1 < n) {
                diff[r + 1] -= 1;
            }
        }

        // Apply prefix sum to get the actual number of operations on each index
        int operations = 0;
        for (int i = 0; i < n; i++) {
            operations += diff[i];
            if (operations < nums[i]) {
                return false;
            }
        }

        return true;
    }
}
