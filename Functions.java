import java.lang.Math;
//Practice

// public class Functions {

//     public static void main(String[] args) {
//         // int a = 3, b = 5 ;
//         // System.err.println(multiply(10, 15));
//         // System.err.println(multiply(12,10));
//         // System.out.println(fact(5));
//         // System.out.println(isPrime(11));
//         // primesInRange(100);
//     }





//     public static int multiply(int a, int b) {
//         return a * b;
//     }



//     public static int fact(int a) {
//         if (a < 1) {
//             return 1;
//         }
//         return a * fact(a - 1);
//     }



//     public static boolean isPrime(int n) {

//         boolean isPrime = true;
//         for (int i = 2; i <= Math.sqrt(n); i++) { // for(int i = 2; i <= n- 1; i++)
//             if (n % i == 0) {
//                 isPrime = false;
//                 break;
//             }
//         }
//         return isPrime;
//     }



//     public static void primesInRange(int n) {
//         for (int i = 2; i <= n; i++) {
//             if (isPrime(i)) System.out.print(i + " ");
//         }
//     }

// }

//Questions

public class Functions{
    public static void main (String[] args){
        // System.out.println(avg(10,20,30));
        // System.out.println(isEven(11));
        // System.out.println(pal(111));
        System.out.println(sumOfDigits(1215544));
    }

    //QUESTION 1

    public static int avg(int a, int b, int c){
        return (a + b + c)/3 ;
    }

    //QUESTION 2

    public static boolean isEven(int a){
        boolean isEven = false ;
        if( a % 2 == 0){
            isEven = true ;
        }
        return isEven ;
    }

    //QUESTION 3

    public static boolean pal(int org){
        boolean pal = false ;
        int rev = 0 ;
        int tempOrg = org ;
        while(org > 0){
            int temp = org % 10 ;
            rev = (rev * 10) + temp ;
            org /= 10 ;
        }
        
        if(tempOrg == rev){
            pal = true;
        }
        return pal ;
    }

    //QUESTION 5

    public static int sumOfDigits(int n){
        int temp = 0;
        int sum = 0;
        while(n > 0){
            temp = n % 10 ;
            sum+= temp ;
            n /= 10 ;
        }
    return sum ;
    }
}