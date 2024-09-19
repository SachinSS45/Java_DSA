/*
    Q.5 check the number is power of two or not ?
    Input 1 : Negative
    Output 1 : false
    Input 2 : 32
    Output : true
 */
public class PowerOfTwo {

    public static boolean isPowerTwo(int num){
        if(num < 1) return false;
        while(num!=1){
            if(num % 2==1) return false;
            num/=2;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPowerTwo(21));
    }
}
