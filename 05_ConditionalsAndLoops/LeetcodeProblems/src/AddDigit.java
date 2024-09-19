import java.util.Scanner;
/*
    Q.1 AddDigit :
        1)Input : 14
          Output : 5
        2)Output : 269
          Output : 8
          Explanation : 269 -> 2 + 6 + 9 -> 17 -> 1 + 7 => 8

 */
public class AddDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = num;
        int ans = 0;
        while (num != 0) {

            int rem = num % 10;
            ans += rem;
            num /= 10;
            if(ans>9 && num==0) {
                num = ans;
                ans = 0;
            }
        }
        System.out.println(ans);

        //2
        int ans1 = 0;
        int rem1 = 0;

        while(num1>9){
            ans1 = 0;
            while(num1!=0){
                rem1 = num1%10;
                ans1+=rem1;
                num1/=10;
            }
            num1 = ans;
        }
        System.out.println(num1);
    }
}
