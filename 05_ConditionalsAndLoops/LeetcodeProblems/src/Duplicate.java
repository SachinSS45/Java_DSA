/*
    Q.4 Duplicate Number in Array :
     Input : arr = { 1, 2, 3, 4, 4}
     Output : 4
     Note : Array contains size of n where elements are from 1 to n-1,
     where one of them is duplicate ,we have to find out that duplicate number.
 */
public class Duplicate {

    //double for loop -> O(n*n)
    //Sorting -> O(n*log(n))
    //Cyclic Sort -> O(n) -> for range problem only
    //XOR -> 0(n) Space : O(1) use variable
    //sum of n natural numbers formula : O(n)
    //Hashmap : O(n) (space and time both)
    //Horse and Tortoise

    public static int duplicate(int[] arr){

        int n = arr.length;
        int sum1 = ((n-1)*(n))/2;
        int sum2 = 0;
        for (int j : arr) {
            sum2 += j;
        }

        return sum2-sum1;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4};
        System.out.println(duplicate(arr));
    }
}
