
/*Given an array of integers that represents a single, large integer (no leading zeros),
* returns that number incremented by 1.
* If the last digit in the array is NOT a 9, simply incrementing the last digit in the array works.
* If the last digit IS a 9, then the last digit is set to 0, and the first non-9 digit is searched for
* in the array, converting any other 9s along the way to 0s. Once a non-9 digit is found, it is incremented
* by 1 and the array is returned. If the array contains only 9s, then a new array is created with a length of
* 1 more than the input array, and the first value in the array is set to 1.
*/


import java.util.Arrays;

public class Solution {

    public int[] plusOne(int[] digits) {
        int i = digits.length - 1; //The digit that is to be incremented within the array.


        //Basic case where the last digit in the array is not a 9. Simply add 1 to the last digit and return the array.
        if (digits[i] != 9) {
            digits[i]++;
            return digits;
        }

        for(int j = i; j >= 0; j--) {
            if(digits[j] != 9) {
                digits[j]++;
                return digits;
            } else {
                digits[j] = 0;
            }


        }
        /*If the loop was completed without digits being returned, then the array was ocmpletely full of 9s.
        * A new array must be created of length digits.length + 1 with a 1 at the front, and the remaining numbers
        * all 0s.*/
        int[] output = new int[i+2]; //i+2 since i is digits.length - 1.
        output[0] = 1;

        return output;
    }




    public static void main(String[] args) {
        Solution test = new Solution();
        int[] digits = {9};
        System.out.println(Arrays.toString(test.plusOne(digits)));


    }
}
