class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a =0;
        int b=0;
        int[] result = {0,0};
        for (int i =0; i< nums.length-1;   i++) {
            a = nums[i];
            for(int j=i+1; j<nums.length; j++) {
                b = nums[j];
                if(a+b == target) {
                 result[0] = i;
                 result[1] = j;
                } else {
                    continue;
                }
            }
        }
        return result;
    }
}
