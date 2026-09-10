import java.util.Scanner;

public class Strings {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your name");
        // String name = sc.nextLine();

        //concat
        // System.out.println("Hello, my name is " + name);

        //length
        // System.out.println(name.length());
        
        //
        // System.out.println(name.charAt(0));


        //isPalindrome
        // String Word = "racecar" ;
        // System.out.println(isPalindrome(Word));


        //shortest path -- coordinates -- WNEENESENNN
        // String path = "WNEENESENNN" ;
        // System.out.println(shortestPath(path));
        

        //string Builder
        // String str = "hello, my name is eku ." ;
        // System.out.println(toUpperCase(str));


        //sting compression
        String chars = "aabbbcccdd" ;
        System.out.println(stringCompression(chars));
    }

    


    public static boolean isPalindrome(String Word){
        for (int i = 0; i < Word.length()/2 ; i++ ){
            if(Word.charAt(i) != Word.charAt(Word.length() - 1 - i) ){
                //not a palindrome
                return false;
            }
        }return true;
    }



    public static float shortestPath(String path){
        int x = 0, y = 0;

        for(int i = 0 ; i< path.length() ; i++){
            char dir = path.charAt(i);
            
            //south
            if(dir == 'S') y--;
            //North
            else if(dir == 'N') y++ ;
            //east
            else if(dir == 'E') x++ ;
            //west
            else x-- ;

        }

        int X2 = x * x;
        int Y2 = y * y ;
        return (float)Math.sqrt(X2 + Y2) ;

    }



    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("") ;

        char ch = Character.toUpperCase((str.charAt(0)));
        sb.append(ch) ;

        for (int i = 1; i < str.length();i++){
            if(str.charAt(i) == ' ' && i < str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase((str.charAt(i))));
            }else{
                sb.append(str.charAt(i));
            }   
        }return sb.toString() ;
    }


    public static String stringCompression(String chars){
        StringBuilder sb = new StringBuilder("") ;
        for(int i = 0; i< chars.length() ; i++){
            Integer count = 1;
            while(i<chars.length()-1 && chars.charAt(i) == chars.charAt(i + 1)){
                count++;
                i++;
            }
            sb.append(chars.charAt(i));
            if(count > 1){
                sb.append(count);
            }
        }return sb.toString() ;
    }
}
