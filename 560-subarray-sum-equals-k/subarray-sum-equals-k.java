class Solution {
    public int subarraySum(int[] nums, int k) {
         HashMap<Integer, Integer> map = new HashMap<>();

        // Prefix sum 0 has occurred once
        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {
            prefixSum += num;

            // Check if there is a previous prefix sum
            // such that currentPrefixSum - previousPrefixSum = k
            int required = prefixSum - k;

            if (map.containsKey(required)) {
                count += map.get(required);
            }

            // Store current prefix sum
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
        
    }
}