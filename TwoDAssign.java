public class TwoDAssign {
    public static void main(String args[]){
        int[][] array = {{4,7,8},{8,8,7}} ;
        // System.out.println(sumOfInsideArray(array, 1));
        // System.out.println(findFreqOfSeven(array, 7));
        transposeOfMatrix(array);
    }



    //QUESTION 1
    public static int findFreqOfSeven(int[][] array, int key ){
        int n = array.length ; 
        int m = array[0].length ;
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(array[i][j] == key ){
                    count++ ;
                }
            }
        }
        return count ;
    }


    //QUESTION 2
    public static int sumOfInsideArray(int[][] array, int row){
        int count = 0;
        for(int i = row ; i <=row ; i++){
            for(int j = 0 ; j < array[0].length ; j++ ){
                count+= array[i][j] ;
            }
        }
        return count ;
    }


    //QUESTION 3
    public static void transposeOfMatrix(int[][] array){
        for(int i = 0; i<array[0].length ; i++){
            for(int j = 0 ; j < array.length ; j++){
                System.out.print(array[j][i] + " ");
            }System.out.println();
        }
    }
}
