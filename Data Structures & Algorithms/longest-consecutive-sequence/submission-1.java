class Solution {
    public int longestConsecutive(int[] nums) {
        List<Integer> numbers = Arrays.stream(nums).boxed().toList();
        Set<Integer> sortedDistinct = new HashSet<>();
        
        sortedDistinct = numbers.stream().collect(java.util.stream.Collectors.toSet());

        int longest=0;
        for(Integer i : sortedDistinct) {
            int current = i;
            int count=0;
             if (!sortedDistinct.contains(i - 1)) {

            while(sortedDistinct.contains(current)){
                current++;
                count++;
            }
            longest = Math.max(longest, count);
        }
        }
return longest;
    }
}
