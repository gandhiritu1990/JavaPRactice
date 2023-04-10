package javaPractice;

public class CombinationsOfString {

    public static void main(String[] args){
        String s = "abc";
        for (int i = 0; i<s.length(); i++){
            for (int j = 0; j<s.length(); j++){
                for (int k = i; k<=j; k++){
                    System.out.print(s.charAt(k));
                    }

                if (i>0){
                    for (int p = i; p>=0; p--){
                        System.out.print(s.charAt(p));
                    }
                }
                System.out.print("\n");
            }

        }


        }

}
