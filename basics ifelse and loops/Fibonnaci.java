
import java.util.Scanner;

public class Fibonnaci {
   public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    int n = in.nextInt();
    int prev = 1;
    int a=0;
    // 1
    // int sum=0;
    // for(int i=0;i<=n;i++){
    //     System.out.println(sum);
    //     sum=a+prev;
    //     a=prev;
    //     prev=sum;
    // }

    // 2
    for(int i=0;i<=n;i++){
        int c=prev;
        prev=a+prev;
        a=c;
    }
    System.out.println(prev);
   } 
}
// 0,1,1,2,3,5,9,13....