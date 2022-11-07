package day10stringmanipulations.odev;

import java.util.Locale;

public class StringManipulations {

    public static void main(String[] args) {


        //soru1:Sadece tek bir kelimeden oluşan şehir isimleri için bir String değişkeni oluşturun. Şehir
        //ismini, baş harfi büyük ve diğer tüm karakterleri küçük harfler olacak şekilde konsolda
        //yazdırınız.
        String sehirIsim = "mANisA";
        String yeniSehir = sehirIsim.trim().toLowerCase();
        yeniSehir = yeniSehir.substring(0,1).toUpperCase() + yeniSehir.substring(1);
        System.out.println(yeniSehir);

        //SORU2:Kişi isimleri için 3 String değişken oluşturunuz. Boşluk karakterleri hariç 3 isimdeki
        //karakter sayısının toplamını yazdırınız.
        String isim1 = "Rabia Çimen";
        String isim2 = "Said Tasdemir";
        String isim3 = "Feyyaz Cheman";
        Integer c1 = isim1.replace(" ","").length();
        Integer c2 = isim2.replace(" ","").length();
        Integer c3 = isim3.replaceAll("\\s","").length(); //c1 ve c2 deki ile aynı işlevi görür.
        System.out.println("bosluk karakterleri olmadan 3 ismin toplam karakter sayısı:" + (c1+c2+c3));


        //SORU3:Bir String değişkeni oluşturunuz, String'deki toplam alfabetik ve sayısal karakter sayısını
        //konsolda yazdırınız.
        String a = "Miami33018!!!";
        Integer karaktersayisi = a.replaceAll("\\s","").replaceAll("\\p{Punct}","").length();
        // "punct" kısmı yerine "harfler ve rakamların dışındakileri sil" işlemi de koyabilirdik. .replaceAll("[^A-Za-z0-9]","")
        System.out.println(karaktersayisi);


        //SORU4:Bir String değişkeni oluşturunuz, String'deki rakam olmayan karakterlerin sayısını
        //konsolda yazdırınız
         String s = "Rabia3545.!";
         Integer rakamsızkaraktersayisi = s.replaceAll("[0-9]","").length();
         System.out.println(rakamsızkaraktersayisi);

         //SORU5:Bir String değişkeni oluşturunuz ve String değişkenin konsolda boşluk olmayan son
        //karakteri yazdırınız.
        String m= "Rabia Çimen";
        int boslukOlmayanSonKrktrIndx = m.trim().length()-1;
        String boslukOlmayanSonKrktr =m.substring(boslukOlmayanSonKrktrIndx,
                boslukOlmayanSonKrktrIndx+1); // neden +1 olduğunu anlıyamadım.
        System.out.println("bosluk olmayan son karakter:"+ boslukOlmayanSonKrktr);

        //SORU6:Bir String değişkeni oluşturunuz ve String'in ilk ve son karakterlerinin ASCII değerlerinin
        //toplamını bulunuz.
        String h= "Miami";
        int sonKrktrIdx = h.length()-1;
        int ilkKrktrAscii = h.charAt(0);
        int sonKrktrAscii = h.charAt(sonKrktrIdx);
        System.out.println("İlk ve son karakterlerin Ascii değerlerinin toplamı ="+ (ilkKrktrAscii+sonKrktrAscii));

        //SORU7:Bir String değişkeni oluşturunuz ve ilk karakteri dışındaki tüm karakterleri konsolda
        //yazdırınız.
         String g = "Java";
         String ilkKrktrDısındakiler = g.substring(1);
        System.out.println("ilk karakter dışındakiler=" + " " +ilkKrktrDısındakiler);

        //SORU8:Bir String değişkeni oluşturunuz ve son karakteri dışındaki tüm karakterlerini konsolda
        //büyük harfle yazdırınız.
        String f= "rabia";
        Integer sonKrktrIndex= f.length()-1;
        String snKrktrDıs = f.substring(0,sonKrktrIndex).toUpperCase();
        System.out.println("son karakter dışındıdaki tüm harfler büyük garf il = "+ " "+ snKrktrDıs);

        //SORU9:Bir String değişkeni oluşturunuz ve konsolda ilk karakter ve son karakter dışındaki tüm
        //karakterleri büyük harflerle yazdırınız
        String e = "ankara";
        Integer snkıdx =e.length()-1;
        String istediğim = e.substring(1,snkıdx).toUpperCase();
        System.out.println("istediğim yazı =" + " "+ istediğim );

        //SORU10:Bir String in ortadaki herhangi bir konumda yalnızca tek bir boşluk karakteri olup
        //olmadığını kontrol etmek için kod yazınız.
        String w= "Ali Can";
        String trimlenmiş = w.trim();
        String hicBoslukYok = trimlenmiş.replaceAll("\\s","");
        Boolean istediğimGibiMi = trimlenmiş.length()-hicBoslukYok.length()==1;
        System.out.println("istediğimGibi" + " " + istediğimGibiMi);

        //SORU11:Bir String’ in başında ve sonunda boşluk karakteri olup olmadığını kontrol etmek için kod
        //yazınız
        String r = "Hayri ";
        String trimle = r.trim();
        Boolean sonucc = r.equals(trimle);
        System.out.println("basında ve sonunda bosluk var mı? =" + " " + sonucc); //kitaptaki cevap anahtarında somuc'un önünde ! işareti var. o şekilde yanlış sonuç veriyor.

        //SORU 12:Bir String’ in başında büyük harf ve sonunda nokta olup olmadığını kontrol etmek için kod
        //yazınız.

        String str = "Tom Hanks";
       char ilkKrktr=str.charAt(0);
       char sonKrktr=str.charAt(str.length()-1);
       boolean ilkKarakterBüyükMü= ilkKrktr>='A' && ilkKrktr<='Z'; //cevp anahtarında 'Z' nin olduğu yerde sonKrktr almış. sonuç herikisinde de doğru. ama mantık hatası var cevap anahtarında.sorr?
       boolean sonKrktrKontrol=sonKrktr=='.';
       boolean kontrol=ilkKarakterBüyükMü && sonKrktrKontrol;
        System.out.println(kontrol);

        //SORU 13:Aşağıdaki koşullar için bir parolanın geçerli olup olmadığını kontrol etmek için kod yazınız;
        //Şifre boşluk karakterinden farklı olacak şekilde en az 8 karakter içermelidir. Şifrede en az 1
        //sembol olmalıdır.

        /*
        Örnek:'A2b!' için kodunuz konsolda false yazdırmalıdır.
        'A2b3cdef' için kodunuz konsolda false yazdırmalıdır
        '!1a23b4' için kodunuz konsolda false yazdırmalıdır.
        '!1a23b4?es' için kodunuz konsolda true yazdırılmalıdır.
        '! a b 3 k' kodunuz konsolda false yazdırmalıdır
       */

        String sifre="ajdlfjnjl";

        boolean krktrSayıKntrl= sifre.replaceAll("\\s","").length()>=8;
        boolean birSembol=sifre.replaceAll("\\s","").replaceAll("[A-Za-z0-9]","").length()>0;
        System.out.println(krktrSayıKntrl&&birSembol);

    //SORU 14) Bir String’ in belirli bir tek karaktere sahip olup olmadığını üç farklı şekilde kontrol etmek
        //için kod yazınız
        String kelime="güzel";
        //1.yol:
        boolean sonuc=kelime.contains("g");
        System.out.println("istenilen harfi içeriyor mu? "+sonuc);

        // 15)
        //Gömlek ve kitap fiyatlarının toplamını bulmak için gereken kodu yazınız.
        String gomlekFiyat = "$12.99";
        String kitapFiyat = "$35.99";
        String x=gomlekFiyat.replaceAll("[$.]","");
        String y=kitapFiyat.replaceAll("[$.]","");
        double t=Double.valueOf(x);
        double b=Double.valueOf(y);

        System.out.println((t+b)/100);

        // 16) Verilen bir ismin adının ve soyadının baş harflerini almak için kodu yazınız.
        //Not: İkinci isim kapsam dışındadır.
        //Örnek: Tom Hanks ==> TH, Mary Star ==> MS
       /* String isim="rabia çimen";
        String ilkHarf= isim.substring(0,1);
        String ikinciHarf=isim.split(" ")[1].substring(0,1);
        System.out.println(ilkHarf+ikinciHarf);
*/

        String örnek="hayri çimen";
        String ilkHarf=örnek.substring(0,1);
        int sonHarfinIndexi=örnek.indexOf(" ")+1;
        String sonHarf=örnek.substring(sonHarfinIndexi,sonHarfinIndexi+1);
        System.out.println(ilkHarf+sonHarf);

// 17) Bir String’ de kullanılan noktalama işaretlerinin sayısını bulmak için bir kod yazınız.


        String str8 = "Vay be!!!!!! Ali 13 yaşında ama üniversite öğrencisi.";
        int toplamkrkter=str8.length();
        int noktalamahariç=str8.replaceAll("\\p{Punct}","").length();
        System.out.println(toplamkrkter-noktalamahariç);




// finihed




    }
}
