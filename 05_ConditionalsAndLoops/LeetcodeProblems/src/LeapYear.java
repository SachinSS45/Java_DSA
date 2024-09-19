import java.util.Scanner;

/*
 Q.2 Leap Year
    Input : 2000
    Output : Leap Year

    Input : 2100
    Output : Not Leap Year

 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year % 400 == 0){
            System.out.println("Leap Year");
        }else if(year % 4== 0 && year % 100!=0){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not Leap Yer");
        }
    }
}
