import java.util.Scanner;

/*
    Q.3 Reverse Integer
    Input : 123
    Output : 321
    Input : 1234
    Output : 4321
 */
public class ReverseInteger {
    public static int reverse(int num){
        int rev = 0;
        int rem = 0;
        while(num!=0){
            rem = num % 10;
            if(rev > (Integer.MAX_VALUE / 10) || rev < (Integer.MIN_VALUE/10)){
                return  0;
            }
            rev = rev * 10 + rem;
            num /= 10;
        }
        return rev;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //while(num <= Integer.MAX_VALUE) {
            System.out.println(num + " " + reverse(num));
          //  num = num +1;
        //}
    }
}
