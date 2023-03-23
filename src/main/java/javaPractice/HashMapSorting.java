package javaPractice;


import io.cucumber.java.bs.I;

import java.util.*;

public class HashMapSorting {
    public static void main(String[] args){

        HashMap<String,Integer> hm = new HashMap<>();

        List<Integer> list = new ArrayList<>();
        hm.put("b",4);
        hm.put("a",3);
       hm.put("c",5);
         hm.put("d",10);
        hm.put("e",11);
/*        for(Map.Entry<String,Integer> m : hm.entrySet()){
            System.out.println(m.getKey() +":" +m.getValue());
        }*/
        for(Map.Entry<String,Integer> m : hm.entrySet()){
            list.add( m.getValue());
        }
/*        for(int i : list){
            System.out.println(i);
        }*/
        Collections.sort(list);
/*        for(int i : list){
            System.out.println(i);
        }*/
        Map<String,Integer> sortedMap = new HashMap<String,Integer>();

        for(int i : list){
            for(Map.Entry<String, Integer> m : hm.entrySet()){
                if (m.getValue()==i) {
               //     sortedMap.put(m.getKey(),m.getValue());

                   // System.out.println(m.getKey() +":" +m.getValue());
                }
            }
/*            for(Map.Entry<String,Integer> mm : sortedMap.entrySet()){
                System.out.println(mm.getKey() +":" +mm.getValue());
            }*/

        }
        sortedMap.put("b",3);
        sortedMap.put("a",4);
        sortedMap.put("c",5);
        sortedMap.put("d",10);
        sortedMap.put("e",11);
        System.out.println(sortedMap);




    }
}
