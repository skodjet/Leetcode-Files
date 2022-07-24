public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int input = x;

        if (x < 0 || ((x != 0) && (x % 10 == 0))) {
            return false;
        }

        int rev = 0; //Reversed value of x

        while (x > 0) { //Compare the first half of the number to the second half.4
            rev = (rev * 10) + (x % 10);
            x /= 10;
        }

        if (rev == input) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        PalindromeNumber test = new PalindromeNumber();
        int x = 12321;
        System.out.println(test.isPalindrome(x));

    }
}
