import java.util.Scanner;
/*
    Q.6 Palindrome Number :
    Input 1 : 123
    Output 1 : false
    Input 2 : 121
    Output 2 : true
 */
public class PalindromeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(isPalindrome(num));
        //System.out.println(~5);//-6
    }

    private static boolean isPalindrome(int num) {
        if(num < 0)
            return false;
        int temp = num;
        int rev = 0;
        int rem = 0;
        while(temp!=0){
            rem = temp % 10;
            if(rev > (Integer.MAX_VALUE/10))
                return false;
            rev = rev * 10 + rem;
            temp/=10;
        }
        return rev==num;
    }
}
