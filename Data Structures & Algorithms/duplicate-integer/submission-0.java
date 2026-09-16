class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> wrapperArray = Arrays.stream(nums)
                           .boxed() // Converts int to Integer
                           .collect(Collectors.toList());
        HashSet set = new HashSet<>();
        List<Integer> duplicate = wrapperArray.stream().filter(n-> !set.add(n)).collect(Collectors.toList());

        if(duplicate.size() > 0){
            return true;
        } else{
            return false;
        }
        
    }
}