import java.util.ArrayList;
import java.util.Arrays;

public class Program05 {

    //Approch : 1 T.C : O(n^2)
    static void rotateByD(int[] arr,int d){
        int size = arr.length;
        d = d%size;
        while(d!=0){
            int temp = arr[0];
            for(int i=1;i<size;i++){
                arr[i-1] = arr[i];
            }
            arr[size-1] = temp;
            d--;
        }
    }
    static void rotateByD2(int[] arr,int d){
        int size = arr.length;
        d = d % size;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<d;i++){
            list.add(arr[i]);
        }
        int index = 0;
        for(int i=d;i<size;i++){
            arr[index] = arr[i];
            index++;
        }
        int temp = d+1;
        for(int ele : list){
            arr[temp] = ele;
            temp++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotateByD2(arr,3);
        System.out.println(Arrays.toString(arr));
    }
}
