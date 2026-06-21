import java.util.Scanner;
public class Conditions {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER VALUES IN BETWEEN 1 TO 4");
        int value=sc.nextInt();

        // USING SWITCH CASE

        switch(value){
            case 1:

                // USING IF CONDITION

                System.out.println("Enter your age");
                int age=sc.nextInt();

                if (age>=18){
                    System.out.println("you are eligible to vote");
                }
                break;

            case 2:

            // USING IF-ELSE CONDITION

                System.out.println("Enter your Score");
                int score=sc.nextInt();

                if(score>=75){
                    System.out.println("Pass");
                }

                else{
                    System.out.println("Fail");

                }
                break;

            case 3:

            // USING IF-ELSE-IF CONDITION

            System.out.println("Enter Accuracy");
            int accuracy=sc.nextInt();

            if(accuracy>=80){
                System.out.println("EXCELLENT");
            }
            else if(accuracy>=60){
                System.out.println("GOOD");
            }
            else if(accuracy>=40){
                System.out.println("AVERAGE");
            }
            else{
                System.out.println("FAIL");
            }
            break;

        //     case 4:
        //     Scanner sc = new Scanner(System.in);

        //     System.out.println("Do you have a problem? (true/false)");
        //     boolean hasProblem = sc.nextBoolean();

        //     if(hasProblem){

        //         System.out.println("Enter problem level:");
        //         int problem = sc.nextInt();

        //         if(problem >= 4){
        //             System.out.println("You have a big problem");
        //         }
        //         else{
        //             System.out.println("You have a small problem");
        //         }

        //     }
        //     else{
        //         System.out.println("You have no problem");
        //     }
                    
                
        
        // }

        

            
            

        }
        sc.close();
    }
    
}
    
    

