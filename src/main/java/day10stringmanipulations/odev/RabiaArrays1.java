package day10stringmanipulations.odev;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
public class RabiaArrays1 {

    public static void main(String[] args) {
        /*Listede 15 veya 13 varsa, bu elemanları kaldırınız.
           Örnek: (10, 31, 15, 13, 54) ==> Çıktı (10, 31, 54)
        List<Integer> h = new ArrayList<>();
        h.add(10);
        h.add(31);
        h.add(15);
        h.add(13);
        h.add(54);
        List<Integer> yeni=new ArrayList<>();
        for(int w:h){
            if(w==15||w==13){
        continue;
    }else{
        yeni.add(w);
    }
}
        System.out.println(yeni);
 */
        //kitap1:
        // Tamsayılardan oluşan bir arrayde ortadaki elemanı bulunuz.
        //Örnek: (12, 5, 8) ==> (5, 8, 12) ==> Çıktı =8
        // (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Çıktı =(8+12)/2 = 10
/*
        int a[]=new int []{12,5,8,13};
        Arrays.sort(a); // 5,8,12,13
        System.out.println(a);
        if(a.length%2==0){
        }**************************************************************************************
*/
        // Kitap2: String’ lerden oluşan bir arrayde uzunluğu en küçük olan elemanları bulunuz.
        // Örnek: ( String’ lerden oluşan bir arrayde uzunluğu en küçük olan elemanları bulunuz.
        //Örnek: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli ) ==> Output is Mark, Veli
      /*  String[] b = new String[]{"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
        int minLength=b[0].length();
        for(String w: b){
            minLength=Math.min(minLength,w.length());
        }
        for(String w:b){
           if(minLength==w.length()){
               System.out.println(w);
           }
        }
        */
        /*kitap3=Tamsayılardan oluşan bir arrayde en küçük pozitif elemanı ve en büyük negatif elemanı
        bulunuz.
                Örnek:(-12, 18, -5, 23, -2) ==> En küçük pozitif 18, en büyük negatif -2
        int [] arr={-12, 18, -5, 23, -2};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int minpoz=arr[arr.length-1];
        int maxneg=arr[0];
        for(int w:arr){
            if(w>=0){
                minpoz=Math.min(w,minpoz);
            }
            if(w<0){
                maxneg=Math.max(w,maxneg);
            }
        }
        System.out.println(maxneg);
        System.out.println(minpoz);
*/
        //Kitap4=
        // String’ lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini alınız.
        //Örnek: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Çıktı JJM
        /*String[] arr = {"Kemal","Jonathan","Mark","Jackson","Ali"};
        String basharfler = "";
        for (String w : arr) {
            if (w.endsWith("k") || w.endsWith("n")) {
                basharfler = basharfler + w.substring(0, 1);
            }
        }
        System.out.println(basharfler);
        */

        //kitap5= String’ lerden oluşan bir arrayde kullanılan öğelerin toplam karakter sayısını bulunuz.
        //Örnek: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Çıktı 26
/*
        String[]brr={ "Kemal", "Jonathan", "Mark", "Angie", "Veli" };
        int sum=0;
        for(String w:brr){
        sum+=w.length();
}
        System.out.println(sum);
*/
        //Kitap6= Verilen bir String'de 'a' veya 'A' ile başlayan kelimeyi sayısını bulunuz.
/*
        String s = "Apex is an object oriented programming language";
        String []arr=s.split("");
        int counter=0;
        for(String w:arr){
            if(w.startsWith("a")||w.startsWith("A")){
                counter++;
            }
        }
        System.out.println(counter);
*/
        //kitap6= Verilen bir String'deki sesli harf sayısını bulunuz.
       /* String s = "Apex is an object oriented programming language";
        String[]arr=s.toLowerCase().split("");
        int counter=0;
        for(String w:arr){
            switch(w){
        case"a":
        case"e":
        case"i":
        case"o":
        case"u":
            counter++;
            }
        }
        System.out.println(counter);
      */
        //kitap8: İlk ve son karakterleri aynı olan array öğelerini bulmak için kod yazınız.
       /*1.yol:
        String[] arr = new String[]{"alabama", "pick", "sos", "sets", "pex"};
        List<String>brr=new ArrayList<>();
        for(String w:arr){
            String ilkHarf=w.substring(0,1);
            String sonHarf=w.substring(w.length()-1);
            if(ilkHarf.equals(sonHarf)){
                brr.add(w);
            }
        }
        System.out.println(brr);
*/
        //kitap9: Verilen bir String arraydeki belirli bir öğenin var olup olmadığını bulmak için kod yazınız.
       /* String[] arr = new String[]{ "is", "an", "oriented", "programming", "language"};
        String s = "object";
        1.yol
        int counter = 0;
        for (String w : arr) {
            if (w.equals(s)) {
                counter++;
            }
        }
        if (counter > 0) {
            System.out.println("aranan öğeyi içeriyor");
        }
        if (counter <= 0) {
            System.out.println("öğe bulunamadı");
        }
        */

//kitap10:Verilen bir String arraydeki öğelerin karakterlerinin toplamını bulmak için kod yazınız.

        /*String[] arr = new String[]{"alabama", "pick", "sos", "sets", "pex"};
        int sum=0;
        for(String w:arr){
            sum=sum+w.length();
        }
        System.out.println(sum);
        */
        //kitap11: Tamsayılardan oluşan arrayde bulunan sıfırları, array sonuna yerleştiren kod yazınız.
        //Örnek: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)
        /*int []arr=new int[]{5,0, 2, 0, 3};
        int[]brr=new int[arr.length];
        int ilkidx=0;
        int sonidx=arr.length-1;

        for(int w:arr){
            if(w!=0){
                brr[ilkidx]=w;
                ilkidx++;
            }else{
                brr[sonidx]=w;
                sonidx--;
            }
        }
        System.out.println(Arrays.toString(brr));
*/
        //kitap12:Kullanıcıdan aldığınız tamsayılar ile bir array oluşturunuz ve bu arraydeki en küçük ve en
        //büyük öğeler arasındaki farkı konsolda yazdırınız.
        /*
       int []arr=new int[]{1,34,65,78,110};
       int enbüyük=arr.length-1;
       int enküçük=arr[0];

       for(int w:arr){

           enbüyük=Math.max(enbüyük,w);

           enküçük=Math.min(enküçük,w);
       }

        System.out.println(enbüyük-enküçük);

*/
        //kitap13: Kullanıcıdan 2 String girmesini isteyiniz. Stringlerin karakterleri ve karakter sayıları aynıysa
        //konsola "Anagramdır" yazdırın. Aksi takdirde, konsolda "Anagram Değil" yazdırınız.
        //Örneğin; "Mary" ve "army" ve "RAMY" Anagramlardır.

        //1.yol:
        /*Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir kelime giriniz");
        String ilklelime=input.nextLine();

        System.out.println("lütfen ikinci kelimeyi giriniz");
        String ikincikelime=input.nextLine();

       String arr[]= ilklelime.toLowerCase().split("");
        Arrays.sort(arr);

        String brr[]=ikincikelime.toLowerCase().split("");
        Arrays.sort(brr);

        if(ilklelime.length()!=ikincikelime.length()){
            System.out.println("annagram değildir");
        } else if (ilklelime.isEmpty()||ikincikelime.isEmpty()) {
            System.out.println("annagram değildir");
        } else if (Arrays.equals(arr,brr)) {
            System.out.println("annagramdır");
        }else{
            System.out.println("annagram değildir");
    }
*/
        //2. yol:
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ilk kelimeyi giriniz");
        String kelime1 = scan.next();
        System.out.println("Lutfen ikinci kelimeyi giriniz");
        String kelime2 = scan.next();

        int kelime1Length = kelime1.length();
        int kelime2Length = kelime2.length();

        String kelime1Arr[] = kelime1.split("");
        String kelime2Arr[] = kelime2.split("");

        Arrays.sort(kelime1Arr);
        Arrays.sort(kelime2Arr);

        int idx = 0;

        if(kelime1Length == kelime2Length) {
            for(int i = 0; i < kelime1Arr.length; i++) {
                if(kelime1Arr[idx].equals(kelime2Arr[idx])) {
                    idx++;
                };
            }
            if(idx == kelime1Arr.length) {
                System.out.println("Anagramdir");
            } else {
                System.out.println("Anagram degildir");
            }
        }else {
            System.out.println("Anagram degildir.");
        }




    }

    }
