package javaPractice;

public class ClassA {
    static ClassA a;
    public static void ss(int i){

        if (i == 1){
            a = new ClassB();
            a.test(1);

        }
        else{
            a = new ClassC();
            a.test(2);
        }


    }

     public void test(int i){

        System.out.println("Inside ClassA");

    }

    public static void main(String[] args){
        ClassA.ss(2);
    }
}
