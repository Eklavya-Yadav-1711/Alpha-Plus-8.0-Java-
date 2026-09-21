public class Recursion {
    public static void main(String[] args) {
        // int[] arr = {1,2,3,4,5,7,5,6,5} ;
        // System.out.println(factorial(5)) ;
        // System.out.println(nthSum(10));
        // System.out.println(fibonaci(3));
        // System.out.println(sorted(arr, 0));
        // System.out.println(firstOccurence(arr, 5, 0));
        // System.out.println(lastOccurence(arr, 5, arr.length - 1));
        // System.out.println(powerOfN(2, 10));
        // System.out.println(tillingProblem(3));
        

        // String str = "apnacollege" ;
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
        // System.out.println(friendsPairing(3));
        binaryString(3, 0, "");



    }





    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static int nthSum(int n){
        if(n == 1) return 1 ;
        return n + nthSum(n-1);
    }

    public static int fibonaci(int n){
        if( n == 0) return 0 ;
        if(n == 1) return 1 ;
        return fibonaci(n - 1) + fibonaci(n - 2) ;
    }

    public static boolean sorted(int arr[], int i){
        if(i == arr.length-1) return true ;
        if(arr[i] > arr[i+1]){
            return false ;
        }
        return sorted(arr, i + 1) ;
    }

    public static int firstOccurence(int[] arr, int key ,int i){
        if(i == arr.length ) return -1 ;
        if(arr[i] == key ) return i;
        return firstOccurence(arr, key , i + 1) ;
    }

    public static int lastOccurence(int[] arr, int key, int i){
        if(i == -1) return -1 ;
        if(arr[i] == key) return i ;
        return lastOccurence(arr, key, i - 1) ;
    }

    public static int powerOfN(int x, int n){
        if(n == 0) return 1 ;
        return x * powerOfN(x, n-1) ;
    }


    //tilling problem --- amazon
    public static int tillingProblem(int n){
        if(n == 0 || n == 1) return 1 ;
        //vertical choice + horizontal choice
        return tillingProblem(n-1) + tillingProblem(n-2) ;
    }



    //remove dupliates from 'a' to 'z' - microsoft , google
    public static void removeDuplicates(String str, int idx, StringBuilder newString, boolean[] map){
        if(idx == str.length()){
            System.out.println(newString) ;
            return ;
        }
        char currChar = str.charAt(idx) ;
        if(map[currChar - 'a' ]  == true){
            removeDuplicates(str, idx + 1, newString, map);
        }
        else{
            map[currChar - 'a'] = true ;
            removeDuplicates(str, idx + 1, newString.append(currChar), map);
        }
    }


    //friends paring problem - goldman sachs
    public static int friendsPairing(int n){
        if(n== 1 || n==2){
            return n;
        }
        int fnm1 = friendsPairing(n-1); //single
        int fnm2 = friendsPairing(n-2); //pairing
        int pairWays = (n-1) * fnm2 ;

        int totWays = fnm1 + pairWays ;
        return totWays ; 
    }


    //Binary String Problem - microsoft
    public static void binaryString(int n, int lastPlace, String str){
        if(n == 0){
            System.out.println(str);
            return ;
        }
        binaryString(n-1, 0, str + "0");
        if(lastPlace == 0){
            binaryString(n-1, 1, str + "1");
        }
    }
}
