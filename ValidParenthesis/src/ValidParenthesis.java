import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {

        if (s.length() % 2 == 1) return false; //Expression can't be valid if the length of s is odd. (It will have an unclosed parenthesis).


        Deque<Character> parentheses = new LinkedList<>();

        char currentChar;
        char lastOpenParenthesis;

        for(int i = 0; i < s.length(); i++) {
            currentChar = s.charAt(i);
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                parentheses.add(s.charAt(i));
            } else { //For if the character is a closed parenthesis.
                if (parentheses.isEmpty()) return false; //Can't have a closed parenthesis before an open parenthesis
                lastOpenParenthesis = parentheses.removeLast();
                switch(currentChar) {

                    case ')':
                        if (lastOpenParenthesis != '(') return false;
                        break;
                    case ']':
                        if (lastOpenParenthesis != '[') return false;
                        break;
                    case '}':
                        if (lastOpenParenthesis != '{') return false;
                        break;
                }
            }
        }

        if (parentheses.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        ValidParenthesis test = new ValidParenthesis();
        String s = "(){}}{";
        System.out.println(test.isValid(s));

    }

}
