package Methods;
import java.util.Scanner;
public class overload_method{
    //  Create an overloaded method display() with:

    // one int parameter, or
    // one String parameter.

    public static void display(int parameter){
        System.out.println("NUMBER :"+parameter);


    }

    public static void display(String parameter){
        System.out.println("NAME: "+parameter);


    }
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("ENTER ANY NUMBER");
    int number=sc.nextInt();
    System.out.println("ENTER STRING PARAMETER");
    String name=sc.next();
    display(number);
    display(name);

    sc.close();

}



}