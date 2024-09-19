import java.util.Arrays;

public class InsertionSort {

    static void insertionSort(int[] arr){

        for(int i=1;i<arr.length;i++){
            int j = i-1;
            int pos = i;
            while(j>=0 && arr[j] > arr[i]){
                pos = j;
                j--;
            }
            int temp = arr[i];
            for(int k = i;k > pos ; k--){
                arr[k] = arr[k-1];
            }
             arr[pos] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
