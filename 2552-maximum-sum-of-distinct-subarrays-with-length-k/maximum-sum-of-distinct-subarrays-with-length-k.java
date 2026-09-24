class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int left =0;
        long curSum =0;
        long maxSum =0;

        Set<Integer> set = new HashSet<>();

        for(int right =0; right<nums.length; right++){

            while(set.contains(nums[right]) || set.size() == k){
                set.remove(nums[left]);
                curSum -= nums[left];
                left++;
            }



            //adding the right into set and calculate the max sum
            curSum += nums[right];
            set.add(nums[right]);
            if(set.size() == k ){
                maxSum = Math.max(curSum ,maxSum);
            }



        }

        return maxSum;


        
    }
}