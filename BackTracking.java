import java.util.Arrays;

public class BackTracking {
    public static void main(String[] args){
        // int arr[] = new int[5] ;
        // changeArr(arr,0,1);
        // System.out.println(Arrays.toString(arr));

//-----------------------------------------------------
        // String str = "abc" ;
        // // findSubsets(str, "", 0);
    
        // findPermutaion(str, "");


//-----------------------------------------------------
        int n = 4;
        char board[][] = new char[n][n];

        //initialize
        for(int i = 0; i< n ; i++){
            for(int j = 0 ; j < n ; j++){
                board[i][j] = 'X';
            }
        }

        nQueens(board, 0);
        
    }


//------------------------------------------------------

        //N - QUEENS -----

    public static void nQueens(char board[][], int row){
        //base
        if(row== board.length){
            printBoard(board);
            return ;
        }

        //column

        for(int j = 0; j < board.length; j++ ){
            if(isSafe(board, row, j)){
            board[row][j] = 'Q';    //putting Q in each row
            nQueens(board, row+1); //functional call
            board[row][j] = 'X';  //backtracking call
            }
        }
    }

    public static boolean isSafe(char board[][], int row, int col){
        //veritcal up  -- (i-1,j)
        for(int i = row - 1; i>=0 ; i--){
            if(board[i][col] == 'Q'){
                return false ;
            }
        }

        // diagonal up left -- (i-1,j-1)
        for(int i = row - 1, j = col - 1; i>=0 && j>= 0 ; i--,j--){
            if(board[i][j] == 'Q'){
                return false ;
            }
        }
        // diagonal up right --(i-1,j+1)

        for(int i = row - 1, j = col + 1; i>=0 && j< board.length ; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true ;
    }




    //change Array-----

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


    public static void printBoard(char board[][]){
        System.out.println("--------chess board---------");
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }


    //FIND SUBSETS------

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



    //findPerumation-----

    public static void findPermutaion(String str, String ans){
        //base case
        if(str.length() == 0){
            System.out.println(ans);
        }

        //recursion
        for(int i = 0; i < str.length() ; i++){
            char curr = str.charAt(i);
            String NewStr = str.substring(0,i) + str.substring(i+1);
            findPermutaion(NewStr, ans+curr);
        }
    }







}
