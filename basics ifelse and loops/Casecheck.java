
import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        char c= in.next().trim().charAt(0);
        // next take first word and nextLine take whole sentence
        if(c>='a'&& c<='z'){// single comma for char

            System.out.println("lowercase");
        }
        else{
System.out.println("Highercase");
        }

    }
}
