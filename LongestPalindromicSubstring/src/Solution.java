public class Solution {


    public String longestPalindrome(String s) {


        int longestEven = 0; //The longest palindrome with an even length
        int evenStart = 0;
        int evenEnd = 0;

        int longestOdd = 0;  //The longest palindrome with an odd length
        int oddStart = 0;
        int oddEnd = 0;

        //Check for odd length palindromic substrings.
        for(int i = 0; i < s.length(); i++) {
            int left = i;
            int right = i;
            while(left >= 0 && right < s.length()) {
                if(s.charAt(left) != s.charAt(right)) break;
                left--;
                right++;
            }

            if((right - left) - 1 > longestOdd) {
                longestOdd = (right - left) - 1;
                oddStart = left + 1;
                oddEnd = right - 1;
            }
        }

        //Check for even length palindromic substrings.
        for(int j = 0; j < s.length(); j++) {
            int left = j;
            int right = j + 1;
            while(left >= 0 && right < s.length()) {
                if(s.charAt(left) != s.charAt(right)) break;
                left--;
                right++;
            }
            if((right - left) - 1 > longestEven) {
                longestEven = (right - left) - 1;
                evenStart = left + 1;
                evenEnd = right - 1;
            }
        }

        //Return the longer of the two longest palindromes
        if(longestEven >= longestOdd) {
            return s.substring(evenStart, evenEnd + 1);
        } else {
            return s.substring(oddStart, oddEnd + 1);
        }


    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.longestPalindrome("abba"));
    }
}
