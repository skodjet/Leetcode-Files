/*Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of
the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of
"abcde" while "aec" is not).

*/


public class Solution {

    public boolean isSubsequence(String s, String t) {
        int i = 0; //Pointer for s
        for(int j = 0; j < t.length(); j++) { //j is the pointer for t
            if(i >= s.length()) return true; //Matches have been found for all characters in s.
            if(s.charAt(i) == t.charAt(j)) i++; //If there is a match, increment both pointers and keep going.
            //If there's no match, just increment the pointer for t (done within the for loop)
        }
        if(i >= s.length()) return true;
        return false;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        String s = "abc";
        String t = "ahbgdc";

        System.out.println(test.isSubsequence(s,t));

    }
}
