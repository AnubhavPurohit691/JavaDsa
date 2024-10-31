
import java.util.Scanner;

public class Qoneprimenumber {
 public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    boolean ans1=isPrime1(n);
    boolean ans2 = isPrime2(n);
    boolean ans3=isPrime3(n);
    System.out.println(ans1);
    // System.out.println(ans2);
 }   

static boolean isPrime1(int n){
    if(n==1 ){
        return false;
    }
    int dividernumber=0;
    for(int i = 1;i<=n;i++){
        if(n%i==0){
            dividernumber=dividernumber+1;
        }
    }
    if(dividernumber==2){
        return true;
    }
    return false;
}

 static boolean isPrime2(int n){
    if(n<=1){
return false;
    }
    int c=2;
        while (c*c<=n) { 
            if(n%c==0){
                return false;
            } 
            c++;}
   
    return c*c>n;//this will return true or false
 }
 static boolean isPrime3(int n){
    int countdivider=0;
    for(int i =1;i<=Math.sqrt(n);i++){
        if(n%i==0){
            countdivider++;
        }
        if (countdivider==2) {
            return true;
        }

    }
    return false;
 }
}
