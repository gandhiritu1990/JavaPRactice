package javaPractice;

public class ArraySwap {

    public static void main(String[] args) {
        //int index=0;
        int[] arry={70,13,48,19,24,5,0,10};

        int[] newarry=seperator(arry, 0, arry.length-1);
        System.out.print("The new sorted array is: ");
        for(int i=0; i<newarry.length;i++){
            System.out.print(newarry[i]+" ");
        }
    }

    public static int[] seperator(int[] arr1, int left, int right){
        int temp;
        if(left>=right)       //base case, return array
            return arr1;
        else if(arr1[left]%2!=0 && arr1[right]%2==0){//if match, do the swap
            temp=arr1[left];
            arr1[left]=arr1[right];
            arr1[right]=temp;
            return seperator(arr1, left+1, right-1);
        }
        else{
            if(arr1[right]%2!=0){//if right side is on odd #, then decrease index
                return seperator(arr1, left, right-1);
            }
            if(arr1[left]%2==0){//if left side is on even #, then increase index
                return seperator(arr1, left+1, right);
            }
        }
        return arr1;
    }
}
