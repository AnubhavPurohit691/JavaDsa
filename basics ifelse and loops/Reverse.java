
import java.util.Scanner;

public class Reverse {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    int newn=0;
    for(int i=n;n>0;n=n/10){
        int rem=n%10;
      newn=  newn*10+rem;
    }
    System.out.println(newn);
   } 
}
