public class Solution {


    /*Finds the first occurrence of the substring "needle" in the
     string "haystack." The approach to solving this problem is to
     first search "haystack" for the first letter in "needle," and then
     compare the subsequent letters in "haystack" to the rest of "needle."
     If they match, return the index of where the substring started in "haystack."
     If the patterns do not match, break and continue searching from where the
     "needle" started.

     If "needle" does not exist within "haystack," returns -1.

     If "needle" is empty, returns 0.
     */


    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;


        int j; //Pointer for characters in haystack
        int k; //Pointer for characters in needle


        //The last possible position that the needle could be in is at
        //index haystack.length() - needle.length()
        for(int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                //If the characters match, check the rest of needle against the next characters in haystack.
                j = i;
                for(k = 1; k < needle.length(); k++) {
                    j++;
                    if(haystack.charAt(j) != needle.charAt(k)) break;
                }


                if(k == needle.length()) return i;

            }

        }

        return -1;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        String haystack = "abc";
        String needle = "c";


        System.out.println(test.strStr(haystack,needle));

    }
}
