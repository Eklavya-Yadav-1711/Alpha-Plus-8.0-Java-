import java.util.*;

public class ArrayProblem {
    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14 };
        // int key = 11 ;
        // System.err.println(binarySearch(numbers, key));
        // reverseArray(numbers);
        subArray(numbers);

    }

    public static void subArray(int numbers[]) {
        int temp = 0, max = numbers[0], min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                for (int k = i; k <= j; k++) {

                    System.out.print(numbers[k] + " ");
                    temp += numbers[k] ;
                    if( temp > max){
                        max = temp ;
                    }
                    if(temp < min){
                        min = temp;
                    }
                }temp = 0 ;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("max : " + max + " " + "min :" + " " + min);
    }

    

    public static void reverseArray(int numbers[]) {
        int low = 0;
        int high = numbers.length - 1;

        while (low <= high) {
            swap(numbers, low, high);
            low++;
            high--;
        }
        System.out.println(Arrays.toString(numbers));

    }

    public static void swap(int numbers[], int low, int high) {
        int temp = numbers[low];
        numbers[low] = numbers[high];
        numbers[high] = temp;
    }

    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
