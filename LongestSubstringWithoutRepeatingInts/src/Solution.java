import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0; //Start of substring pointer
        int j = 0; //End of substring pointer
        int maxSubstringLength = 0; //The length of the longest substring so far
        HashSet letters = new HashSet<Character>();


        for(j = 0; j < s.length(); ++j) {
            if(!letters.contains(s.charAt(j))) {
                letters.add(s.charAt(j));
                maxSubstringLength = Math.max(letters.size(), maxSubstringLength);
            } else { //Duplicate letter found!
                letters.remove(s.charAt(i));
                i++;
            }
        }

        return maxSubstringLength;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        String s = "qrsvbspk";

        System.out.println(test.lengthOfLongestSubstring(s));
    }
}