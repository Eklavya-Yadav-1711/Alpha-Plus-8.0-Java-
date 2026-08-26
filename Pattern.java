public class Pattern {
    public static void main(String[] args) {

        // for (int i = 1; i <= 4; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("x ");
        //     }
        //     System.out.println(" ");
        // }

        
        // System.out.println(" ");
        
        // for (int i = 1; i <= 4; i++) {
        //     for (int j = 4; j >= i; j--) { // n - i + 1
        //         System.out.print("x ");
        //     }
        //     System.out.println(" ");
        // }
        
        
        // System.out.println(" ");
        
        // char ch = 'A' ;

        // for (int i = 1; i <= 4; i++) {
        //     for (int j = 1; j <= i; j++) { 
        //         System.out.print(ch );
        //         ch++;
        //     }
        //     System.out.println(" ");
        // }





        //QUESTION 1 - HOLLOW RECTANGLE
        int row = 4;
        int col = 5; 
        for(int i = 1; i <= row; i++ ){
            for(int j = 1; j<=col; j++){
                if( i == 1 || i == row || j == 1 || j == col ){
                    System.out.print("x");
                }else{
                    System.out.print(" ");
                } 
                
            }System.out.println();
        }


    }
}