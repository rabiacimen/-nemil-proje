package day07ternarystringmanipulation;

public class NestedTernary01 {

    public static void main(String[] args) {

         /*
            Verilen yilin "Leap Year"(Artik Yil) olup olmadigini kontrol eden kodu yaziniz.
                i)Yil 100 e bolunurse 400 e de bolunmelidir ==> 1600+    1800-
                ii)Yil 100'e bolunmezse 4 e bolunmelidir ==> 1996+    2001-
         */
        int year = 2022;

        String leap = year%100==0 ? (year%400==0 ? "Leap year" : "Leap year degil") : (year%4==0 ? "Leap year" : "Leap year degil");


        System.out.println(leap);


        /* aşağıdaki kurallara göre password'un geçerli olup olmadığını kontrol eden kodu yaıznız.
        i) sekiz karaketerden fazla evya sekiz karaketer varsa ilk harfi "i" olmaldıır
        ii)sekiz karakterden az karakter varsa ilk harfi "K" olmaldıır.

         */
        String pwd = "i2a3ed54";
        char ilkHarf = pwd.charAt(0);
        String gecerli = pwd.length()<8 ? (ilkHarf=='K' ? "Geçerli" : "Geçersiz"): (ilkHarf=='i' ? "Geçerli" : "Geçersiz");
        System.out.println(gecerli);





    }

}











