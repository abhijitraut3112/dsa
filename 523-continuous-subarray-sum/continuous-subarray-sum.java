class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
     // remainder -> first index where we saw it
    HashMap<Integer, Integer> map = new HashMap<>();

    // Important:
    // remainder 0 exists before the array starts
    map.put(0, -1);

    int sum = 0;

    for (int i = 0; i < nums.length; i++) {

        // Prefix sum
        sum += nums[i];

        // Get remainder
        int remainder = sum % k;

        // Have we seen this remainder before?
        if (map.containsKey(remainder)) {

            int previousIndex = map.get(remainder);

            // We need at least 2 elements
            if (i - previousIndex >= 2) {
                return true;
            }

        } else {

            // First time seeing this remainder
            map.put(remainder, i);
        }
    }

    return false;
}
}