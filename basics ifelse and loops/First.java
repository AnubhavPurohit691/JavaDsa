
import java.util.Scanner;

 public class First{
    public static void main(String[] args) {
      try (Scanner input = new Scanner(System.in)) {
        System.out.println(input.nextLine());
        int a=234_000_000;
        System.out.println(a);
        // here a is identifier and value of a is literal
        float anubhav=50.4f;
        System.out.println(anubhav);
        String name = input.nextLine();
        System.out.println(name);
    }
        // Type Casting
        int b=(int)(33.43f);
        System.out.println(b);
        byte num= (byte)(257);
        System.out.println(num);// it will give 1 which is 257 % 256=1

        int num1= 'a';
        System.out.println(num1);//ascii value
    }
} 

 
// public before class is to access it to all files and static is that in First class it is not creating an object it is the first file. 
// to compile we use javac -d ../outfolder First.java
// to run java First



// to give input

// Scanner input= new Scanner(System.in);
// System.out.println(input.nextLine());


// primitive datatype are those data type which further can't be divided like int , float and char,double , long last mai L lagana   , boolean

//byte can only store 2^8 size number . 256
// -128 to-127 

// byte b=50
// b=b*2 give error  

// while(count!=5){
//  System.out.println("hello");
// count++;
// }