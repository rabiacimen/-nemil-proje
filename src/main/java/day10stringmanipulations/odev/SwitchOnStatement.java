package day10stringmanipulations.odev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SwitchOnStatement {
    public static void main(String[] args) {

        /*
        SORU1:Yazdırmak için switch ifadesini kullanınız.
        a) Aralık, Ocak, Şubat için "Kış"
        b) Mart, Nisan, Mayıs için "Bahar"
        c) Haziran, Temmuz, Ağustos için "Yaz"
        d) Eylül, Ekim, Kasım için "Güz"
        e) Diğerleri için "Geçersiz ay adı
         */

      /*  String ayİsmi = "mart";
        ayİsmi = ayİsmi.toLowerCase();
        switch (ayİsmi) {
            case "aralık":
            case "ocak":
            case "şubat":
                System.out.println("kış");
                break;
            case "mart":
            case "nisan":
            case "mayıs":
                System.out.println("ilkbahar");
                break;
            case "haziran":
            case "temmuz":
            case "ağustos":
                System.out.println("yaz");
                break;
            case "eylül":
            case "ekim":
            case "kasım":
                System.out.println("sonbahar");
                break;
            default:
                System.out.println("geçerli bir ay ismi giriniz");
                break;

        }

       /* 2) Ayın numarasını girdiğinizde ayın adını yazdırmak için bir switch ifadesi kullanınız.
        Örneğin;
        kullanıcı 1 girerse kodunuz "Ocak" yazmalıdır,
                kullanıcı 2 girerse kodunuz "Şubat" yazmalıdır vb.
        Kullanıcı geçersiz ay numarası girerse kodunuz "Geçersiz numara" yazmalıdır.
        */


       /* Scanner input = new Scanner(System.in);
        System.out.println("lütfen ayın numraasını giriniz.");
        int num = input.nextInt();

        switch (num) {
            case 1:
                System.out.println("ocak");
                break;
            case 2:
                System.out.println("şubat");
                break;
            case 3:
                System.out.println("mart");
                break;
            case 4:
                System.out.println("nisan");
                break;
            case 5:
                System.out.println("mayıs");
                break;
            case 6:
                System.out.println("haziran");
                break;
            case 7:
                System.out.println("temmuz");
                break;
            case 8:
                System.out.println("ağustos");
                break;
            case 9:
                System.out.println("eylül");
                break;
            case 10:
                System.out.println("ekim");
                break;
            case 11:
                System.out.println("kasım");
                break;
            case 12:
                System.out.println("aralık");
                break;

            default:
                System.out.println("lütfen geçerli bir ay numarası giriniz");
                break;
        }
            /*
            3) Verilen ay numaralarından başlayarak tüm ay adlarını yazdıran bir kod yazınız.
            Örnek: Ay numarası 9 ise konsolda kodunuz Eylül Ekim Kasım Aralık olacaktır.
             */


      /*  System.out.println("lütfen ayın numraasını giriniz.");
        int numara = input.nextInt();

        switch (numara) {
            case 1:
                System.out.println("ocak");

            case 2:
                System.out.println("şubat");

            case 3:
                System.out.println("mart");

            case 4:
                System.out.println("nisan");

            case 5:
                System.out.println("mayıs");

            case 6:
                System.out.println("haziran");

            case 7:
                System.out.println("temmuz");

            case 8:
                System.out.println("ağustos");

            case 9:
                System.out.println("eylül");

            case 10:
                System.out.println("ekim");

            case 11:
                System.out.println("kasım");

            case 12:
                System.out.println("aralık");
                break;

            default:
                System.out.println("lütfen geçerli bir ay numarası giriniz");
                break;
        }

            /*
            4) Cinsiyet "Erkek" ise "Erkek" yazdırınız.
    Cinsiyet "Kadın" ise "Kız" yazdırınız.
    Cinsiyet "Erkek" ve "Kadın"dan farklıysa "Diğerleri" yazdırınız.
    Not : Bu seçenekler dışındakilerini yoksayınız.
             */

      /*  System.out.println("lütfen cinsiyetinizi giriniz.");
        String cinsiyet = input.next();


        switch (cinsiyet.toLowerCase()) {
            case "kadın":
                System.out.println("kadın");
                break;
            case "kız":
                System.out.println("kadın");
                break;
            case "erkek":
                System.out.println("erkek");
                break;
            default:
                System.out.println("diğerleri");
                break;
        }

        /*
        5) Belirli bir yılın belirli bir ayındaki gün sayısını görüntülemek için bir kod yazınız.
        Örnek: 2000 yılının Şubat ayında gün sayısı 29.
         */

       /* int ay = 2;
        int yil = 2000;
        int gunSayisi = 0;

        switch (ay) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                gunSayisi = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                gunSayisi = 30;
                break;
            case 2:
                if (((yil % 4 == 0) && !(yil % 100 == 0)) || (yil % 400 == 0)) {
                    gunSayisi = 29;
                } else {
                    gunSayisi = 28;
                }
                break;
            default:
                System.out.println("Gecersiz Ay");
                break;
        }
        System.out.println("Gun Sayisi = " + gunSayisi);

        /*
        6) Switch ifadesini kullanarak, herhangi bir 2 sayıyla toplama, çıkarma, çarpma ve bölme
                yapan basit bir hesap makinesi oluşturmak için kod yazınız.
                a) Kullanıcı 10.2 ve 5 ve + işaretini girdiğinde kodunuz konsolda "Sonuç 15.2" yazmalıdır.
                b) Kullanıcı 10 ve 5 ve - işaretini girdiğinde kodunuz konsolda "Sonuç 5.0" yazmalıdır.
                c) Kullanıcı 10 ve 5.3 ve * işaretini girdiğinde kodunuz konsolda "Sonuç 53.0" yazmalıdır.
                d) Kullanıcı 10 ve -5 ve / işaretini girdiğinde kodunuz konsolda "Sonuç -2.0" yazmalıdır.
                e) Kullanıcı 10 ve -5 girdiğinde +, -, *, / 'den farklı bir işlem yaptığında kodunuz "Geçersiz İşlem" yazmalıdır.
*/

       /* double a = 10.2;
        double b = 5;
        String operator = "+";
        switch (operator) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            default:
                System.out.println("Gecersiz islem");
        }


        /*
        7) Switch ifadesini kullanarak, mili km'ye, saniyeyi saate, fahrenhaytı santigrata çeviren bir
dönüştürücü oluşturmak için kod yazınız. Google'dan dönüşümler için formülleri bulunuz.
a) Kullanıcı mile değerini 10 ve operatorü mildenKmye olarak girdiğinde, konsolda kodunuz "16 km" yazmalıdır (sayı dinamik olacak)
b) Kullanıcı saniye değerini 7200 ve operatorü saniyedenSaate olarak girdiğinde, konsolda
kodunuz "2" yazmalıdır (sayı dinamik olacak)
c) Kullanıcı fahrenheit değerini 83 ve operatorü fahrenaytdanSantigarata olarak girdiğinde, konsolda kodunuz "28.3333 santigrat" yazmalıdır (sayı dinamik olacak)
d) Kullanıcı mildenKmye, saniyedenSaate, fahrenaytdanSantigarata ‘dan farklı bir işlem girdiğinde, kodunuz "Bu operatör, o dönüştürücü için tanımlanmadı"
         */

       /* double mil = 10;
        double saniye = 7200;
        double fahrenayt = 83;

        Scanner input=new Scanner(System.in);
        System.out.println("lğtfen operatörü giriniz");
        String operator= input.next();

        switch (operator) {
            case "mildenKmye":
                System.out.println(mil * 1.60934);
                break;
            case "saniyedenSaate":
                System.out.println((saniye / 60) / 60);
                break;
            case "fahrenaytdanSantigarata":
                System.out.println((fahrenayt - 32) * 5 / 9);
                break;
            default:
                System.out.println("Bu operator, o donusturucu icin tanimlanmadi");
        }
      /*  8) Bir Enum oluşturun ve içine CHROME, SAFARI, IE, FIREFOX, YANDEX gibi tarayıcı adlarını
        koyunuz. Switch ifadesini kullanın ve CHROME için 'CHROME kullanıyorum', SAFARI için
        'SAFARI kullanıyorum', 'IE için IE kullanıyorum', 'FIREFOX için FIREFOX kullanıyorum' ve
        YANDEX için 'YANDEX kullanıyorum', CHROME, SAFARI, IE, FIREFOX, YANDEX'ten farklı
        tarayıcılar için 'Geçersiz tarayıcı' yazınız.
                Not: Geliştirici konsolunda enum oluşturmalısınız.
                */

        /*
        9) Adı 'Seasons' olan bir Enum oluşturun ve Enum da switch-on deyimini kullanarak
aşağıdakileri yazdırınız.
Kış için 'Snowboard yapmak'
Yaz ve bahar için 'Balık tutmak'
Sonbahar için 'Doğa yürüyüşü yapmak'
         */

        /*
        10) myClass isminde bir class oluşturunuz, class'ta size rastgele bir alfabetik karakter veren bir
yöntem oluşturun ve ardından yöntemi kullanarak aşağıdakileri yazdırınız.
'A' ve 'a' için "İlk Karakter" yazdırınız.
'B' ve 'b' için "İkinci Karakter" yazdırınız.
'C' ve 'c' için "Üçüncü Karakter" yazdırınız.
'D' ve 'd' için "Dördüncü Karakter" yazdırınız.
Diğerleri için "Diğer Karakterleri" yazdırınız.
         */





    }
}