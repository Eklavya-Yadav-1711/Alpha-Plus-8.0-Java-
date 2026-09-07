import java.util.*;

public class ArrayProblem {
    public static void main(String[] args) {
        int numbers[] = { -2,3,4, 1, -1 , -2 };
        int height[] = {4 , 2, 0, 6, 3 , 2, 5} ;
        int prices[] = {7,1,5,3,6,42} ;
        // int key = 11 ;
        // System.err.println(binarySearch(numbers, key));
        // reverseArray(numbers);
        // subArrayBrute(numbers);
        // subArraykadane(numbers);
        // kadaneNeg(numbers);
        // TappingRainWater(height);
        BuyAndSell(prices);
    }



    public static void BuyAndSell(int[] prices) {
        if (prices == null || prices.length < 2) {
            System.out.println(0);
            return;
        }
        int maxProfit = 0 ;
        int buyStocks = 100000000;
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (buyStocks < prices[i]) {
                profit = prices[i] - buyStocks;
                maxProfit = Math.max(profit, maxProfit) ;
            }else{
                buyStocks = prices[i] ;
            }
        }
        System.out.println(maxProfit);
    }



    public static void TappingRainWater(int height[]){
        int n = height.length  ;
        int lmax[] = new int[n];
        int rmax[] = new int[n];

        lmax[0] = height[0];
        rmax[n-1] = height[n-1];

        for(int i = 1 ; i < n ; i++){
            lmax[i] = Math.max(height[i], lmax[i-1]);
        }
        for(int i = n-2 ; i >= 0 ; i--){
            rmax[i] = Math.max(height[i], rmax[n-1]);
        }

        int WaterTrapped = 0 ;
        for(int i = 0 ; i < n ; i++){

            WaterTrapped += (Math.min(lmax[i], rmax[i]) - height[i]) ;
        }
        System.out.println(WaterTrapped);
    }


    public static void subArraykadane(int numbers[]){
        int currSum = 0 ; int maxSum = 0;
        for(int i = 1 ;i < numbers.length ; i++){
            currSum += numbers[i];
            if(currSum < 0) currSum = 0;
            maxSum = Math.max(maxSum, currSum) ;
        }
        System.out.println(currSum + " " + maxSum);
    }   



    public static void kadaneNeg(int numbers[]){
        int currSum = numbers[0] ; int maxSum = numbers[0];
        for(int i = 1 ;i < numbers.length ; i++){
            currSum = Math.max(currSum + numbers[i], numbers[i]) ;
            maxSum = Math.max(maxSum, currSum) ;
        }
        System.out.println(currSum + " " + maxSum);
    }   







    public static void subArrayBrute(int numbers[]) {
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
