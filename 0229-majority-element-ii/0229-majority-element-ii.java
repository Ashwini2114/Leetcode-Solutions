class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> countMap = new HashMap<>();
        int n = nums.length;

        for (int num : nums) {
            int count = countMap.getOrDefault(num, 0) + 1;
            countMap.put(num, count);
            
            if (count > n / 3 && !list.contains(num)) {
                list.add(num);
            }
        }

        return list;
    }
}