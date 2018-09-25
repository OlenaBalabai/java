public class Main {

    /**
     This
     is
     documentation
     comment
     */
    public static void main(String[] args) {
        //region Some variables should be described here
        //region best practice to declare and define in one line   boolean myBoolVar = False;
        boolean boolVar;

        boolVar = true;

        boolVar = false;
        //endregion
        int a = 101; // decimal-form literal
        int b = 0100; // octal-form literal
        int c = 0xFace; // Hexa-decimal form literal
        int d = 0b1111; // Binary literal
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        System.out.println("boolVar = " + boolVar);


        int myVariable = 20;
        myVariable = 40;


        System.out.println(myVariable);

        // single line comment
        // /* Multi-line comments */

        /*1. Please add double, float, byte, , string, char, short and long variable with some value and print variables
        * 2. print literals of some strings, numbers, chars*/
    }
}