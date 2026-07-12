class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] result = new int[arr.length];
        int[] sorted = Arrays.copyOf(arr,arr.length);
        Arrays.sort(sorted);
        Map<Integer, Integer> rank = new HashMap<>();
        int r = 1;
        for(int i : sorted){
            if(!rank.containsKey(i)){
                rank.put(i,r++);
            }
        }
        for(int i = 0; i<arr.length ; i++){
            result[i] = rank.get(arr[i]);
        }

        return result;
    }
}