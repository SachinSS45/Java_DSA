import java.util.Arrays;
import java.util.LinkedHashSet;

/*
  Q.Remove Duplicates in-place from sorted array
   Input : arr[] = {1,1,2,2,2,3,3}
   Output : arr[]= {1,2,3,2,2,3,3} i.e 3 size of unique values
 */
public class Program03 {
    //Approch : 1 T.C (N*log(N) + O(N) : HashSet
    //S.C : O(N)
    static int removeDuplicates1(int[] arr){

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for(int i=0;i<arr.length;i++) set.add(arr[i]);
        int index = 0;
        for(int ele : set){
            arr[index] = ele;
            index++;
        }
        return index;
    }
    //Approch : 2 (Optimal) : Two Pointer
    //T.C : O(N)
    //S.C : O(1)
    static int removeDuplicates2(int[] arr){
        int i=0;
        for(int j=1;j< arr.length;j++){
            if(arr[i]!=arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3};

        System.out.println(removeDuplicates2(arr));
        System.out.println(Arrays.toString(arr));
    }
}
