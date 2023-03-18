package javaPractice;


public class ReverseString {

    public static void main(String[] args){
        String s = "APPLE";
        String s1 = "";

        for (int i=s.length()-1; i>=0; i--){
            s1 = s1 + s.charAt(i);
            if(i==0){
                break;
            }
        }
        System.out.println(s1);

    }
}
