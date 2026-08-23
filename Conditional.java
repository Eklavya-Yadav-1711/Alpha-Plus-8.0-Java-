import java.util.*;

public class Conditional {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Question 1
        System.out.println("Enter the number to know its pos or neg");
        int num = sc.nextInt();
        String result = (num >= 0) ? "pos" : "neg";
        System.out.println(result);




        // Question 2
        System.out.println("Enter your temperature : ");
        double temp = 103.5;
        double degree = sc.nextDouble();
        String haveFever = (degree > temp) ? "You have fever" : "You don't have fever";
        System.out.println(haveFever);




        // Question 3
        System.out.println("Write numbers between 1 to 7 to know the day of the week");
        int week = sc.nextInt();
        switch (week) {
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;

            default:
                System.out.println("ENTER NUMBER FROM 1 TO 7 ONLY ");
                break;
        }




        // QUESTION 4

        int a = 63, b = 36;
        boolean x = (a < b) ? true : false;
        int y = (a > b) ? a : b;

        System.out.println(x + " " + y);




        // QUESTION 5
        System.out.println("enter the year to know the number");
        int year = sc.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Yes its a leap year");
                } else {
                    System.out.println("Not a leap year");
                }
            } else {
                System.out.println("Yes its a leap year");
            }
        } else {
            System.out.println("Not a leap year");
        }

    }
}