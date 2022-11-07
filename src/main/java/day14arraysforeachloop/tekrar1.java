package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class tekrar1 {

    public static void main(String[] args) {

        //Example 1: String bir Array olusturunuz ve "Tom" ve "Tom" dan onceki tum elemanlari ekrana yazdiriniz
       /* String arr[] = {"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};

        for (String w : arr) {
            System.out.print(w + " ");

            if (w.equals("Tom")) {
                break;
            }
        }
        */

        //Example 2: String bir Array olusturunuz "Tom" ve "Jane" haric tum elemanlari ekrana yazdiriniz

        /*String brr[] = {"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};
        for(String w: brr){
            if(w.equals("Tom") || w.equals ("Jane")){
                continue;
            }else
                System.out.print(w +" ");
        }
            */

        //Bir ogretmenin sinfindaki ogrencilerin isimlerini application'a yuklemesini saglayan kodu yaziniz.
        //           ( Kullanici ile beraber bir Array olusturunuz ve icine data ekleyiniz )

       /* Scanner input = new Scanner(System.in);
        System.out.println("lütfen isim sayısını giriniz");
        int sayi = input.nextInt();

        String names[] = new String[sayi];

        System.out.println("lütfen işlemi sonlandırmak istediğinzde 'Q' tuşuna basınız");

        for (int i = 1; i < sayi; i++) {
            System.out.println("Lütfen " + i + ". öğrencinin ilk ismini giriniz");
            String stdname = input.next();

            if (stdname.equalsIgnoreCase("q")) {
                break;
            }
            names[i - 1] = stdname;

            }

            System.out.println(Arrays.toString(names));
*/
        // Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz
        //            [2, 3, 12, 0,  0,  0]
       /* int original[]= {0,2,3,0,12,0};
        int yeni[]= new int[original.length];

        int idx=0;

        for(int i=0 ; i< original.length; i++){

            if(original[i] !=0){
                yeni[idx]=original[i];

                idx++;

            }

        }
        System.out.println(Arrays.toString(yeni));

        }
        */

        //Example 2: Bir Array'in icinde herhangi bir elemanin olup olmadigini kontrol eden ve kac kere tekrarlandigini gosteren kodu yaziniz
        //           [ 2, 1, 2, -3, 2] ==> Kullanici 2'yi sordu ==> 2 elemani var ve 3 kere tekrarlandi
        //                             ==> Kullanici 6'yi sordu ==> 6 array'de yok
/*
        int brr[] = {2, 1, 2, -3, 2};

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen kontrol etmek istediğiniz rakamı giriniz");

        int aranan = input.nextInt();
        int counter = 0;

        for (int w : brr) {
            if (w == aranan) {
                counter++;

            }


        }
        if(counter>0){
            System.out.println(aranan + " array'de " + counter + " defa var");
        }else{
            System.out.println(aranan + " array'de yok");
        }

*/
        //Example3: Size verilen bir cümledeki en uzun kelimeyi bulan kodu yazınız.
        // "Java kolaydır çalışana, ne kolay ki çalışmayana" ==>calismayana


        String sentence= "Java kolaydır çalışana, ne kolay ki çalışmayana";
        System.out.println(sentence);

        sentence= sentence.replaceAll("\\p{Punct}","");
        System.out.println(sentence);

        String words[] =sentence.split(" ");
        Arrays.sort(words);//alfabetik sıraya göre dizdi
        System.out.println(Arrays.toString(words));

        Arrays.sort(words, Comparator.comparingInt(String::length));

        System.out.println(Arrays.toString(words));// uzunluklarına göre dizer ==> ne ,ki,java,....

        System.out.println(words[words.length-1]);




    }
}


