
import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        sum();
    
    }
   static  int sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1=in.nextInt();
        System.out.println("Enter num 2");
        int num2=in.nextInt();
        int sum = num1+num2;
       return sum;   
        
    }
}
// Primitives are short, int , double 