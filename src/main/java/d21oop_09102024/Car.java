package d21oop_09102024;

public class Car extends Vehicle {

    public String model = "Accord";
    public int year = 2024;

    public Car(){
        this("Sport");
        System.out.println("Sedan");
    }
    public Car(String tip){
        super();
        System.out.println("Sport");
    }

}