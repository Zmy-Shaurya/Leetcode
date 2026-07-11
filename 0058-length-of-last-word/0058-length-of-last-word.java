class Solution {
    public int lengthOfLastWord(String s) {
        s.trim();
        String[] arr = s.split(" ");
        String last="";
        for(String string : arr){
            if(string=="") continue;
            last = string;
        }
        return last.length();
    }
}