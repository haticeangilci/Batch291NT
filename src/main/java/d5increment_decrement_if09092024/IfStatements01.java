package d5increment_decrement_if09092024;

public class IfStatements01 {
    public static void main(String[] args) {

        //if Statements

        if (3 < 5) {
            System.out.println("condition dogru, if calisti");
        }

        //-------------
        if (7 == 4 + 3) {
            System.out.println("if calisti cunku condition dogru");
        }

        //------------

        //Ornek 1: Sayi 0 (dahil) ile 10 (haric) arasinda ise ekrana "Rakam" yazdirin.
        //Example 1: If the number is between 0 (included) and 10 (excluded), print "Number" on the screen.

        int num = 12;

        if (num > -1 && num < 10) { //num >= 0; da yazabilirim
            System.out.println("Rakam");
        }

        //---------------
        //Ornek 2: Sayi uc basamakli ise ekrana "Sayi üç basamaklidir" yazdirin.
        //Example 2: If the number is three digits, print "The number is three digits" on the screen.

        int n = 67;

        if (n > 99 && n < 1000) {
            System.out.println("Sayi uc basamaklidir");
        }


    }
}