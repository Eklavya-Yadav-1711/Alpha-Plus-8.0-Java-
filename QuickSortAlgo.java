//pivot and partition

import java.util.Arrays;

public class QuickSortAlgo {
    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 6, 8, 5 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        // last element - pivot
        int pIdx = partition(arr, si, ei); // partiton fucntion does takes smaller and bigger elm put pivot on right place and give its index
        quickSort(arr, si, pIdx - 1); //left
        quickSort(arr, pIdx + 1, ei); //right

    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei] ;
        int i = si-1;

        for(int j = si; j<ei ; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot ;
        arr[ei] = arr[i];  //pivot = arr[i]
        arr[i] = temp;
        return i ;
        }
}
