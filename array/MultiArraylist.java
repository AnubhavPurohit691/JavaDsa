
import java.util.ArrayList;

public class MultiArraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list=new ArrayList ();
        // initialisation
        for (int i = 0; i < 5; i++) {
            list.add(new ArrayList<>());
        }
// adding
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(list.get(i).add(i));
            }
            
        }
    }
}
