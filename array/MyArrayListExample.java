import java.util.ArrayList;

public class MyArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>(10);// it neglet intial capacity when new element added.
        list.add(56);
        list.add(670);
        System.out.println(list);
        System.out.println(list.get(1));
        
    }
}
// import java.util.ArrayList;
// public class ArrayList {
//     public static void main(String[] args) {
//      ArrayList<Integer>list =new ArrayList<>();
//     }
// }
