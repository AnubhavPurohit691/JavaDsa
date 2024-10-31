
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5);
    }
    static void fun(int ...v){ //this helps to give many value of int as a param its a array of integer it will take any no of arrguments.
        System.out.println(Arrays.toString(v));
    }
}
