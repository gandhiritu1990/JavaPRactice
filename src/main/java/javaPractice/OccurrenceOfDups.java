package javaPractice;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfDups {

    public static void main(String[] args){
        String s = "papp";
        HashMap<Character,Integer> dups = new HashMap<>();
        int count = 2;
        for (int i=0; i<=s.length()-1; i++){
            if(!dups.containsKey(s.charAt(i))){
                for(int j=i+1; j<s.length(); j++){
                    if(s.charAt(i)==s.charAt(j)){
                        if(dups.containsKey(s.charAt(i))){
                            dups.put(s.charAt(i), dups.get(s.charAt(i))+1);
                        }
                        else {
                            dups.put(s.charAt(i), count);
                        }
                    }
                    if(i==s.length()){
                        break;
                    }
                }
            }

        }
        for(Map.Entry e: dups.entrySet()){
            System.out.println(e.getKey() +"\""+ e.getValue());
        }
    }
}
