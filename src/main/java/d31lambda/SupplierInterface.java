package d31lambda;

import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {
        //Ornek: Rastgele sayi ureten bir method olusturunuz.
        //Example: Create a method that generates random numbers.

        Supplier<Double>randomSupplier = () -> Math.random();
        System.out.println(randomSupplier.get());

        Supplier<Integer>constantNumber =()-> 42595957;//sabit değerler çağırmak için kullanılır constant
        System.out.println(constantNumber.get());





    }







}
