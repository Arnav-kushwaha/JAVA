package Methods;
import java.util.Scanner;
public class is_even{
    // Create a method isEven(int number) that returns true if the number is even.
    public static boolean even_number(int num){
        if(num%2==0){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER");
        int num=sc.nextInt();
        boolean result=even_number(num);
        System.out.println(result);

        sc.close();
    
    }

}
