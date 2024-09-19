import java.util.Arrays;

/*
    Q.Left rotate by 1
    Input : arr = {1,2,3,4,5}
    Output : arr = {2,3,4,5,1}
 */
public class Program04 {

    //Approch : 1 (Optimal) T.C : O(N) S.C O(1) (no extra space)
    static void rotatebyOne(int[] arr){
        int temp = arr[0];
        for(int i = 1;i< arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rotatebyOne(arr);
        System.out.println(Arrays.toString(arr));
    }
}
