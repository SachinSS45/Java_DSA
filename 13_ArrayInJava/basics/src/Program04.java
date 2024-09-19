/*
 Q.check whether the given array is sorted or not
   arr = {1,2,3,4,5} return true
   arr = {3,4,2,1,3} return false
 */
public class Program04 {

    static boolean isSorted(int[] arr){

//        for(int i=0;i<arr.length-1;i++){
//            if(arr[i]>arr[i+1]) return false;
//        }
        //OR
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]) return false;
        }
        return true;
    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,3,5,6};
        System.out.println(isSorted(arr));
    }
}
