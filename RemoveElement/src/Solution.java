public class Solution {
    public int removeElement(int[] nums, int val) {
        /*
        Moves all values in the array equal to "val" to the back of the array.
        Approach is to move all non-val integers to the front of the array, since
        it doesn't matter what's at the back of the array, and increment "nonValElements"
        each time a non-val integer is found.
         */


        int nonValElements = 0; //Represents the number of elements that are not equal to "val".
                                //Also represents the "front" of the array where non-val integers will be placed.

        for(int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[nonValElements] = nums[i];
                nonValElements++;
            }
        }
        return nonValElements;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        int[] nums = {1};
        System.out.println(test.removeElement(nums,1));

    }
}
