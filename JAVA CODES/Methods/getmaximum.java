package Methods;
import java.util.Scanner;

//  Create a method getMaximum(int a, int b) that returns the larger number.
public class getmaximum{
    public static int maximum(int a, int b){
        if(a>b){
            
            return a;
        }
        else{
            
            return b;
        }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER TWO NUMBERS");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int result=maximum(a,b);
        System.out.println("MAXIMUM NUMBER IS :"+result);

        sc.close();
    }
}


