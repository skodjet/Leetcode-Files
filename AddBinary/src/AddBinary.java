public class AddBinary {

    public String addBinary(String a, String b) {
        StringBuilder output = new StringBuilder(); //Will store the output string
        int currentAIndex = a.length()-1;
        int currentBIndex = b.length()-1;
        int carry = 0;
        int sum = 0;

        while (currentAIndex >= 0 || currentBIndex >= 0) {
            sum = carry;
            if (currentAIndex >= 0) sum += a.charAt(currentAIndex) - '0';; //The - '0' converts the character to an integer.
            if (currentBIndex >= 0) sum += b.charAt(currentBIndex) - '0';

            output.append(sum % 2); //Appends 0 in the 1+1 and 0+0 cases. Appends 1 in the 1+0 case.
            carry = sum / 2; //Set to 1 only in the 1+1 case.

            currentAIndex--;
            currentBIndex--;
        }

        if (carry != 0) {
            output.append(carry);
        }



        return output.reverse().toString();
    }

    public static void main(String[] args) {
        AddBinary test = new AddBinary();
        String a = "1";
        String b = "1011";

        System.out.println(test.addBinary(a,b));


    }
}
