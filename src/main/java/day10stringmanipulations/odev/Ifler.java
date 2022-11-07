package day10stringmanipulations.odev;

import java.util.Arrays;
import java.util.Scanner;

public class Ifler {
    public static void main(String[] args) {
        //  Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak
//  verilen formata ceviren java kodunu yaziniz.
//Input :
//John White
//1234234534561478
//Output : Name : J*** W****
//CCN  : **** **** **** 1478
//* Ilk Harfler Buyuk harf ile baslamalidir.
        Scanner input = new Scanner(System.in);
        System.out.print("Isim ve soyisim: ");
        String nameSurname = input.nextLine().trim();
        System.out.print("Card no: ");
        String cardNo = input.next();
        String[] nameSurnameSplit = nameSurname.split(" ");
        System.out.print("Name : ");
        for (String w : nameSurnameSplit) {
            if (w.charAt(0) >= 'A' && w.charAt(0) <= 'Z') {
                w = w.replaceAll("[a-z0-9]", "*");
                System.out.print(w + " ");
            } else
                System.out.println("Hata...");
        }
        System.out.println();
        System.out.print("CCN  : ");
        String[] cardNoSplit = cardNo.split("(?<=\\G....)");    // 4'erli bolmek icin Array
        System.out.println(Arrays.toString(cardNoSplit));
        int count = 0;
        for (String w : cardNoSplit) {
            if (count < w.length() - 1) {
                w = w.substring(0).replaceAll("[0-9]", "*");
            }
            System.out.print(w + " ");
            count++;
        }
        System.out.println();
    }
}
