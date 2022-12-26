// Java program to find the missing integer
// in N numbers when N bits are given
import java.util.*;

class BitInteger {
    boolean[] bits;

    public static int INTEGER_SIZE = 32;

    public BitInteger()
    {
        bits = new boolean[INTEGER_SIZE];
    }

    // Constructor to convert an integer
    // variable into binary format
    public BitInteger(int value)
    {
        bits = new boolean[INTEGER_SIZE];

        for (int j = 0; j < INTEGER_SIZE; j++) {

            // The if statement will shift the
            // original value j times.
            // So that appropriate (INTEGER_SIZE - 1 -j)th
            // bits will be either 0/1.
            // (INTEGER_SIZE - 1 -j)th bit for all
            // j = 0 to INTEGER_SIZE-1 corresponds
            // to LSB to MSB respectively.
            if (((value >> j) & 1) == 1)
                bits[INTEGER_SIZE - 1 - j] = true;
            else
                bits[INTEGER_SIZE - 1 - j] = false;
        }
    }
    // Constructor to convert a
    // string into binary format.
    public BitInteger(String str)
    {
        int len = str.length();
        int x = INTEGER_SIZE - len;
        bits = new boolean[INTEGER_SIZE];

        // If len = 4. Then x = 32 - 4 = 28.
        // Hence iterate from
        // bit 28 to bit 32 and just
        // replicate the input string.
        int i = 0;

        for (int j = x; j <= INTEGER_SIZE && i < len;
             j++, i++) {
            if (str.charAt(i) == '1')
                bits[j] = true;
            else
                bits[j] = false;
        }
    }

    // this function fetches the kth bit
    int fetch(int k)
    {
        if (bits[k])
            return 1;

        return 0;
    }

    // this function will set a value
    // of bit indicated by k to given bitValue
    void set(int k, int bitValue)
    {
        if (bitValue == 0)
            bits[k] = false;
        else
            bits[k] = true;
    }

    // convert binary representation to integer
    int toInt()
    {
        int n = 0;
        for (int i = 0; i < INTEGER_SIZE; i++) {
            n = n << 1;
            if (bits[i])
                n = n | 1;
        }
        return n;
    }
};

class GFG {

    // Function to find the missing number
    static int findMissingFunc(ArrayList<BitInteger> myList,
                               int column)
    {
        // This means that we have processed
        // the entire 32 bit binary number.
        if (column < 0)
            return 0;

        ArrayList<BitInteger> oddIndices
                = new ArrayList<BitInteger>();
        ArrayList<BitInteger> evenIndices
                = new ArrayList<BitInteger>();

        for (BitInteger t : myList) {

            // Initially column = LSB. So
            // if LSB of the given number is 0,
            // then the number is even and
            // hence we add it to evenIndices list.
            // else if LSB = 0 then add it to oddIndices
            // list.
            if (t.fetch(column) == 0)
                evenIndices.add(t);
            else
                oddIndices.add(t);
        }

        // Step 1 and Step 2 of the algorithm.
        // Here we determine the LSB bit of missing number.

        if (oddIndices.size() >= evenIndices.size())

            // LSB of the missing number is 0.
            // Hence it is an even number.
            // Step 3 and 4 of the algorithm
            // (discarding all odd numbers)
            return (findMissingFunc(evenIndices,
                    column - 1))
                    << 1
                    | 0;

        else
            // LSB of the missing number is 1.
            // Hence it is an odd number.
            // Step 3 and 4 of the algorithm
            // (discarding all even numbers)
            return (findMissingFunc(oddIndices, column - 1))
                    << 1
                    | 1;
    }

    // Function to return the missing integer
    static int findMissing(ArrayList<BitInteger> myList)
    {
        // Initial call is with given array and LSB.
        return findMissingFunc(myList,
                BitInteger.INTEGER_SIZE - 1);
    }
    public static void main(String[] args)
    {
        // a corresponds to the input array which
        // is a list of binary numbers
        ArrayList<BitInteger> a
                = new ArrayList<BitInteger>();
        a.add(new BitInteger("0000"));
        a.add(new BitInteger("0001"));
        a.add(new BitInteger("0010"));
        a.add(new BitInteger("0100"));
        a.add(new BitInteger("0101"));
        int missing1 = findMissing(a);
        System.out.println(missing1);
    }
}

// This code is contributed by phasing17
