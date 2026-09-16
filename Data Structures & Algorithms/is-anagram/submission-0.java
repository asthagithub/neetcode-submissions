
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
            Map<Integer, Long> maps = s.chars().boxed().collect(Collectors.groupingBy(java.util.function.Function.identity(), Collectors.counting()));
            Map<Integer, Long> mapt = t.chars().boxed().collect(Collectors.groupingBy(java.util.function.Function.identity(), Collectors.counting()));
          
            if(maps.equals(mapt)) 
            return true;
            else 
            return false;
        }
    }

