class Solution {
    public int search(int[] nums, int target) {

 // Step 1: Find the pivot (minimum element index)
        int pivot = findPivot(nums);

        // Step 2: If the array is not rotated
        if (pivot == 0) {
            return Binarysearch(nums, target, 0, nums.length - 1);
        }

        // Step 3: Check which sorted part contains target
        if (target >= nums[0]) {
            return Binarysearch(nums, target, 0, pivot - 1);
        } else {
            return Binarysearch(nums, target, pivot, nums.length - 1);
        }
        
    }

     public int findPivot(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }


     public int Binarysearch(int[] nums, int target, int start,int end) {

        while(start <= end ){

            int mid = start + (end-start)/2;

            if(nums[mid] == target){
                return mid;
            }else if (nums[mid] < target){
                start= mid+1;
            }else{
                end = mid-1;
            }

        }

        return -1;
        
    }


}