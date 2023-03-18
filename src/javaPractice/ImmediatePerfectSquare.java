package javaPractice;

import java.util.Arrays;

public class ImmediatePerfectSquare {
    static int nextPerfectSquare(int N)
    {
        int nextN = (int)Math.floor(Math.sqrt(N)) + 1;
        return nextN * nextN;
    }
    public static int removeDuplicateElements(int arr[], int n){
        if (n==0 || n==1){
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++){
            if (arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n-1];
        // Changing original array
        for (int i=0; i<j; i++){
            arr[i] = temp[i];
        }
        return j;
    }
    // Driver Code
    public static void main(String args[])
    {
        int n = 35;

        System.out.println (nextPerfectSquare(n));

        int arr[] = {10,20,20,30,50,40,50,50};
        int length = arr.length;
        Arrays.sort(arr);
        length = removeDuplicateElements(arr, length);
        //printing array elements
        for (int i=0; i<length; i++)
            System.out.print(arr[i]+" ");
    }
}

