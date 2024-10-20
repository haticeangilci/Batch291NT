package d2variables04092024;

public class Variables01 {

    public static void main(String[] args) {

        //Java bu satiri okumaz. Kendimize veya baskasina aciklamadir

        /*
        1) Java dili Strongly Typed’dir, bu nedenle Java’daki her değişken(variable), belirli
        veri türü(data type) ile iliskilendirilmelidir.
        2) Kod yazanin değişkenlere uygun değerlerin atandığından emin olması her zaman gerekir.
        Aksi takdirde hata oluşur.
         */

        //-------------------------------
        //Ornek 1: String data tipinde ismi hi olan bir variable olusturarak,
        // icine “Hello World” yukleyip console’a yazdiriniz.

        //Example 1: By creating a String data type variable with the name hi,
        // load “Hello World” into it and write it to the console.

        //Siralama nasil olacakti?
        //Data Type ==> Variable Name ==> Atama Operatoru ==> Data ==> Noktali Virgul

        String              hi                  =          "Hello World"      ;
        System.out.println(hi);

        //----------------------------------------------
        //Ornek 2 : Tamsayi(int) data tipinde ismi age olan bir variable olusturunuz
        // ve icine 15 yukleyip console’a yazdiriniz
        //Example 2: Create a variable with the name age of integer (int) data type
        // and load 15 into it and write it to the console

        int age = 15;
        System.out.println(age);//15

        //------------------------------------------------------------
        //1- byte data type:
        //tam sayilar icindir. Hafizada 1 byte(8 bit) yer kaplar
        //-128 den + 127’e tamsayi degerleri için kullanilir

        //Ornek 1 : byte data tipinde ogrenci yasi icin bir variable olusturun ve deger atayin.
        //Example 1: Create a variable for student age in byte data type and assign a value.

        byte studentAge = 13;
        System.out.println(studentAge);//13

        //-----------------------------------------
        //2- short data type:
        //Tam sayilar icindir. Hafizada 2 byte(16 bit) yer kaplar. Aralik (range) genisledi.
        //-32768 den + 32767’e tamsayi degerleri icin kullanilir

        //Ornek 1: Site nufusu icin bir variable olusturun ve 1200 degerini atayin.
        //Example 1: Create a variable for the site population and assign it the value 1200.

        short sitePopulation = 1200;
        System.out.println(sitePopulation);

        //-----------------------------------------------
        //3- int data type:
        //tam sayilar icindir. Hafizada 4 byte (32 bit) yer kaplar
        //-2,147,483,648 ile 2,147,483,647’e tamsayi degerleri icin kullanilir
        //Ornek 1: Ulke nufusu icin bir variable olusturun ve deger atayin.
        //Example 1: Create a variable for the country population and assign a value.

        int countryPopulation = 84234543;
        System.out.println("countryPopulation = " + countryPopulation);

        //---------------------------------------------------------------
        //Ornek 2: Iki tane int variable olusturun ve toplamlarini console’a yazdirin.
        //Example 2: Create two int variables and print their sums to the console

        int a = 11, b = 10;
        System.out.println("Toplam = " + (a + b ));

    }
}