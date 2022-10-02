package org.example.Java8;


/*
* In Java, numbers are encoded using the two's complement system
*The addition, subtraction, and multiplication operations can work with unsigned
* numbers without requiring any changes in the JDK. Other operations, such as
* comparison or division, handle signed and unsigned numbers
* differently.

This is where the Unsigned Integer API comes into play.
*
*
*MAX_VALUE -> 0111_1111_…_1111
MIN_VALUE -> 1000_0000_…_0000
When the left-most bit is a regular value bit,
*  MIN_VALUE is one unit larger than MAX_VALUE in the binary system.
*
*
* parseUnsignedInt method can parse a string indicating a number
*  larger than MAX_VALUE, but will fail to parse any negative representation
*
*First, there are cases for which a negative value can never occur,
* and using an unsigned type can prevent such a value in the first place.
*  Second, with an unsigned type, we can double
* the range of usable positive values compared to its signed counterpart.
*
*
*
* The other reason for unsigned numbers is the expansion of the value space.
*  However, if the range of a signed type isn't enough, it's unlikely that
*  a doubled range would suffice.

In case a data type isn't large enough,
* we need to use another data type that supports much larger values,
*  such as using long instead of int, or BigInteger rather than long.

Another problem with the Unsigned Integer API is that the binary form of a
*  number is the same regardless of whether it's signed or unsigned.
*  It's therefore easy to mix signed and unsigned values, which may lead to unexpected results.


* */
public class Unsigned_Arithmetic {
    public static void main(String[] args) {
        int positive = Integer.MAX_VALUE;
        int negative = Integer.MIN_VALUE;
        int signedComparison = Integer.compare(positive, negative);
        assertEquals(1, signedComparison);

        int unsignedComparison = Integer.compareUnsigned(positive, negative);
        assertEquals(-1, unsignedComparison);


        System.out.println("__________________________________________________");

        int positive2 = Integer.MAX_VALUE;
        int negative2 = Integer.MIN_VALUE;

        assertEquals(-1, negative2 / positive2);
        assertEquals(1, Integer.divideUnsigned(negative2, positive2));
        System.out.println("__________________________________________________");


        assertEquals(-1, negative2 % positive2);
        assertEquals(1, Integer.remainderUnsigned(negative2, positive2));

        System.out.println("__________________________________________________");


        String signedString = Integer.toString(Integer.MIN_VALUE);
        assertEquals3("-2147483648", signedString);

        String unsignedString = Integer.toUnsignedString(Integer.MIN_VALUE);
        assertEquals3("2147483648", unsignedString);

    }

    private static void assertEquals3(String s, String unsignedString) {
        if (s== unsignedString) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    private static void assertEquals(int i, int signedComparison) {
        if (1 == signedComparison) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
