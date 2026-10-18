import java.util.Arrays;

public class BackTracking {
    public static void main(String[] args){
        // int arr[] = new int[5] ;
        // changeArr(arr,0,1);
        // System.out.println(Arrays.toString(arr));


        String str = "abc" ;
        findSubsets(str, "", 0);
    }




    public static void changeArr(int arr[], int i, int val){
        //base case
        if(i == arr.length) {
            System.out.println( Arrays.toString(arr));
            return ;
        }


        //recursion
        arr[i] = val;
        changeArr(arr, i+1, val+1);
        arr[i] =  arr[i] - 2;
    }



    //FIND SUBSETS

    public static void findSubsets(String str, String ans, int i){

        //base case
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }else{

                System.out.println(ans);
            }
            return ;
        }


        //recursion

        //yes choice
        findSubsets(str, ans + str.charAt(i), i+1);

        //no choice
        findSubsets(str, ans, i+1);
    }



}
