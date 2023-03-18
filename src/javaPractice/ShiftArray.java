package javaPractice;

public class ShiftArray {

    public static void main(String[] args) {

        int[] arr = {2,0,1,5,};
        int[] temp=new int[arr.length];
        int a = arr.length%2;
        int arrLen = arr.length/2;

        int s = arrLen-1;
        int p = arrLen;

        for (int i=0; i<arr.length; i++){
            if(i%2==0){

                    temp[s] = arr[i];
                    s--;

            }else{
                temp[p] = arr[i];
                if(i!=arr.length-1){
                    p++;
                }

            }


        }

        for (int aa : temp){
            System.out.println(aa);

        }

    }
}
