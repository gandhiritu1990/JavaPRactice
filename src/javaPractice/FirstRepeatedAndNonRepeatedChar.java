package javaPractice;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatedAndNonRepeatedChar {

    public static void main(String[] args){
        String s = "hello world";
        int count = 0;
        for (int i=0; i<=s.length()-1; i++){
                for(int j=i+1; j<s.length(); j++){
                    if(s.charAt(i)==s.charAt(j)){
                        System.out.println("First repeated character is " +s.charAt(i));

                    }
                    break;
                }
      }

        for (int i=0; i<=s.length()-1; i++){
            for(int j=i+1; j<s.length(); j++){
                if(!(s.charAt(i)==s.charAt(j))){
                   count++;
                }
            }
            if(count>=1){
                System.out.println("First non repeated character is " +s.charAt(i));
                break;
            }
        }

    }
}
