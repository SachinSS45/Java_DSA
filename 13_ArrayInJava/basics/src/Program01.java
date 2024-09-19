/*
    Q.Count the number of occurrences of particular element
    Ex 1 : arr = {5,6,5,1,5}
         searchele = 5
         count = 3
       2 : searchele = 7
         count = 0;
    T.C : O(N)
    S.C : O(1)
 */
import java.util.Arrays;
import java.util.Scanner;
public class Program01 {

    static int countOccurrences(int[] arr,int search){
        int count = 0;
        for(int data : arr){
            if(data == search) count++;
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
        System.out.println("for which ele you want to find no of occurrences : ");
        int searchEle = sc.nextInt();
        System.out.println("Count of " + searchEle + " : " + countOccurrences(arr,searchEle));
    }
}
