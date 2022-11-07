package day02methodcreation;

import java.sql.SQLOutput;

public class MethodCreation {

    //main method içerisinde kullanacagınız hersey static olmalıdır.

    public static void main(String[] args) {

        System.out.println(toplamaYap(1.2, 5));

        System.out.println(ucSayiyiCarp(2, 1.5, 6));

        System.out.println(ilkIkiyiToplaUcuncuIleCarp(2, 8, 3.2));


        System.out.println(esyaFiyatlariniTopla(12.99, 23.99, 15.99));

        System.out.println(degerleriCarp(15.99, 13, 12));

        System.out.println(basitFaizHesapla(10000, 6, 3));


    }

    //Example 1: Toplama islemi yapan bir method olusturunuz
    public static double toplamaYap(double a, double b){
        return a+b;

    }

    //Example 2: Üç sayıyı birbiri ile çarpan bir method oluşturunuz.
    public static double ucSayiyiCarp(double a, double b, double c){
        return a*b*c;
    }


    //Example 3: Uc sayidan ilk ikisini toplayip ucuncu ile carpan method olusturup, sonucu ekrana yazdirirniz
    public static double ilkIkiyiToplaUcuncuIleCarp(double a, double b, double c){

        return (a+b) * c;
    }

    //ödev 1: Herhangi bir 3 öğenin fiyatları için double data tipinde değişkenler oluşturunuz.
    public static double esyaFiyatlariniTopla(double a, double b, double c){
        return (a+b+c);
    }

    /*ödev 2: Herhangi bir 3 öğe için float, long ve integer data tipinde değişkenler oluşrutunuz.
              Bu değişkenlerin değerlerinin çarpımını konsola yazdırınız.
    */
    public float x = 15.99F;
    public long y = 13L;
    public int z = 12;

    public static double degerleriCarp(double x, double y, double z){
        return (x+y+z);

    }

    //ödev 3: Basit faizi bulmak için bir kod yazınız.
    public int anapara = 10000;
    public int oran = 6;
    public int yıldegeri = 3;

    public static double basitFaizHesapla(double anapara, double oran, double yıldegeri){
        return (anapara*oran*yıldegeri/100);
    }


}
