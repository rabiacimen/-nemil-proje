package day04ifstatement;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ilk isminizi giriniz...");
        String ilkIsim = input.next(); //next() methodeu kullanıcıdan String datası almak için kullanılır.

        //1.YOL
        System.out.println("Orta isminizi giriniz...");
        String ortaIsim = input.next();

        System.out.println("Soy isminizi giriniz...");
        String soyIsim = input.next();

        System.out.println("Kimlik numaranızı giriniz...");
        String kimlikNo = input.next();

        System.out.println(ilkIsim + " " + ortaIsim + " " + soyIsim);
        System.out.println(kimlikNo);

        //2.YOL
        System.out.println("Ilk, orta ve soy isiminizi ve kimlik numaraınızı giriniz...");
        String ilk = input.next();
        String orta = input.next();
        String soy = input.next();
        String kimlik = input.next();


        System.out.println(ilk + " " + orta + " " + soy);
        System.out.println(kimlik);

        //3.YOL
        System.out.println("Ilk, orta, ve soy isminizi giriniz...");
        String tamIsim = input.nextLine();

        System.out.println(tamIsim);

        System.out.println("Kimlik numaranızı giriniz...");
        String kimlikNumarası = input.next();
        System.out.println(kimlikNumarası);




    }



}
