import java.util.Arrays;
import java.util.HashMap;
public class Solution {
    public int[] twoSum(int[] nums, int target) {

        //Create a HashMap of all of the numbers in nums to their indices.
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            hash.put(nums[i], i);
        }

        //Check if each number in nums is a complement for any other number
        for(int j = 0; j < nums.length; j++) {

            //Found a match!
            if(hash.containsKey(target - nums[j]) && hash.get(target - nums[j]) != j) {
                int[] x = {j, hash.get(target - nums[j])};
                return x;

            }
        }

        return null;
        /*HashMap<Integer,Integer> complements = new HashMap<Integer,Integer>();

        for(int i = 0; i < nums.length; i++) {
            if(complements.containsKey(nums[i])) {
                return new int[] {complements.get(nums[i]),i};
            }
            complements.put(target - nums[i], i);
        }


        return nums;*/
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(Arrays.toString(test.twoSum(new int[]{3,2,4},6)));


    }
}
