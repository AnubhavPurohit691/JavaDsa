

public class Countingoccurrences {
    public static void main(String[] args) {
        // Scanner in =new Scanner(System.in);
        // String longnumber= in.nextLine(); 
        // String n= in.nextLine(); 
        // int digitlength= longnumber.length();
        // for(int i=0;i<digitlength;i++){
        //     String longn=longnumber.charAt(i);
        //     if(n==longn){

        //     }
        // }


        int n= 14555;
        int count = 0;
        for(int i=n;i>0;i=i/10){
            int rem= i%10;
            if(rem==5){
                count++;
            }
        }
        System.out.println(count);
    }
}
