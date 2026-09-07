public class ArraysAssig {
    public static void main(String[] args) {
        int numbers[] = { 4, 5, 6, 7, 0, 1, 2 };
        int prices[] = { 7, 6, 4, 3, 1 };
        int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int arr[] = {-1,0,1,2,-1,-4} ;
        int target = 4;
        // System.out.println(freq(numbers));
        // System.out.println(binarySearchRS(numbers, target));
        // System.out.println(SellAndProfit(prices));
        // System.out.println(TrappedWater(height));
        threeSumBruteForce(arr);

    }

    // QUESITON 1

    // NAIVE SOLUTION
    public static boolean freq(int numbers[]) {
        boolean frequency = false;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    frequency = true;
                    break;
                }
            }
        }
        return frequency;
    }

    // OPTIMIZED SOLUTION -- Don't know right now
    // public static boolean freq1(int numbers[]) {
    // boolean frequency1 = false;
    // for(int i = 0; i< numbers.length ;i++){

    // }

    // }

    // QUESTION 2 -- sorted and rotated

    public static int binarySearchRS(int numbers[], int target) {
        int start = 0;
        int end = numbers.length - 1;
        int mid;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (numbers[mid] == target) {
                return mid;
            }
            // left array is sorted
            if (numbers[start] < numbers[mid]) {
                // check if the target is in left side or not
                if (numbers[start] <= target && target < numbers[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                // right array part is sorted
                // check if the target is in right side or not

                if (numbers[mid] < target && target <= numbers[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    // QUESTION 3
    public static int SellAndProfit(int prices[]) {
        int profit = 0;
        int maxProfit = 0;
        int buyStocks = 100000;

        for (int i = 0; i < prices.length; i++) {
            if (buyStocks < prices[i]) {
                profit = prices[i] - buyStocks;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyStocks = prices[i];
            }
        }
        return maxProfit;
    }

    // QUESTION 4
    public static int TrappedWater(int height[]) {
        // lmax
        int lmax[] = new int[height.length];
        lmax[0] = height[0];

        for (int i = 1; i < height.length; i++) {
            lmax[i] = Math.max(height[i], lmax[i - 1]);
        }

        // rmax
        int rmax[] = new int[height.length];
        rmax[height.length - 1] = height[height.length - 1];

        for (int i = height.length - 2; i >= 0; i--) {
            rmax[i] = Math.max(height[i], rmax[i + 1]);
        }

        // find the trapped water = min(lmax,rmax) - height
        int WaterTrapped = 0, TotalWater = 0;
        for (int i = 0; i < height.length; i++) {

            WaterTrapped = (Math.min(lmax[i], rmax[i]) - height[i]);
            TotalWater += WaterTrapped;
        }
        return TotalWater;
    }

    // QUESTION 5 -- BRUTE FORCE APPROACH

    public static void threeSumBruteForce(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        System.out.println(
                                "[" + nums[i] + ", " + nums[j] + ", " + nums[k] + "]");                                                                                
                    }
                }
            }
        }
    }
}