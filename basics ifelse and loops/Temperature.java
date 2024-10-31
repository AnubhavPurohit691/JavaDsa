
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Print the temp in c");
        float tempc= in.nextFloat();
        float tempF=(tempc*9/5)+32;
        System.out.println("temp in f is : "+tempF);

    }
}
