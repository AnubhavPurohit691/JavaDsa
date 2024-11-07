public class Overloading {
    public static void main(String[] args) {
        fun(12);
    }
    static void fun(int a){
System.out.println(a);
    }
    static void fun(String v){
System.out.println(v);
    }
    // compiler will automatically decide which func has to call
}
