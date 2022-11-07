package day24statickeywordencapsulation;

public class Car {

    public static String make= "Honda"; //yaptığımız değişikliğin tüm objeler tarafından görülmesini istersek static yaparız.
    public String model = "Accord";
    public int price=20000;
    public static int counter=0;// herkes görsün diye static yaptık


    public Car(){ //constructor oluşturduk
        counter++;
        price++;
    }

}
