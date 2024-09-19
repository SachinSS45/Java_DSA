import java.util.Arrays;

/*
    Q.Largest Element in Array
    Input : arr = {3,2,1,5,2};
 */
public class Program01 {
    /*
       T.C : O(n*log(n))
       S.C : O(1)
     */
    static int largest1(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    /*
        T.C : O(n)
        S.C : O(1)
     */
    static int largest2(int[] arr){
        int largest = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest) largest = arr[i];
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,2};
        System.out.println(largest1(arr));
        int[] arr2 = {3,2,1,5,2};
        System.out.println(largest2(arr2));
    }
}
