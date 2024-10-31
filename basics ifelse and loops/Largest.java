
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b= in.nextInt();
        int c=in.nextInt();
        // if(a>b&&a>c){
        //     System.out.println("a is largest number");
        // }
        // else if (b>a&&b>c) {
        //    System.out.println("b is largest number"); 
        // }
        // else{
        //     System.out.println("c is largest number");
        // }


        // 2.
        // int max=a;
        // if(b>max){
        //     max=b;
        // }
        // else if (c>max) { // this statement states  that the else if is only valid when if is not correct.
        //     max=c;
        // }
        // System.out.println(max);


        // 3.
        int max=Math.max(Math.max(a,b),c);
        System.out.println(max);
        
    }
}
