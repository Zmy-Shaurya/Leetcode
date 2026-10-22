class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        int j = nums.length;

        while (i < j) {
            int mid = i + (j - i) / 2;
            int val = nums[mid];

            if (val == target) {
                return mid;
            }
            if (target > val) {
                i = mid + 1;
            } else {
                j = mid;
            }
        }

        return i;
    }
}