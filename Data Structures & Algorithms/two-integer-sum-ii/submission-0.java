class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int[] res = new int [2];
        int sum = 0;
        while (left < right) {
            sum = numbers[left] + numbers[right];
            if (target == sum ) {
                res[0] = left+1;
                res[1] = right+1;
                break;
            } else if (target > sum) {
                left++;
            } else {
                right--;
            }
        }
        return res;
    }
}
