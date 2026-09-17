class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder strBuilder = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(Character.isLetterOrDigit(c)){
                strBuilder.append(Character.toLowerCase(c));
            }
        }
        String original = strBuilder.toString();
        String reverse = strBuilder.reverse().toString();
        return original.equals(reverse) ? true : false;
    }
}
