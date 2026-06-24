class Solution {
    public String longestCommonPrefix(String[] strs) {
         Arrays.sort(strs);
         String first = strs[0];
         String last = strs[strs.length-1];
         int counter = 0;

         while(counter<first.length()){
            if(first.charAt(counter)==last.charAt(counter)){
                counter++;
            }
            else
            {
                break;
            }
         }
         return counter==0?"":first.substring(0,counter);
    }
}