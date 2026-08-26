import java.util.*;

public class Loops {
    public static void main(String[] args) {
        // int count = 1;
        // while(count <= 100){
        // System.out.println("hello world" + " " + count);
        // count++;
        // }

        // for(int i = 0 ; i < 4 ; i++){
        // for(int j = 0 ; j < 4 ; j++){
        // System.out.print("x ");
        // }System.out.println();
        // }

        // int n = 10899;
        // int rev = 0 , temp = 0 ;
        // while(n > 0){
        // temp = n%10 ;
        // rev = rev * 10 + temp;
        // n/= 10 ;
        // }
        // System.out.println(rev);

        Scanner sc = new Scanner(System.in);
        // System.out.println("enter the number to know if it is prime or not");
        // int num = sc.nextInt();

        // boolean isPrime = true ;
        // if(num <= 1){
        //     isPrime = false;
        // }else{
        //     for(int i = 2 ; i <= (num-1) ; i++){
        //         if(num%i == 0){
        //             isPrime = false ;
        //         }
        //     }
        // }System.out.println(isPrime);
        





        //QUESTION 1    
        // for(int i = 0 ; i<5; i++){
        //     System.out.println("hello");
        //     i+=2;
        // }




        //QUESTION 2
        // int odd = 0, even = 0 ;
        // System.out.println("Enter the number ");
        // int num = sc.nextInt();
        
        // for(int i = 1; i<=num;i++){
        //     if(i % 2 == 0){
        //         even += i;
        //     }else{
        //         odd +=i;
        //     }
        // }
        // System.out.println("even sum : " + "" + even + "\nodd sum :" + " " + odd );






        //QUESTION 3
        // System.out.print("Enter a number: ");
        // int n = sc.nextInt();
        // System.out.println("Factorial of " + n + " : " + fact(n));





        //QUESTION 4
        // int n = 12;
        // for(int i = 1; i <= 10; i++){
        //     int mul = n * i ;
        //     System.out.println(n + " x " + i + " = " + mul  );
        // }




        //QUESTION 5
        // THE PROGRAM WILL THROW ERROR AS SYNTAX ERROR AS THE VARIABLE I IS OUTSIDE THE FOR LOOP




    }
        // int n = sc.nextInt();
        public static int fact(int n){
            if(n<=1){
                return 1;
            }
            return n * fact(n-1);
            
        }
}
