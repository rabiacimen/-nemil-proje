package day24statickeywordencapsulation;

import org.w3c.dom.ls.LSOutput;

public class CarRunner {




    public static void main(String[] args) {


        Car car1=new Car(); // obje oluşturduk. bunu kullanarak counter'a ulaşıcam
        Car car2=new Car();
        Car car3=new Car();
        Car car4=new Car();

        System.out.println(car1.counter); //4 //normalde counter'a class ismiyle ulaşmmaız lazım. static variable'lere objeleri kullanarak ulaşmak mümkün ama tavsiye edilmez.
        System.out.println(car1.price);//20001

        System.out.println(car2.counter); //4  //System.out.println(Car.counter);
        System.out.println(car2.price);//20001


        System.out.println(car3.counter); //4  // System.out.println(Car.counter);
        System.out.println(car3.price);//20001

        System.out.println(car3.counter); //4  //System.out.println(Car.counter);
        System.out.println(car3.price);//20001


        System.out.println(Car.counter); //class isminden counter'a ulaşmak doğru yöntemdir.


        /*
    Static keyword classa baglanmıs class elemanlaridir
    Static class elemanlari butun objelerin ortak elemanidir(Gokteki ay gibi)
    Staticler uzerinde yapilan her degisiklik butun obeleri etkiler, butun objeler tarafindan gorulur.
    Static class elemanlarina class uzerinden ulasilir. Objeler staticlere ulasmak icin kullanilmaz.
       kullanimda hata vermez ama tavsiye edilmez.
 */


    }


}
