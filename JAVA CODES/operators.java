public class operators {
    public static void main(String args[]){

        // ARITHMETIC OPERATORS

        int solvedThisWeek=25;
        int solvedLastWeek=20;

        int Total= solvedThisWeek+solvedLastWeek;
        int Difference= solvedThisWeek-solvedLastWeek;
        int multiply=solvedThisWeek*4;
        int divide=solvedThisWeek /7;
        int remainder=solvedThisWeek %7;

        
        System.out.println(Total);
        System.out.println(Difference);
        System.out.println(multiply);
        System.out.println(divide);
        System.out.println(remainder);

        // RELATIONAL OPERATOR

        int CurrentStreak=44;
        int targetStreak=50;
        System.out.println(CurrentStreak==targetStreak);
        System.out.println(CurrentStreak>targetStreak);
        System.out.println(CurrentStreak<targetStreak);
        System.out.println(CurrentStreak>=targetStreak);
        System.out.println(CurrentStreak!=targetStreak);  
        System.out.println(" COMPLETED RELATIONAL OPERATORS");

        // LOGICAL OPERATORS


        boolean CompletedDsa=true;
        boolean CompletedCore=false;

        System.out.println(CompletedDsa && CompletedCore);
        System.out.println(CompletedDsa || CompletedCore);
        System.out.println(!CompletedDsa);
        System.out.println(!CompletedCore);

        // ASSIGNMENT OPERATORS

        int ratingpoints=100;
        ratingpoints +=20;
        System.out.println(ratingpoints);
        ratingpoints -=10;
        System.out.println(ratingpoints);
        ratingpoints *=2;
        System.out.println(ratingpoints);
        ratingpoints /=5;
        System.out.println(ratingpoints);

        // UNARY OPERATORS

        int activeusers=100;
        int prefix=++activeusers; //INCREMENT FIRST THEN UTILISE 
        int postfix=activeusers++; //UTILISE FIRST THEN INCREMENT

        System.out.println(prefix); 
        System.out.println(postfix);
        System.out.println(activeusers);



    


        

    }
    
}
