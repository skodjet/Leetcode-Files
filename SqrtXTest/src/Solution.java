/*Computes the square root of a given integer without the use of the pow function. Since
 * the return type of the function is an integer, decimals of the return value are truncated.*/


//NOTE: For calculating mid, use low + (high - low) / 2
public class Solution {
    public int mySqrt(int x) {
        if(x < 2) return x;

        int low = 1;
        int high = x / 2;
        while(high >= low) {
            int mid = low + (high - low) / 2;
            if(x / mid == mid) return mid; //Found the square root!
            if(x / mid < mid) high = mid - 1;//Search the left half
            if(x / mid > mid) low = mid + 1;//Search the right half
        }
        if(low * low > x || low * low < 0) return high; //The or condition protects against integer overflow.
        else return low;
    }


    public static void main(String[] args) {
        Solution test = new Solution();
        int x = Integer.MAX_VALUE;
        System.out.println(test.mySqrt(x));
    }
}
