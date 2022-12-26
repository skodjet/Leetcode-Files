/* 70. Climbing Stairs.
 * "You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?"
 * The number of distinct ways to climb n steps is the nth number in the fibonacci sequence.
 * So we need to calculate each value of the fibonacci sequence for each step. Using a recursive
 * approach to do this takes too long, so we will use a dynamic programming approach.
 *
 */

public class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1]; //The size is n+1 because we will leave index 0 empty.
        dp[1] = 1;
        if(n != 1) dp[2] = 2;

        for(int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];


    }

    public static void main(String[] args) {
        Solution test = new Solution();
        int n = 3;
        System.out.println(test.climbStairs(n));
    }
}
