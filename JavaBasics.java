import java.util.*;
public class JavaBasics{
    public static void main(String args[]){

        // Question 1
        float A = 10, B = 12, C = 15 ;
        float avg = (A + B + C)/3 ;
        System.out.println(avg) ;


        // Question 2 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Side value : " );
        float side = sc.nextFloat();
        float area  = side * side ;
        System.out.println("The area of the square is : " + area);
        

        // Question 3 
        System.out.println("Enter the price of pencil");
        float pencil = sc.nextFloat();

        System.out.println("Enter the price of pen");
        float pen = sc.nextFloat();

        System.out.println("Enter the price of eraser");
        float eraser = sc.nextFloat();

        float bill = (pencil + pen + eraser) ;
        double total_bill =  (bill + (bill*(18.00/100.00))) ;
        System.out.println("The bill of the user is :  " + bill);
        System.out.println("The total bill of the user is with tax :  " + total_bill);


        // Question 4
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;

        double result = (f * b ) + (i % c) - (d * s);
        System.out.println("the value will be : " + result);


        // Question 5  ---- No error will be thrown
        int $ = 4;
        int val = $ * $ ;
        System.out.println(val);



    }
}