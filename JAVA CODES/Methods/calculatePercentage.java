import java.util.Scanner;
public class calculatePercentage{

    // Create a method calculatePercentage(int obtained, int total).
    public static int percentage(int obtained, int total){
        int percentage=(obtained/total)*100;
        return percentage;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER ANY MUMBER ");
        int obtained=sc.nextInt();
        int total=sc.nextInt();
        int res=percentage( obtained, total);
        System.out.println(res);

        sc.close();
    }
    

}

