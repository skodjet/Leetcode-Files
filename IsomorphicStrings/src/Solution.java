/* 205. Isomorphic Strings.
"Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters.
No two characters may map to the same character, but a character may map to itself."

Approach is to use a hashmap to store the values of what each character in the string "s" maps to in the string "t".
When adding a new character to the hashmap, check to see if that value is not already used.
When a character of "s" already exists as a key within the hashmap, then check to see if the corresponding character in
"t" matches with the value that the character in "s" maps to within the hashmap.
If either of these checks fails at any point, return false. If the entire string is iterated through without either of
the checks failing, return true.

Time: O(N)
Space: O(N) (hashmap)

 */

import java.util.HashMap;

public class Solution {

    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> isomorph = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            if(!isomorph.containsKey(s.charAt(i))) {
                if(isomorph.containsValue(t.charAt(i))) return false;
                isomorph.put(s.charAt(i),t.charAt(i));
            }
            else { //Case for if the hashmap already contains the current character being looked at.
                if(isomorph.get(s.charAt(i)) != t.charAt(i)) return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        Solution test = new Solution();
        String s = "badc";
        String t = "baba";

        System.out.println(test.isIsomorphic(s,t));

    }
}
