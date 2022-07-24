public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();
        strs[0].indexOf()
        for(int i = 0; i < strs[0].length(); i++) { //Loops through the characters the first item
            for(int j = 0; j < strs.length - 1; j++) { //Loops through the strings in strs
                if (i >= strs[j].length() || i >= strs[j+1].length() || strs[j].charAt(i) != strs[j+1].charAt(i)) {
                    return prefix.toString();
                }
            }
            prefix.append(strs[0].charAt(i));
        }

        return prefix.toString();


    }

    public static void main(String[] args) {
        LongestCommonPrefix test = new LongestCommonPrefix();
        String[] strs = {"ab","a"};
        System.out.println(test.longestCommonPrefix(strs));
    }
}
