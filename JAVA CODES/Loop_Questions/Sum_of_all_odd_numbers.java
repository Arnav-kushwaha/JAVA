package Loop_Questions;
import java.util.Scanner;

public class Sum_of_all_odd_numbers {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER NUMBER IN BETWEEN 1-1000");
        int n=sc.nextInt();

        int count=0;
        for (int i=1;i<=n;i+=2){
            count=count+i;
            
            System.out.println("ADD OF ALL ODD VALUES :"+count);

        }

        sc.close();
    }
    
    
}
