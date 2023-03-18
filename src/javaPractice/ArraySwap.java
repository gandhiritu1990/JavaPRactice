package javaPractice;

public class ArraySwap {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] arr = {2,0,1,3,0,5,0,8};
        int[] temp=new int[arr.length];
        for (int i=0; i<arr.length-1; i++){

            if(arr[i]==0 ){
                temp[i]=arr[i];
                arr[i]=arr[i+1];

                arr[i+1]=temp[i];

            }

        }
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);

        }
    }
}
