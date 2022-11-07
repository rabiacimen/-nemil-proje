package day10stringmanipulations.odev;

public class typecasting {


    public static void main(String[] args) {

        //soru1)
        short yas = 12;
        int yeniYas = yas;
        System.out.println(yeniYas);

        //soru2)
        long age = 12L;
        int newAge = (int)age;
        System.out.println(newAge);

        //soru3)
        double fiyat = 2.34;
        float yeniFiyat = (float)fiyat;
        System.out.println(yeniFiyat);

        //soru4)
        double price = 1.2;
        short newPrice = (short)price;
        System.out.println(newPrice);

        //soru5)
        byte numeric = 23;
        double newNumeric = numeric;
        System.out.println(newNumeric);




    }
}
