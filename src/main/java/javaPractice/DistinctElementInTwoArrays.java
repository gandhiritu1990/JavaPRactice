package javaPractice;

import io.cucumber.java.sl.In;

import java.util.*;

public class DistinctElementInTwoArrays {

    public static void main(String[] args){
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {2,6};

       /* List<Integer> list1=  new ArrayList<Integer>(Arrays.asList(arr1));
        List<Integer> list2=  new ArrayList<Integer>(Arrays.asList(arr2));
        Set<Integer> set = new HashSet<>();

        set.addAll(list1);
        set.addAll(list2);
        list1.retainAll(list2);
        set.removeAll(list1);
        for (int i : set){
            System.out.println(i);
        }*/
        getDistinct(arr1,arr2);
        getDistinct(arr2,arr1);
    }

    public static void getDistinct(int[] a1, int[] a2){

        for(int i = 0; i<a1.length; i++){
            boolean contains = false;
            for(int j = 0; j<a2.length; j++){
                if(a1[i]==a2[j]){
                    contains =true;
                    break;
                }

                }
            if(contains==false){
                System.out.println("Unique element: " +a1[i]);

            }
        }

    }
}
