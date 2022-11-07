package day10stringmanipulations.odev;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeClass {
    public static void main(String[] args) {

            /*
            1) Eğer saat
    i) 24:00 ile 05:00 arasında ise konsola 'Uyku zamanı' yazdırınız.
    ii) 08:00 ile 16:00 arasında ise konsola 'Çalışma zamanı' yazdırınız.
    iii) 19:00 ile 22:00 arasında ise konsola 'Aile zamanı' yazdırınız.
    iv) Diğerleri için konsolda 'Kişisel zaman' yazdırınız.
             */
        LocalTime şuanım=LocalTime.now();
        int saat=şuanım.getHour();
        if(saat>0 && saat<5){
            System.out.println("Uyku zamanı");
        }else if(saat >8 && saat <16){
            System.out.println("Calisma Zamani");
        }else if(saat >19 && saat <22){
            System.out.println("Aile Zamani");
        }else{
            System.out.println("Kisisel Zaman");
        }

        /*
        2) Japonya saat dilimi ile Almanya saat dilimi arasındaki saat farkını bulmak için kodu yazınız.
         */
        LocalDateTime Japonya = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(Japonya);
        LocalDateTime Almanya= LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(Almanya);
        long saatFarkı= ChronoUnit.HOURS.between(Almanya,Japonya);
        System.out.println(saatFarkı);

       /* 3) Ali 5 Şubat 2015 TRT 10:00'da İstanbul' da, Mark 5 Şubat 2015 12:00 EST' de ABD' de
        doğmuştur. Ali'nin doğum saati ile Mark'ın doğum saati arasındaki saat cinsinden fark
        nedir?
        */

        LocalDateTime Alininki=LocalDateTime.of(2015,2,5,10,0,0);
        ZonedDateTime Alininyereldgmtarihi= Alininki.atZone(ZoneId.of("Europe/Istanbul"));
        LocalDateTime Markınki= LocalDateTime.of(2015,2,5,12,0,0);
        ZonedDateTime Markındgmtarihi=Markınki.atZone(ZoneId.of("America/New_York"));
        long saatFarkları=ChronoUnit.HOURS.between(Alininyereldgmtarihi,Markındgmtarihi);
        System.out.println(saatFarkları);

        /*
        4) Ayşe 5 Şubat 2015 saat 10:15 EST'de doğmuştur, Fatma 6 Mart 2015 saat 12:25 EST'de
        doğmuştur. Ayşe ve Fatma'nın doğum süreleri arasındaki fark nedir?
         */
        LocalDateTime Ayşe=LocalDateTime.of(2015,2,5,10,15,0);
       LocalDateTime Fatma=LocalDateTime.of(2015,3,6,12,25,0);
       long süreFarkı=ChronoUnit.MINUTES.between(Ayşe,Fatma);
        System.out.println(süreFarkı);

        /*
        5) Mark 23.02.2018 tarihinde saat 15:25'te GMT ' de doğmuştur, Mark'ın Japonya'daki tam
        doğum tarihi ve saati nedir?
         */

        LocalDateTime Gmt=LocalDateTime.now(ZoneId.of("GMT"));
        LocalDateTime Tokyo=LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        long farkabak=ChronoUnit.HOURS.between(Gmt,Tokyo);
        LocalDateTime MarkJaponya=LocalDateTime.of(2018,2,23,15,25,0).minusHours(farkabak);
        System.out.println(MarkJaponya);





    }

    }

