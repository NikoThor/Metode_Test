public class Opgave3 {
    /*Lav en metode midterst, der tager tre tal som parametre.
Metoden skal returnere den midterste værdi.
F.eks. skal kaldet midterst( 6, 10, 8 ) returnere 8.
 */
    public static void main(String[] args) {
        //Test case sidste værdi er midterst
        // input : a = 6, b = 10, c = 8
        // forventet output = 8

        //input
        int a = 6;
        int b = 10;
        int c = 8;

        //forventet output
        int output = midterst(a, b, c);

        if (output == 8){
            System.out.println("pass");
        }
        else {
            System.out.println("fail");
        }
        //test case hvor første værdi er midterst
        //input: a = 3, b = 7, c = 2
        // forventet output = 3

        //input
        a = 3;
        b = 7;
        c = 2;

        //forventet output
        output = midterst(a, b, c);

        if (output == 3){
            System.out.println("pass");
        }
        else {
            System.out.println("fail");
        }
        //Test case hvor midterste værdig er midterst
        // imput: a = 10, b= 25, c= 50
        //forventet output 25
        //input
        a = 10;
        b = 25;
        c = 50;

        //forventet output
        output = midterst(a, b, c);

        if (output == 25){
            System.out.println("pass");
        }
        else {
            System.out.println("fail");
        }

     }

     static int midterst(int a, int b, int c) {
        if (a <= b && b < c || a > b && b > c) {
            System.out.println(b);
            return b;
     } else if ( b <= a && a < c || b > a && a > c) {
            System.out.println(a);
            return a;
        } else {
            System.out.println(c);
            return c;
        }

    }
}
