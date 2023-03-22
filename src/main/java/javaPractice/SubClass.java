package javaPractice;

class NewClass {

  int i;


   NewClass(){
       System.out.println("Inside super class");
   }

    NewClass(int a,int b){
        System.out.println("Inside parameterized super constructor");
    }

}

     public class SubClass extends NewClass{

    SubClass(){
        super(3,4);
    }

    SubClass(int a,int b,int c){
       super(a,b);
       i=c;

    }
    public int add(int a,int b){
        return a-b;
    }

    public static void main(String[] args){
        SubClass s = new SubClass(1,2,3);
        SubClass s1 = new SubClass();

    }


}


