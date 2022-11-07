package studentsPractice;

import java.util.Scanner;

public class Tuba1 {
    public static void main(String[] args) {


/*
     2) Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız.
Örneğin; accessories ´ ces
      */
        String f = "accessories";             // "" = "" + c    ==> "c"   ==> "c" + "e" =  "ce"
        String resultt = "";
        for (int i = 0; i<f.length(); i++){
            String ch = f.substring(i,i+1);
            if (f.indexOf(ch)!=f.lastIndexOf(ch)){
                if (!resultt.contains(ch)){
                    resultt = resultt + ch;
                }
            }
        }
        System.out.println(resultt);


        // Kullanicidan toplamak uzere pozitif sayilar isteyin islemi bitirmek icin 0 a basmasini soyleyin.
        // Sayilarin toplamini ve kac sayi girdigini yazdiriniz.

        Scanner scan = new Scanner(System.in);
        int s = 0;
        int toplam = 0;
        int count = 0; //flag

        do {
            System.out.println("Bir sayi giriniz eger islemi durdurmak istiyorsaniz 0 a basiniz");
            s = scan.nextInt();
            if (s>0){
                count++;
                toplam = toplam + s;
            }
            if (s<0){
                System.out.println("Pozitif sayi giriniz.");
                break;
            }
        }while(s!=0);
        System.out.println("sum is: " + toplam);
        System.out.println("count is: " + count);


        /*
        3) Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız. Bir String, tersi ile
        aynıysa, buna palindrom denir. Örneğin; “anna”, “123321” palindromlardır.
        */
        String a = "hello";           //
        String result = "";
        for (int i = a.length()-1; i>=0; i--){
            char ch = a.charAt(i);
            result = result + ch;
        }
        System.out.println(result);
        if (a.equalsIgnoreCase(result)){
            System.out.println(a + " bir palindrome");
        } else {
            System.out.println(a + " bir palindrome degil");
        }

        /*
        20) Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        * * * * * *
        * * * * *
        * * * *
        * * *
        * *
        *
8


     */
        int row = 6;
        for (int i = 1; i<=row; i++){
            for (int k = row; k>=i; k--){
                System.out.print("* ");
            }
            System.out.println();
        }

            /*
            23) Asal sayı olup olmadığını kontrol etmek için kullanıcıdan bir tam sayı girmesini isteyiniz.
            Örnek: kullanıcı 43 girerse çıktı “43 bir asal sayıdır”, kullanıcı 120 girerse “120 asal değildir”
            olur, kullanıcı negatif tam sayılar girerse çıktı “Pozitif bir tam sayı giriniz” şeklinde kullanıcıyı
            yönlendiriniz.
            */
        int b = 7;
        int countt = 0;
        if (b>0){
            if (s==1){
                System.out.println("Asal sayi degildir");
            } else {
                for (int i = 2; i<b; i++){

                    if (b%i==0){
                        countt++;
                    }
                }
                if (countt==0){
                    System.out.println("Asal sayidir");
                } else {
                    System.out.println("Asal sayi degildir");
                }
            }
        } else {
            System.out.println("Pozitif bir sayi giriniz");
        }
        System.out.println(countt);





    }

}
