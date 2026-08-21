public class Operatos{
    public static void main(String[] args){
        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);
        
    

        //QUESTION 1
        // int x = 2, y = 5;

        // int exp1 = (x * y / x);
        // int exp2 = (x * (y / x));

        float x = 2.0f, y = 5.0f;

        float exp1 = (x * y/x);                 // because it saves decimal values
        float exp2 = (x * (y/x));

        System.out.println(exp1 +  " , " +  exp2);



        //QUESTION 2
        int c = 200, d = 50, e = 100;
        if(c> d && d > e){
            System.out.println("Hello");
        }
        if(e > d && e < c){
            System.out.println("Java");
        }
        if((d+200) < c && (d+150) < e ){
            System.out.println("Hello java");
        }



        //QUESTION 3
        int f , g, h ;
        f = g = h = 2;
        f += g;
        g -= h;
        h /= ( f + g);
        System.out.println(f + " " + g +  " " + h);



        //QUESTION 4
        int i = 9, j = 12;
        int k = 2, l = 4, m = 6 ;

        int exp = 4/3 * (i + 34) + 9 * (k + l + m) + (3 + j *(2 + k)) / (k + l * j);

        System.out.println(exp);
        // 43 12 67 50
        


        //QUESITON 5
        int n = 10, o = 5 ;

        int exp3 = (o * (n / o + n / o));
        int exp4 = (o * n / o + o * n / o);

        System.out.println(exp3 + " , " + exp4);
    }
}




