import java.util.Arrays;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        int[] indicesOfSolution = new int[2];

        for(int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indicesOfSolution[0] = i;
                    indicesOfSolution[1] = j;
                    return indicesOfSolution;
                }
            }
        }
        return indicesOfSolution;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        TwoSum test = new TwoSum();

        System.out.println(Arrays.toString(test.twoSum(nums,6)));

    }
}
