/*58. Length of Last Word.
 * Finds the length of the last word in a string, with the string containing only
 * English letters and spaces. The approach is to search backwards through the string,
 * and when the first non-space character is found, increment the return value until a
 * space character is found or the beginning of the string is reached.
 * Time: O(N)
 * Space: O(1)
 */

public class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0; //Output value (length of last word)

        for(int i = s.length() - 1; i >= 0; i--) { //Search for the first non-space character.
            if(s.charAt(i) != ' ') {
                length++;
                for(int j = i - 1; j >= 0; j--) { //Once a non-space character is found, continue until another space is found.
                    if(s.charAt(j) == ' ') return length;
                    length++;
                }
                return length;
            }
        }

        return length;
    }

    public static void main(String[] args) {

        Solution test = new Solution();
        String s = "day";
        System.out.println(test.lengthOfLastWord(s));
    }
}
