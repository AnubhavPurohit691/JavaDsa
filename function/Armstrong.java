
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        // 153 = 1cube+5^3 +3^3 =153
        Scanner in = new Scanner(System.in);
        int num= in.nextInt();
        boolean ans = isArmstrong(num);
        System.out.println(ans);
    }
    static boolean isArmstrong(int n ){
        int original=n;
        int sum=0;
        while (n>0) { 
            int rem=n%10;
            n=n/10;
            sum=sum+rem*rem*rem;
        }
        if(sum==original){
            return true;
        }
        return false;
    }
}
