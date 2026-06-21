import java.util.Scanner;
import java.math.BigInteger;
public class takingInput {
    public static void main(String []args){

        //TAKING INPUT FROM USER

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter value for first num");
        int firstnum=sc.nextInt();

        System.out.println("Enter value for second num");
        int secondnum=sc.nextInt();

        int ans =firstnum+secondnum;
        System.out.println(ans);


        // FOR BIG INTEGERS
        
        BigInteger bg=sc.nextBigInteger();
        System.out.println("BIG INTEGER"+bg);





        sc.close();

    }
}
