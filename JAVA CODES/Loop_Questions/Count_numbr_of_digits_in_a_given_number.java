package Loop_Questions;
import java.util.Scanner;
public class Count_numbr_of_digits_in_a_given_number {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any large number");
        int n=sc.nextInt();

        int ans;
        int count_digits=0;

        for(int i=1;i<=n;i++){
            ans=count_digits+1;
            // ans=count_digits;
            System.out.println(ans);
            
        }
        // System.out.println(ans);
        sc.close();
    }

}
