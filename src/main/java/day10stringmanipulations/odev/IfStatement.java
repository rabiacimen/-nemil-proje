package day10stringmanipulations.odev;


import java.util.Scanner;

public class IfStatement {


    public static void main(String[] args) {
          /* SORU1:Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        a) Aralık, Ocak, Şubat için "Kış"
        b) Mart, Nisan, Mayıs için "İlkbahar"
        c) Haziran, Temmuz, Ağustos için "Yaz"
        d) Eylül, Ekim, Kasım için "Sonbahar"
        e) Diğerleri için "Geçersiz ay adı"



        String ayAdi = "ocak";
        ayAdi = ayAdi.toLowerCase();
        if (ayAdi.equals("aralik") || ayAdi.equals("ocak") || ayAdi.equals("subat")) {
            System.out.println("Kış");
        } else if (ayAdi.equals("mart") || ayAdi.equals("nisan") || ayAdi.equals("mayis")) {
            System.out.println("Ilkbahar ");
        } else if (ayAdi.equals("haziran") || ayAdi.equals("temmuz") || ayAdi.equals("agustos")) {
            System.out.println("Yaz ");
        } else if (ayAdi.equals("eylul") || ayAdi.equals("ekim") || ayAdi.equals("kasim")) {
            System.out.println("Sonbahar ");
        } else {
            System.out.println("Gecersiz ay adi ");
        */


    /* SORU2:Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
    a) Şifre boşluk karakterinden farklı en az 8 karakter içeriyorsa "Geçerli Şifre"
    b) Herhangi bir pozisyonda şifrede boşluk karakteri varsa "Şifrede boşluk karakteri kullanmayınız"
    c) a ve b koşullarının sağlanmaması durumunda "Geçersiz Şifre

     */

       /* String sifre = "rabia 357";
        if (sifre.contains(" ")) {
            System.out.println("lütfen boşluk karakteri kullanmayınız");

        } else if (sifre.replaceAll("\\s", "").length() >= 8) {
            System.out.println("Geçerli şifre");

        } else {
            System.out.println("Gecersiz Sifre ");  // benim denediğim çözüm.. fakat çalışmadı
        }
        */
           /*String ssifre = "a1b2c3d4";
            if (ssifre.replaceAll("\\S", "").length() > 0) {
                System.out.println("Sifrede bosluk karakteri kullanmayiniz");
            } else if (sifre.replaceAll("\\s", "").length() >= 8) {
                System.out.println("Gecerli Sifre");
            } else {
                System.out.println("Gecersiz Sifre ");
            }
            */


       /* //SORU3:Ayın numarasını girdiğinizde ayın adını yazdırmak için gereken kodu yazınız.
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen ay numarası giriniz");
        byte ayNumarasi = input.nextByte();
        switch (ayNumarasi) {
            case 1:
                System.out.println("ocak");
            case 2:
                System.out.println("şubat");
            case 3:
                System.out.println("mart");
                break;

            default:
                System.out.println("lütfen geçerli bir ay numarası giriniz");

        }
*/
        //kitap çözüm:
        Scanner inputt = new Scanner(System.in);
        /*System.out.println("lütfen ay numarası giriniz");
        byte ayNo = inputt.nextByte();

        if (ayNo == 1) {
            System.out.println("ocak");

        } else if (ayNo == 2) {
            System.out.println("şubat");

        } else if (ayNo == 3) {
            System.out.println("mart");
        } else {
            System.out.println("geçerli bir ay numarası girizniz");
        }
        */
        /*SORU4:Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
a) Son basamak 5 ‘e eşit ve 5 den büyükse, yuvarlama işlemi: “Son basamağı bir üst ondalığa yuvarla”
b) Son basamak 5 den küçükse, yuvarlama işlemi: “Son basamağı bir alt ondalığa yuvarla
         */

        /*int j = 124;
        if(j%10>=5){
            System.out.println((j/10+1)*10);
        }else{
            System.out.println((j/10)*10);
        }
        */

        /* SORU5: Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
        b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
        c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen"

         */

       /* int a = 4;
        int b = 4;
        int c = 4;
        if (a == b && b == c) {
            System.out.println("eşkenar üçgen");

        } else if (a == b && b != c || a == c && b != c || b == c && a != c) {
            System.out.println("ikizkenar üçgen");

        } else {
            System.out.println("çeşit kenar üçgen");
        }
        */


        /*
        ************************************************************************************************
        SORU6: Mili km'ye, saniyeyi saate, fahrenhaytı santigrata çeviren bir dönüştürücü oluşturmak için
        kod yazınız. Google'dan dönüşümler için formülleri bulunuz.
        a) Kullanıcı mile değerini 10 ve operatorü mildenKmye olarak girdiğinde,
        konsolda kodunuz "16 km" yazmalıdır (sayı dinamik olacak)
        b) Kullanıcı saniye değerini 7200 ve operatorü saniyedenSaate olarak girdiğinde, konsolda
        kodunuz "2" yazmalıdır (sayı dinamik olacak)
        c) Kullanıcı fahrenheit değerini 83 ve operatorü fahrenaytdanSantigarata olarak girdiğide,
        konsolda kodunuz "28.3333 santigrat" yazmalıdır (sayı dinamik olacak)
        ****************************************************************************************************
         */
        /*
        SORU7:Tam isim için dilbilgisi kurallarını kontrol etmek için kodu yazınız.
        a) Kodunuz "ali Can", "Ali can", "ali can" için "Baş harflerinde hata" yazmalıdır.
        b) Kodunuz, aşağıdaki gibi tek kelimeler için "Ad veya soyadı eksik" yazmalıdır.
        c) "Ali" veya "Can" veya "ali"Kodunuz "ALI CAN" gibi tüm formatlar için "Format hatası" yazmalıdır.
        d) Kodunuz bir veya daha fazla boşluk (" " veya " " gibi karakterler) için " Isim girilmedi"
        yazmalıdır.
        e) Ad, harfler ve boşluktan başka herhangi bir karakteri içeriyorsa, kodunuz "Geçersiz Ad"
        yazmalıdır
         */
        /*
        SORU8:ABD'deki eyalet kısaltmalarının biçimini kontrol etmek için kod yazınız.
        a) Kısaltma 2'den fazla karakter içeriyor ise kodunuz, "Eyalet kısaltmaları 2 karakterden faZLa olamaz" yazmalıdır.
        b) Kısaltmada küçük harfler var ise kodunuz, "Eyalet kısaltmaları küçük harf içeremez" yaZmalıdır.
        c) Kısaltmanın harflerinden farklı karakterler var ise kodunuz,
        "Eyalet kısaltmaları aşağıdAkilerden farklı karakterler içeremez" yazmalıdır.
         */

        String d= "f1!";
        if(d.length()>2){
            System.out.println("Eyalet kisaltmalari 2 karakterden fazla olamaz ");
        }if (d.replaceAll("[^a-z]","").length()!=0) {
            System.out.println("Eyalet kisaltmalari kucuk harf iceremez ");
        }if (d.replaceAll("[^A-Za-z]","").length()!=0);
        System.out.println("Eyalet kisaltmalari asagidakilerden farkli karakterler iceremez ");

        /*
        SORU9: Herhangi bir 2 sayıyla toplama, çıkarma, çarpma ve bölme yapan basit bir hesap makinesi
        oluşturmak için kod yazınız.
        a) Kullanıcı 10.2 ve 5 ve + işaretini girdiğinde kodunuz konsolda "Sonuç 15.2" yazmalıdır.
        b) Kullanıcı 10 ve 5 ve - işaretini girdiğinde kodunuz konsolda "Sonuç 5.0" yazmalıdır.
        c) Kullanıcı 10 ve 5.3 ve * işaretini girdiğinde kodunuz konsolda "Sonuç 53.0" yazmalıdır.
        d) Kullanıcı 10 ve -5 ve / işaretini girdiğinde kodunuz konsolda "Sonuç -2.0" yazmalıdır.
         */

        double a=10.2;
        double b=5;
        String operator="*";
        if(operator.equals("+")){
            System.out.println(a+b);
        }else if(operator.equals("-")){
            System.out.println(a-b);
        }else if(operator.equals("*")){
            System.out.println(a*b);
        }else if(operator.equals("/")){
            System.out.println(a/b);
        }

        /*SORU10:Verilen BMI değerleri için Vücut Kitle İndeksi (BMI) ile ilgili mesajları yazdırmak için kod
        yazınız.
        Geçersiz BMI değeri < 0
        Zayıf = <18.5
        Normal ağırlık = 18.5–24.9
        Fazla kilolu = 25–29.9
        Obezite = 30 veya daha büyük BMI

         */

        double bmi = 12;
        if(bmi<0){
            System.out.println("Gecersiz BMI degeri");
        }else if(bmi<18.5){
            System.out.println("Zayif ");
        }else if(bmi<24.9 && bmi>=18.5){
            System.out.println("Normal agirlik ");
        }else if(bmi<29.9 && bmi>=25){
            System.out.println("Fazla kilolu");
        }else if(bmi>=30){
            System.out.println("Obezite");
        }











    }
}



















