package javaPractice;

import org.testng.annotations.Test;

public class ShiftArrayLeft {

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        arr = shiftLeft(arr,3);
        for(int arrEle : arr){
            System.out.println(arrEle);

        }
    }

    public static int[] shiftLeft(int[] a,int rotateBy){
       // int[] tmp = new int[a.length];
        for(int i = 0; i<rotateBy; i++){
            int first = a[0];
            int j;
            for ( j = 0; j< a.length-1; j++){
                a[j] = a[j+1];
            }
            a[j] = first;
        }

        return a;
    }

}
