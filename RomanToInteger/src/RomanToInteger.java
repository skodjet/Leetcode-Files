import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RomanToInteger {

    public int romanToInt(String s) {
        int output = 0;
        HashMap<Character,Integer> RomanMap = new HashMap<>();
        RomanMap.put('I',1);
        RomanMap.put('V',5);
        RomanMap.put('X',10);
        RomanMap.put('L',50);
        RomanMap.put('C',100);
        RomanMap.put('D',500);
        RomanMap.put('M',1000);


        for (int i = 0; i < s.length(); i++) {
            output += RomanMap.get(s.charAt(i));

            if(i >= 1) {
                if (RomanMap.get(s.charAt(i-1)) < RomanMap.get(s.charAt(i))) {
                    output -= 2 * RomanMap.get(s.charAt(i-1));
                }
            }
        }


        return output;
    }


    public static void main(String[] args) {
        RomanToInteger test = new RomanToInteger();
        System.out.println(test.romanToInt("I"));

    }
}
