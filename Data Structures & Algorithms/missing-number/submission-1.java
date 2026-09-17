class Solution {
    public int missingNumber(int[] nums) {
        
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length-1];
        for (int i = 0 ; i < nums.length; i++) {
            if(i!=nums[i]){
                return i;
            }
        }
        return nums.length;
    }
}
