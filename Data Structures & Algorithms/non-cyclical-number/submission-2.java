class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        while (n != 1 && !set.contains(n)) {
            set.add(n);
            n = sqSum(n);
        }

        return n == 1;
    }

    public int sqSum(int n){
        int sum = 0;
         while (n > 0) {
            int rem = n%10;
            n = n/10;
            sum = sum + (rem * rem);
        }
        return sum;
    }
}
