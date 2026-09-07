import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int nums[] = {1,2,4,3,5,8,6,1};
        // bubbleSort(nums);
        // selectionSort(nums);
        // selectionSort(nums);
        // Arrays.sort(nums, 0, 6);
        // System.out.println(Arrays.toString(nums));
        countingSort(nums);
        System.out.println(Arrays.toString(nums));
    }


    public static void bubbleSort(int nums[]){
        int temp;
        boolean swapped;
        for(int i = 0; i<nums.length - 1 ; i++){
            swapped = false ;
            for(int j = 0; j<nums.length - i - 1; j++){
                if(nums[j] > nums[j+1]){
                    temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                    swapped = true;
                }
            }if (swapped == false) {
                break;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void selectionSort(int nums[]){
        for(int i = 0; i< nums.length - 1; i++){
            int minPos = i ;
            for(int j = i+1; j < nums.length  ; j++){
                if(nums[minPos] > nums[j]){
                    minPos = j;
                }
            }
            int temp = nums[minPos];
            nums[minPos] = nums[i];
            nums[i] = temp ;
        }
        System.out.println(Arrays.toString(nums));
    }

    
    public static void insertionSort(int nums[]){
        for(int i = 1; i< nums.length ; i++){
            int curr = nums[i];
            int prev = i -1;
            while (prev >= 0 && nums[prev] > curr) {
                nums[prev+1] = nums[prev];
                prev--;
            }
            nums[prev+1] = curr ;
        }
    }


    public static void countingSort(int nums[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i< nums.length;i++){
            largest = Math.max(largest, nums[i]);
        }
        int count[] = new int[largest+1];
        for(int i = 0;i<nums.length;i++){
            count[nums[i]]++;
        }

        int j = 0;
        for(int i = 0; i<count.length; i++){
            while(count[i] > 0){
                nums[j] = i ;
                j++;
                count[i]--;
            }
        }
    }

}


