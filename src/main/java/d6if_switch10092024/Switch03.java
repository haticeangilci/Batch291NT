package d6if_switch10092024;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {

        /*Yeni switch ifadesi, daha esnek ve güçlü bir yapı sunarak, geleneksel switch-case
        yapısının daha temiz ve ifade edilebilir hale getirilmesini sağlar.

        Ayrıca, daha önceki switch yapısı değer döndürmezken, yeni switch ifadesi bir değer döndürebilir
         ve bu değer doğrudan bir değişkene atanabilir.

        Yeni switch ifadesinin ana özellikleri:

        Case değerleri: Birden fazla case ifadesini tek bir işlemle birleştirme imkanı.
        Arrow (->) Operatörü: Geleneksel break yerine kullanılarak, kodun daha okunabilir olmasını sağlar.*/

        //--------------------
        /*Ornek 1:  Kullanıcıdan bir ay numarası girmesini isteyin (1 ile 12 arasında).
        Girilen ay numarasına göre mevsimi belirleyen ve sonucu konsola yazdıran bir program yazınız.*/

        /*Example 1: Ask the user to enter a month number (between 1 and 12).
        Write a program that determines the season according to the entered month number and prints the result to the console.*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen ay numarasini giriniz(1-12)");
        int month = scanner.nextInt();





    }
}