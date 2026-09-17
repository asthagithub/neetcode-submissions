class Solution {
    public int search(int[] nums, int target) {

        int middle = nums.length/2;
        if(nums[middle] == target){
            return middle;
        } else if (nums[middle] < target) {
            return binarysearch(middle+1, nums.length, nums, target);
        } else if (nums[middle] > target) {
            return binarysearch(0, middle, nums, target);
        }
        return -1;
    }

    public int binarysearch(int l, int r, int[] arr, int target) {

        for(int i = l; i < r; i++) {
            if(target == arr[i]) {
                return i;
            } else{
                continue;
            }
        }
        return -1;
    }
}
