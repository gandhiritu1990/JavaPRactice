package javaPractice;

public class PyramidPrograms {


    public static void main(String[] args){
        first();
        second();

        third();
        fourth();
        fifth();
    }

/*          *
            * *
            * * *
            * * * *
            * * * * * */
    public static void first(){
        for (int i=1;i<=5; i++){
            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println("");

        }
    }

  /*        1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5*/

    public static void second(){
        for (int i=1;i<=5; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(j +" ");
            }
            System.out.println("");

        }
    }

/*  A
    B B
    C C C
    D D D D
    E E E E E*/

    public static void third(){
        char last = 'E', alphabet = 'A';

        for (int i = 1; i <= (last - 'A' + 1); ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(alphabet + " ");
            }
            ++alphabet;

            System.out.println();
        }
    }

    public static void fourth(){
        for (int i=5;i>=1; i--){
            for (int j = 1; j<=i; j++){
                System.out.print(j +" ");
            }
            System.out.println("");

        }
    }

    public static void fifth(){
        for (int i=1;i<=5; i++){
            for (int j = i; j<=5; j++){
                System.out.print(i +" ");
            }
            System.out.println("");

        }
    }
}
