public class BitAssign {
    public static void main(String[] args) {
        // QUESTION 1
        int x = 12; // 1100 in binary
        int result = x ^ x; // XOR operation
        System.out.println("The result of x^x is: " + result); // Output will be 0

        // QUESTION 2 - SWAP 2 NUMBERS WITHOUT USING 3RD VARIABLE
        int a = 5;
        int b = 10;
        swap(a, b);

        // QUESTION 3 - ADD 1 TO ANY INTERGER USING BITWISE "NOT" OPERATOR
        int n = 5;
        int addedOne = addOne(n);
        System.out.println("The result of adding 1 to " + n + " is: " + addedOne);

        // QUESTION 4 - UPPERCASE TO LOWERCASE
        for (int ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char) (ch | ' '));

        }
    }

    // QUESTION 1
    // The value of x^x is always 0 - example
    // 1100
    // ^1100
    // ______
    // 0000

    // QUESTION 2 - SWAP 2 NUMBERS WITHOUT USING 3RD VARIABLE
    public static void swap(int a, int b) {
        System.out.println("Before swap: a = " + a + ", b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swap: a = " + a + ", b = " + b);
    }

    // QUESTION 3 - ADD 1 TO ANY INTERGER USING BITWISE "NOT" OPERATOR
    public static int addOne(int n) {
        int m = ~n; // Bitwise NOT of n
        int result = -m; // Add 1 to the NOT value
        return result;
    }

    }

