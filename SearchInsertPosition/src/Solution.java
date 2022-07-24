public class Solution {

    /*Returns the index of an integer, "target" within a sorted array of integers, "nums."
    * If "target" does not exist within "nums," the program instead returns the appropriate
    * index where "target" would have been inserted within "nums."
    *
    * Approach to solving this problem is to use binary search. Start searching at the middle
    * of "nums." If "target" is less than this value, search the left side of "nums." If "target"
    * is greater than this value, search the right side of "nums." Continue until "target" is found
    * or indices to search run out.*/
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while(low <= high) {
            int i = low + (high - low) / 2;

            if(nums[i] == target) return i;
            if(nums[i] > target) high = i - 1;
            if(nums[i] < target) low = i + 1;
        }
        return low; // Returns low instead of high because high could be -1 if target is
                    // less than the minimum value in nums.

    }

    public static void main(String[] args) {
        Solution test = new Solution();
        int nums[] = {1,3,5,6};
        int target = 7;

        System.out.println(test.searchInsert(nums,target));


    }

}
