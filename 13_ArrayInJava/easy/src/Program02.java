import java.util.Arrays;

/*
   Q.find the second largest ele present in array
     Input : arr = {1,2,4,7,7,5};
     Output : 5
 */
public class Program02 {

    //Approch : 1 (Brute force)
    //T.C : O(n*log(n)) + O(n) (for traverse)
    //S.C : O(1)
    static int secondLargest1(int[] arr){
        Arrays.sort(arr);
        int largest = arr[arr.length-1];
        for(int i =arr.length-2 ; i>=0;i--){
            if(arr[i]!=largest) return arr[i];
        }
        return -1;//Considering array contains non negative number
    }

    //Approch : 2 (Better Solution)
    //T.C : O(2n)
    //S.C : O(1)

    static int secondLargest2(int[] arr){
        int largest = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest) largest = arr[i];
        }

        int slargest = -1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>slargest && arr[i]!=largest) slargest = arr[i];
        }
        return slargest;
    }

    //Approch : 3 (Optimal)
    //T.C : O(n)
    //S.C : O(1)
    static int secondLargest3(int[] arr){
        int largest = arr[0];
        int sLargest = -1;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                sLargest = largest;
                largest = arr[i];
            }else if(arr[i] > sLargest && arr[i]!=largest){
                sLargest = arr[i];
            }
        }
        return sLargest;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,7,7,5};
        System.out.println(secondLargest1(arr));
        System.out.println(secondLargest2(arr));
        System.out.println(secondLargest3(arr));
    }
}
