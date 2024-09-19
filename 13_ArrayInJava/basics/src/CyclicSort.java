import java.util.Arrays;

public class CyclicSort {

    static void cyclicSort(int[] arr){
        int index = 0;
        while(index < arr.length){
            int correctPos = arr[index]-1;
            if(index!=correctPos){
                int temp = arr[index];
                arr[index] = arr[correctPos];
                arr[correctPos] = temp;
            }else{
                index++;
            }

        }
    }


    public static void main(String[] args) {

        int[] arr = {6,5,4,3,2,1,7};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
