package Array;
import java.util.Scanner;
public class Minimum_element_array {

    public static void main(String[]args){
        int arr[]=new int[5];
        int n=arr.length;

        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER ARRAYS ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       
        int min=arr[0];
        for(int i=0;i<=n-1;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);

        sc.close();
    }
}
