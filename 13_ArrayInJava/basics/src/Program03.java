import java.util.Arrays;
import java.util.Scanner;

public class Program03 {
    static int greaterEle(int[] arr,int x){
        int count = 0;
        for(int data : arr){
            if(data>x) count++;
        }
        return count;
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
        System.out.println("for which ele you want to find no of greater elements : ");
        int searchEle = sc.nextInt();
        System.out.println("No. of greater elements than " + searchEle + " : " + greaterEle(arr,searchEle));
    }
}
