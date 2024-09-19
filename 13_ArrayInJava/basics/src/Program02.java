import java.util.Arrays;
import java.util.Scanner;
/*
 Q.Find the last occurrence of ele in array
 Ex : arr = {5,3,2,4,5};
      searchEle = 5
      Output : 4
      searchEle = 2;
      Output : 2
      searchEle = 10
      Output : -1

      Two approaches :
      1)You can start checking from first and update index
        T.C in best Case : O(N)
        T.C in worst Case : O(N)
      2)If you start checking from last and whenever you get return index
        T.C in best Case : O(1) if searchEle present at last index
        T.C in worst case : O(N) if searchEle present at 0th index only once
 */
public class Program02 {
    static int lastOccurrence(int[] arr,int search){

        for(int start = arr.length-1;start>=0;start--){
            if(arr[start]==search) return start;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of array : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("for which ele you want to find last occurrence : ");
        int searchEle = sc.nextInt();
        System.out.println("lastOccurrence of " + searchEle + " : " + lastOccurrence(arr,searchEle));
    }
}
