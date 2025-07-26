class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        // for(int i = 0; i < nums.length; i++)
        // {
        //    int sum = 0;
        //    for(int j = i; j < nums.length; j++)
        //    {
        //        sum+=nums[j];
        //        if(sum == k)
        //        {
        //            count += 1;
        //        }
        //    }
        // }
        // return count;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            //Instead of it add (0,1) in map beforehand
            // if (sum == k) {
            //     count+=1;
            // }

            if (map.containsKey(sum - k)) {
                count+=map.get(sum-k);
            }

            // To store all the occurence of sum 
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}