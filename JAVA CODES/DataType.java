public class DataType {
    public static void main(String args[]){ 

        // IF I WILL WRITE NUM2=500 , SO IT SHOWS INCOMPATIBLE ERROR 
        // BECAUSE ITS OUT OF RANGE , ITS RANGE IS (-128 TO 127);

        byte num1=127;
       // byte num2=500;
        System.out.println(num1);
        
        short num2=5123;
        System.out.println(num2);

        // FLOATING NUMBERS
        float num3=3.14111222f;
        System.out.println(num3);

        // DOUBLE NUMBERS

        double num4=3.144423285895;
        System.out.println(num4);

        //CHAR , BOOLEAN 

        char firstcharacter='a';
        char ch=(char)('a'+9);
        System.out.println(firstcharacter);
        System.out.println(ch);

        boolean eligibleToVote=false;
        System.out.println(eligibleToVote);

        //IMPLICIT AND EXPLICTIT TYPE CASTING

        // IMPLICIT TYPE CASTING

        byte num5=127;
        long newnum=num5;
        System.out.println(newnum);
        System.out.println(num5);

        // EXPLICIT TYPE CASTING

        long value1=1234991239;
        int value2=(int)value1;
        System.out.println(value2);
    }
    
}
