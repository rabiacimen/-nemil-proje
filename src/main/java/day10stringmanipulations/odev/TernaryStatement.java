package day10stringmanipulations.odev;

public class TernaryStatement {
    public static void main(String[] args) {

        /*
        SORU1:Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
        Parola boşluk karakterinden farklı olarak en az 8 karakter içeriyorsa, "Geçerli Parola",
        Parola boşluk karakterinden farklı olarak 8 karakterden daha az ise, "Geçersiz Parola"
         */
         String parola= "a1b2c3";
         String gecerliMi = parola.replaceAll("\\s","").length()>7 ? "Geçerli parola" : "Geçersiz partola";
        System.out.println(gecerliMi);


        /*
        SORU2: Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
        a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
        b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
        c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen "
         */
        int a=5;
        int b=4;
        int c=3;

        String ücgenTipi= a==b && b==c ? "Eşkenar üçgen" :
                (a==b && b!=c || a==c && b!=c || b==c && c!=a ? "ikizkenar üçgen" : "çeşitkenar üçgen");
        System.out.println(ücgenTipi);

        /*
        SORU3:Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
        a) Son basamak 5 ‘e eşit ve 5 den büyükse, yuvarlama işlemi: “Son basamağı bir üst ondalığa yuvarla”
        b) Son basamak 5 den küçükse, yuvarlama işlemi: “Son basamağı bir alt ondalığa yuvarla”
        */
        int i=125;
        String sonuc= (i%10>=5) ? ("Son basamagi bir ust ondaliga yuvarla:"+(i/10+1)*10 ):
                ("Son basamagi bir ust ondaliga yuvarla:"+(i/10*10));
        System.out.println(sonuc);

        /*SORU4:
        Nested Ternary kullanarak Apex kodunu yazınız.
        Bir yılın artık yıl olup olmadığını kontrol eden bir program yazınız.
        Yıl 100'e tam bölünüyorsa 400'e tam bölünmelidir.
        Bir yıl 100'e tam bölünemiyorsa 4'e tam bölünmelidir.
         */
        int yıl=1800;
        String artıkYıl=(yıl%100==0)? ((yıl%400==0) ? ("artık yıl") :("artıkyıl değil")) : (yıl%4==00)? ("artık yıl") :("artık yıl değil");
        System.out.println(artıkYıl);

        /*SORU 5:
        Nested Ternary kullanarak;
        Şifreyi kontrol etmek için kodu yazınız.
        8'den fazla karakter içeriyorsa, baş harfi 'i' olmalıdır.
        8 karakterden fazla içermiyorsa, baş harfi 'K' olmalıdır.
        */

        String p="ixxxxxxxxxxxxxxx";
        String sifre= (p.length()>8) ? (p.startsWith("i") ? "geçerli" :"geçersiz") : (p.startsWith("k") ? "geçerli": "geçersiz");
        System.out.println(sifre);

        /*
        6) Bir sayının mutlak değerini hesaplamak için kodu yazınız.
        Pozitif sayılar ve sıfır mutlak değer için sayı ile aynıdır.
        Negatif sayıların mutlak değerini bulmak için sayıyı -1 ile çarpınız.
         */

       int mutlakSayı= -5;
        int mutlakDeğerHesapla= mutlakSayı>=0 ?  mutlakSayı  : -1*mutlakSayı;
        System.out.println(mutlakDeğerHesapla);

        /*
        7) Ternary kullanarak; 2 tamsayıdan küçük olanı konsola yazdıran bir program yazınız.
         */
        int j = 13, k = 12;

        int yazdır= j<12 ? j : k;
        System.out.println(yazdır);

        /*
        8) Sayı 3 basamaklı ise konsolda kodunuz "Bu sayı 3 basamaklıdır" olacaktır. Aksi takdirde,
            kodunuz " Bu sayı 3 basamaklı değildir" olacaktır
         */
        int sayı=75;
       String kod= (sayı>99 && sayı<999) || (sayı<-99 && sayı>-1000) ? "bu sayı 3 basamaklıdır" :" bu sayı 3 basamaklı değildir";
        System.out.println(kod);

        /*
        9) Ternary kullanarak; konsolda tek sayılar için “Tek” , çift sayılar için “Çift” yazdırınız.
         */

        int sayılar=97;
        String ss= (sayılar%100==0) ? "bu sayı çift basamaklıdır" :" bu sayı tek basamaklıdır";
        System.out.println(ss);

        /*
        10) Ternary kullanarak; konsolda sayı pozitif ise “Pozitif” , negatif ise “Pozitif Değil” yazdırınız.
         */

        int m=-23;
        String pozneg= m>0 ? "pozitif" : "pozitif değil";
        System.out.println(pozneg);








    }



}
