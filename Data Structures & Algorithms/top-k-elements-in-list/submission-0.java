
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());

        Map<Integer, Long> map = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.groupingBy(java.util.function.Function.identity(), Collectors.counting()));
       
       return map.entrySet()
        .stream()
        .sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
        .limit(k)
        .mapToInt(Map.Entry::getKey)
        .toArray();
    }

}
