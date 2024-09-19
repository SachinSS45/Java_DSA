import java.util.Scanner;

/*
    Q.7 1's complement of number
    Input 1 : 5 ( 1 0 1 )
    Output 1 :2 ( 0 1 0 )
 */
public class ComplementOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int ans = 0;
        int rem = 0;
        int mul = 1;

        while(num!=0){
            rem = num % 2;
            rem = rem ^ 1;
            ans += rem * mul;
            mul*=2;
            num/=2;
        }
        System.out.println(ans);
    }
}
