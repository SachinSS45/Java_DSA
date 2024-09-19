import java.util.Arrays;

/*
    Q.Return the array of smallest ele and largest ele present in array
    Ex : arr = {2,1,3,4,5} Output : [1,5]
         arr = {1} Output : [1,1]

         T.C : O(N)
         S.C : O(1)

      Note : If array is already sorted then return new int[]{arr[0],arr[arr.length-1]};
      T.C : O(1)
      S.C : O(1)
 */
public class Program05 {

    static int[] smallestEleLargestEle(int[] arr){
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for(int data : arr){
            if(data < smallest) smallest = data;
            if(data > largest) largest = data;
        }

        return new int[]{smallest,largest};
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(smallestEleLargestEle(arr)));//[1,5]
    }
}
