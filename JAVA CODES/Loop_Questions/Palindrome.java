package Loop_Questions;

import java.util.Scanner;

public class Palindrome {
    // Jo number ulta karne par bhi same rahe.
    public static void main(String[]args){

    // CHECK NUMBER IS PALINDROME OR NOT 

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = sc.nextInt();

    int original = n;
    int reverse = 0;
    while (n > 0) {

        int digit = n % 10;      // last digit nikalo

        reverse = reverse * 10 + digit; // reverse banao

        n = n / 10;
    }
        // last digit hatao

        if (original == reverse) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }

        sc.close();
    }
}

    

    
