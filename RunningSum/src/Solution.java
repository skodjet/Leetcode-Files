/* Provides the running sum of an array of integers. Approach is to
add the previous number in the array to the current number.
Time: O(n)
Space: O(1)
 */
public class Solution {

    public int[] runningSum(int[] nums) {
        for(int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }
    return nums;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        int[] nums = {1,2,3,4};
        System.out.println(test.runningSum(nums));
    }
}
