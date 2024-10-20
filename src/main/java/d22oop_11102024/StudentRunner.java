package d22oop_11042024;

public class StudentRunner {
    public static void main(String[] args) {

        Student s = new Student();

        System.out.println(s.getAge()); //13
        System.out.println(s.isSuccessful()); //true

        s.setAge(25);
        System.out.println(s.getAge()); //25

        s.setSuccessful(false);
        System.out.println(s.isSuccessful()); //false


        //ODEV: encapsulation da private ile gizlenen bir veri baska package'dan
        // set method ile degistirilebilir mi?




    }
}