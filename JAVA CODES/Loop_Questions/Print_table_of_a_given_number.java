
package Loop_Questions;
import java.util.Scanner;
public class Print_table_of_a_given_number {
    public static void main(String args[]){

        //PRINT THE TBALE OF A GIVEN NUMBER( nx1 to nx10)

        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER");
        int n=sc.nextInt();
        
        for (int i =1; i<=10;i++){
            System.out.println(n*i);

        }
        System.out.println("----COMPLETED----");


        
        sc.close();

    }
}
