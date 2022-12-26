/* 724. Find Pivot Index
Calculates the "pivot index" of an input array of integers.
The pivot index is the index where strictly the numbers left
of the pivot sum to the same number as the numbers strictly to
the right of the pivot. If the pivot index does not exist, return -1.

Approach is to first calculate the "right sum" by summing the values
in the array from index 1 onward. Then, increment through the array and
add to the "left sum" while subtracting from the right sum. If the left sum
equals the right sum, return the current index.

Time: O(N)
Space: O(1)

 */


public class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length < 2) return 0; //Case of only 1 number or empty array
        int leftSum = 0;
        int rightSum = 0;

        for(int i = 1; i < nums.length; i++) {
            rightSum += nums[i];
        }

        if(leftSum == rightSum) return 0;

        for(int j = 1; j < nums.length; j++) {
            leftSum += nums[j-1];
            rightSum -= nums[j];

            if(leftSum == rightSum) return j;
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        int[] nums = {1,7,3,6,5,6};
        System.out.println(test.pivotIndex(nums));
    }
}
