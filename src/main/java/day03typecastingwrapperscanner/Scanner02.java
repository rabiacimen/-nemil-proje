package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

        //Example 1: Sayıları kullanıcıdan alan ve toplama işlemi yapan kodu yazınız.

        //1.adım: Scanner Class'ından object oluştur.
        Scanner input = new Scanner(System.in);

        //2.adım: Kullanıcıya ne yapacağını söyle
        System.out.println("Ilk sayiyi giriniz...");
        double sayi1 = input.nextDouble();

        System.out.println("Ikınci sayiyi giriniz...");
        double sayi2 = input.nextDouble();

        System.out.println(sayi1 + sayi2);




    }


}
