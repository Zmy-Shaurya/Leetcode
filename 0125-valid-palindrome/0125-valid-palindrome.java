class Solution {
    public boolean isPalindrome(String s) {
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c : arr){
            if(Character.isLetter(c) || Character.isDigit(c)) sb.append(Character.toString(c));
        }
        if(sb.toString().toLowerCase().equals(sb.reverse().toString().toLowerCase())) return true;
        return false;
        
    }
}