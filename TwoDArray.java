import java.util.Scanner;

public class TwoDArray {
    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int n = matrix.length;
        int m = matrix[0].length;

        // Scanner sc = new Scanner(System.in);
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // System.out.print("Value of " + i + " " + j + " ");
        // // matrix[i][j] = sc.nextInt();
        // }
        // }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // System.out.println(search(matrix, 1)) ;
        // spiralMatrix(matrix);
        // System.out.println(diagonalSum(matrix));
        sortedSearch(matrix, 21);
    }




    // SEARCH KEY INSIDE MATRIX
    public static boolean search(int matrix[][], int key) {
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == key) {

                    System.out.println("key found at " + i + " " + j + " ");
                    return true;
                }
            }
        }
        return false;
    }





    // SPIRAL MATRIX PRINTING -- MEDIUM TO HARD - MAANGS
    public static void spiralMatrix(int matrix[][]) {
        int startCol = 0;
        int startRow = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            // left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        System.out.println();
    }







    // DIAGONAL SUM -- FLIPKART

public static int diagonalSum(int matrix[][]) {
    int n = matrix.length;
    int m = matrix[0].length;
    int total = 0;

    for (int i = 0; i < n; i++) {
        total += matrix[i][i];

        if (i != m - i - 1) {           // skip the crossing cell on odd n
            total += matrix[i][m - i - 1];
        }
    }

    return total;
}




//Search in sorted matrix -- staircase search -- O(m+n)
 
    public static boolean sortedSearch(int matrix[][] , int key){
        int row = 0 ;
        int col = matrix[0].length - 1;
        
        while (row < matrix.length && col >= 0) {
            if(matrix[row][col] == key){
                System.out.println("Found the key at (" + row + " , " + col + ")" );
                return true;
            }
            else if(key < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
            
        }
        System.out.println("key not found");
        return false ;
    }
}
