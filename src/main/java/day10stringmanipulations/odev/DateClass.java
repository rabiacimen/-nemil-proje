package day10stringmanipulations.odev;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateClass {
    public static void main(String[] args) {


        /* SORU 1: Ali'nin kaç gün yaşadığını bulan kodu yazınız.
        Ali'nin doğum tarihi 12 Mayıs 2002'dir.
        */
        LocalDate doğumTarihi = LocalDate.of(2002, 5, 12);
        LocalDate bugününTarihi = LocalDate.now();
        long yaşadığıGünSayısı = ChronoUnit.DAYS.between(doğumTarihi, bugününTarihi);
        System.out.println("yaşadığı gün  sayısı " + yaşadığıGünSayısı);

        /*
        2) Ali'nin kaç ay yaşadığını bulan kodu yazınız.
        Ali'nin doğum tarihi 4 Haziran 1997'dir.
         */
        LocalDate dgmTarihi = LocalDate.of(1997, 6, 14);
        LocalDate bugününT = LocalDate.now();
        long kaçAy = ChronoUnit.MONTHS.between(dgmTarihi, bugününT);
        System.out.println("Alinin yaşadığı ay ayısı: " + kaçAy);

        /*
        3) Ali'nin doğum tarihi 4 Haziran 1997'dir. Ali'nin doğum tarihinden 2 yıl, 3 ay ve 12 gün
        sonraki tam tarihi bulmak için kodu yazınız.
         */
        LocalDate dgmTarihi2 = LocalDate.of(1997, 6, 4);
        LocalDate yenitarih = dgmTarihi2.plusYears(2).plusMonths(3).plusDays(12);
        System.out.println(yenitarih);

        /*
        4) Ali, 29 Ekim 1923'ten 45 yıl 8 ay 5 gün sonra doğmuştur.
        Veli, 15 Eylül 1993'ten 24 yıl 2 ay 11 gün önce doğmuştur.
        Ali ve Veli'nin kesin doğum tarihini hesaplamak için kodu yazınız.
        Ali ve Veli'nin doğum tarihinin aynı olup olmadığını kontrol etmek için kodu yazınız.
         */
        LocalDate cumhuriyet = LocalDate.of(1923, 10, 29);
        LocalDate Ali = cumhuriyet.plusYears(45).plusMonths(8).plusDays(5);
        System.out.println(Ali);

        LocalDate hesapla = LocalDate.of(1993, 9, 15);
        LocalDate Veli = hesapla.minusYears(24).minusMonths(2).plusDays(11);
        System.out.println(Veli);

        boolean aynıMı = Ali.equals(Veli);
        System.out.println(aynıMı);

        /*
        5) Veli, Ali'den 3 yıl 11 gün sonra doğmuştur.
        Ali size doğum tarihi bilgisini 24 Kasım 2012 olarak vermiştir.
        Veli'nin doğum tarihini hesaplamak için gerekli kodu yazınız.
         */
        LocalDate Velinindgmgünü = LocalDate.of(2012, 11, 24).plusYears(3).plusDays(11);
        System.out.println(Velinindgmgünü);

        /*
        6) Kendinizin ve çocuğunuzun doğum tarihi için Tarih Değerleri oluşturup, ardından farkı gün
        olarak hesaplayınız.
         */
        LocalDate dgmgünüm = LocalDate.of(1988, 7, 24);
        LocalDate cocuğum = LocalDate.of(2025, 4, 20);
        long fark = ChronoUnit.DAYS.between(dgmgünüm, cocuğum);
        System.out.println(fark);

        /*
        7) Belirli bir tarihte yılın son 2 hanesini alınız.
         */
        LocalDate bugününTarihi2 = LocalDate.now();
        int sonİkirakam = bugününTarihi2.getYear() % 100;
        System.out.println(sonİkirakam);

        /*
        8) Belirli bir yılın "Artık yıl" olup olmadığını kontrol etmek için kodu yazınız.
            Artık Yıl:
            i) Bir yıl 100'e ve 400'e tam bölünüyorsa buna artık yıl denir. Örneğin; 2000 artık yıl, 1900
            değildir.
            ii) Bir yıl 100'e ve 4'e tam bölünemiyorsa artık yıl olarak adlandırılır. Örneğin; 2004 artık yıl, 2007
            değildir.
         */

        LocalDate Yıl = LocalDate.of(2004, 1, 1);
        boolean artıkYılMı = Yıl.isLeapYear();
        System.out.println(artıkYılMı);

        /*
        9) İki farklı tarihin ay numaralarının toplamını bulunuz.
         */
        LocalDate tarih1 = LocalDate.of(1996, 8, 21);
        LocalDate tarih2 = LocalDate.of(2015, 3, 12);
        System.out.println("Toplam ay degerleri : " + (tarih1.getMonthValue() + tarih2.getMonthValue()));



         /*
         10) İki farklı tarih için saat farkını bulunuz.
*/
        LocalDateTime tarih = LocalDate.of(1996, 3, 21).atStartOfDay();
        LocalDateTime tarih5 = LocalDate.of(1996, 3, 23).atStartOfDay();
        long saatFarki = ChronoUnit.HOURS.between(tarih, tarih5);
        System.out.println("Saatler arasindaki fark : " + saatFarki);



    }
}