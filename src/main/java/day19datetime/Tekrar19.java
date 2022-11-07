package day19datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Tekrar19 {
    public static void main(String[] args) {

       /* //Example 1: "Anlik tarihi"(Current Date) ekrana yazdiran kodu yaziniz
        LocalDate anlıkTarih = LocalDate.now();
        System.out.println(anlıkTarih);

        //Example 2: "Anlik zamani"(Current Time) ekrana yazdiran kodu yaziniz
        LocalTime anlıkZaman= LocalTime.now();
        System.out.println(anlıkZaman);

        //Example 3: "Anlik tarihi"(Current Date) ve "Anlik zamani"(Current Time) ekrana yazdiran kodu yaziniz
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);

        //Example 4: Japonya'daki "Anlik tarihi"(Current Date) ve "Anlik zamani"(Current Time) ekrana yazdiran kodu yaziniz
        LocalDateTime japonya= LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(japonya);

        //Example 5: Istanbul'daki "Anlik tarihi"(Current Date) ve "Anlik zamani"(Current Time) ekrana yazdiran kodu yaziniz
        LocalDateTime istanbul=LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(istanbul);

        //Example 6: Bugunden 789 gun sonra emekli olacaginiza gore, emeklilik tarihini hesaplayan kodu yaziniz.
    LocalDate countDate=LocalDate.of(2022,10,22);
    LocalDate retireDate=countDate.plusDays(3);
        System.out.println(retireDate);


        //Example 7: Iki cocugunuzun dogum tarihleri arasindaki farki gun olarak hesaplayan kodu yaziniz
        LocalDate dob1=LocalDate.of(2005,10,23);
        LocalDate dob2=LocalDate.of(2010,10,20);
        Long diff=ChronoUnit.DAYS.between(dob1,dob2);
        System.out.println(diff);

        //between(dobAli, dobVeli) method'u kullanildiginda daha eski olan tarih once yazilmalidir


        //Example 8: Istanbul'un Fethi ile, Cumhuriyet'in kurulmasi arasinda kac ay oldugunu gosteren kodu yaziniz.
        //           29 Mayis 1453 ==> Istanbul'un Fethi              29 Ekim 1923 ==> Cumhuriyet'in kurulusu

        LocalDate istanbulFethi=LocalDate.of(1453,5,5);
        LocalDate cumh=LocalDate.of(1923,10,10);
        Long diff2=ChronoUnit.YEARS.between(istanbulFethi,cumh);
        System.out.println(diff2);



        //Example 9: Verilen tarih'in hangi burcta oldugunu gosteren kodu yaziniz

        LocalDate burcum=LocalDate.of(2022,7,22);

        int day1= burcum.getDayOfYear();
        int month1= burcum.getMonthValue();

        if((day1>=21 && month1==7) || (day1<=20 && month1==8)){
            System.out.println("aslan");

        }else if((day1>=21 && month1==8) || (day1<=20 && month1==9)){
            System.out.println("yengeç");


    }else{
            System.out.println("hiçbiri");
        }


*/


        //Example 1: Java'dan aldiginiz Date'i "ay/gun/yil" olarak yaziniz
/*
       LocalDate şuanki=LocalDate.now();
        System.out.println(şuanki);

        LocalDate şuanki2 = LocalDate.of(2022,5,21);
        System.out.println(şuanki2);

        DateTimeFormatter dtf1= DateTimeFormatter.ofPattern("MMMM,dd,yy");
        String yeni=dtf1.format(şuanki2);
        System.out.println(yeni);

        //Example 2: Java dan aldiginiz time'in formatini degistiriniz
        LocalTime şimdikiZaman= LocalTime.now();

        DateTimeFormatter dtf2= DateTimeFormatter.ofPattern("HH:mm a");
        String son=dtf2.format(şimdikiZaman);
        System.out.println(son);

*/

        //Example 1: Japonya ile Almanya arasindaki zaman farkini saat olarak hesaplayan kodu yaziniz
        LocalDateTime japonya = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime germany = LocalDateTime.now(ZoneId.of("Europe/Berlin"));

        Long zamanFarkı = ChronoUnit.HOURS.between(germany, japonya);
        System.out.println(zamanFarkı);

        // **************************************************************************************************

        //Example 2: Sabit bir tarih olusturunuz


        //Example 3:
        // USA icin "Woow!", UK icin "Big", "CANADA" icin "Cold",
        // "TURKEY" icin "Vatan", "GERMANY" icin "Araba", "RWANDA" icin "Cay"

        Countries ülkeler = Countries.USA;


        switch (ülkeler) {
            case USA:
                System.out.println("Woow!");
                break;
            case TURKEY:
                System.out.println("vatan");
                break;
            case GERMANY:
                System.out.println("araba");
                break;
            default:
                System.out.println("tanımlanmamış ülke");


        }
    }
}