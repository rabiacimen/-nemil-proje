package day10stringmanipulations.odev;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Listler {
    public static void main(String[] args) {


        /* 1.Bir tamsayı listesindeki tüm öğelerinin toplamını bulunuz.
        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(31);
        myList.add(7);
        myList.add(13);
        myList.add(10);
        int sum=0;

        for(Integer w:myList){
            sum+=w;
        }
        System.out.println(sum);
*/
        //2.Bir tamsayı listesinde 13 öğesinden önceki tüm liste öğelerinin toplamını bulunuz.

        /*List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(31);
        myList.add(7);
        myList.add(13);
        myList.add(10);

        int sum=0;
        for(Integer w: myList){
            if(w==13){
                break;
            }
            sum+=w;

        }
        System.out.println(sum);
        
*/
        //3.Bir tamsayı listesindeki tüm çift sayıların çarpımını bulunuz.
        //1. Yol:
        /*List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(31);
        myList.add(7);
        myList.add(13);
        myList.add(10);

        int m = 1;
        for (Integer w : myList) {
            if (w % 2 != 0) {
                    continue;
            }
            m=m*w;
        }
        System.out.println(m);
        */

        //4.Bir listedeki öğelerin azalan sırada olup olmadığını kontrol ediniz.
        //Örnek: (Sarı, Mavi, Kırmızı, Yeşil) ==> Çıktı: Azalan sırada değil
        // (Sarı, Kırmızı, Yeşil, Mavi) ==> Çıktı: Azalan sıradad
        // ****************************************************************************************************

        //5.Listede eleman olarak 15 varsa, tüm 15'leri 51 olarak değiştiriniz.
        //Örnek: (12, 11, 15, 34, 43) ==> Çıktı (12, 11, 51, 34, 43)
       /* List<Integer> g = new ArrayList<>();
        g.add(12);
        g.add(11);
        g.add(15);
        g.add(34);
        g.add(15);
        g.add(43);
        if (g.contains(15)) {
            for (Integer w : g) {
                if (w == 15) {
                    int idx = g.indexOf(15);
                    g.set(idx, 51);
                }
            }
            System.out.println(g);

        } else {

            System.out.println("liste 15 elemanını içermiyor");
        }
        */

        //6.Listede 15 veya 13 varsa, bu elemanları kaldırınız.
        //Örnek: (10, 31, 15, 13, 54) ==> Çıktı (10, 31, 54)

      /*  List<Integer> h = new ArrayList<>();
        h.add(10);
        h.add(31);
        h.add(15);
        h.add(13);
        h.add(54);
        h.add(13);

        if(!h.contains(15) && !h.contains(13)){
            System.out.println("Liste 13 ve 15'i icermiyor");
        }else {
            for (int i = 0; i < h.size(); i++) {
                if (h.get(i) == 15) {
                    int idx15 = h.indexOf(15);
                    h.remove(idx15);
                    i--;
                }
                if (h.get(i) == 13) {
                    int idx13 = h.indexOf(13);
                    h.remove(idx13);
                    i--;
                }
            }
            System.out.println(h);
        }
*/

        // 7) Bir tamsayı listesinde en yakın 2 tamsayıyı bulunuz.
        //  Örnek: (12, 31, 15, 13, 54) ==> Çıktı 12 ve 13'tür

       /* List<Integer> h = new ArrayList<>();
        h.add(12);
        h.add(31);
        h.add(15);
        h.add(13);
        h.add(54);
        Collections.sort(h); //12,13,15,31,5

        int minDiff=h.get(2)-h.get(1);

        for (int i = 1; i <h.size() ; i++) {

            minDiff=Math.min(minDiff,h.get(i)-h.get(i-1));

        }

        for (int i = 1; i <h.size() ; i++) {
            if(minDiff==h.get(i)-h.get(i-1)){

                System.out.println(h.get(i) + "ve" + h.get(i-1));
            }
        }
*/

        //8) Listedeki 7 ve 10 dışındaki her öğenin değerini 2'şer artırınız.
        //Örnek: (12, 31, 7, 13, 10) ==> Çıktı (14, 33, 7, 15, 10)
       /* List<Integer> h = new ArrayList<>();
        h.add(12);
        h.add(31);
        h.add(7);
        h.add(13);
        h.add(10);


        for (Integer w : h) {

            if (w == 7 || w == 10) {
                continue;
            }
            h.set(h.indexOf(w), w + 2);



        }
        System.out.println(h);

       */

        //9)  String bir listede verilen tüm fiyatların toplamını bulunuz.
        //Örnek: List<String> myList = new List<String>{'$12.99', '$23.60', '$54.45'}; ==> 91.04

       /* List<String>myLİst=new ArrayList<>();
        myLİst.add ("$12.99");
        myLİst.add("$54.45");
        myLİst.add("$23.60");

        double sum=0;
         for(String w: myLİst){
             Double ücret= Double.valueOf(w.replace("$",""));

             sum+=ücret;


         }

        System.out.println(sum);
*/

        //10)Bir String listesinde verilen en düşük ve en büyük fiyatın toplamını bulunuz.
        // Örnek: List<String> myList = new List<String>{'$12.99', '$8.25', '$23.60', '$54.45'}; ==> 62.70

        /*List<String>myList = new ArrayList<>();
        myList.add("$12.99");
        myList.add("$8.25");
        myList.add("$23.60");
        myList.add("$54.45");

       List<Double>decimalList= new ArrayList<>();
       for( String w:myList){

           Double price= Double.valueOf(w.replace("$",""));
            decimalList.add(price);

       }
        Collections.sort(decimalList);
       Double sum=decimalList.get(0)+ decimalList.get(decimalList.size()-1);
        System.out.println(sum);
*/

        //11)Döngüleri kullanarak tamsayılardan oluşan bir listenin tüm öğelerinin benzersiz (tekrarsız)
        //olup olmadığını kontrol ediniz.

       /* kitap çözümü:

       List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(15);
        myList.add(23);

        Integer counter=0;
        for(Integer w:myList){
            for(Integer k:myList){
                if(w==k){
                    counter++;
                }
            }
        }
            if(counter==myList.size()){
                System.out.println("Tekrarlanan öğe yoktur");
            }else{
                System.out.println("En az bir öğe tekrarlanmıştır");
            }
*/
       //2.yol: kendi çözümüm:

        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(15);
        myList.add(23);
        int counter=0;
        List<Integer>kontrol=new ArrayList<>();
        for(Integer w:myList){
            if(!kontrol.contains(w)){
                kontrol.add(w);
            }else{
                continue;
            }

        }
        if(myList.size()== kontrol.size()){
            System.out.println("tekrarlanan öğe yoktur");
        }else{
            System.out.println("en az bir öğe tekrarlanmışır");
        }

        //12) Verilen herhangi bir arrayin Mountain Array olup olmadığını kontrol etmek için bir kod
        //yazınız.
        //Not:
        //Mountain Array ==> [0, 2, 5, 3, 1]
        //Bir array elemanları en büyük değerine kadar sürekli artan, en büyük değerinden sonra sürekli azalan
        // değer alıyorsa Mauntain Array' dir.
        //Mountain Array Değil ==> [5, 2, 7, 1, 4]
        //Bir array elemanları en büyük değerine kadar sürekli azalan, en büyük değerinden sonra sürekli artan
        // değer alıyorsa Mauntain Array değildir

        int arr[] = { 0, 2, 5, 3, 1 };


        List<Integer> list = new ArrayList<>();
        for (int w:arr){
            list.add(w);
        }
        System.out.println("list = " + list);


        int max = arr[0];
        for(int w:arr){
            if(w>max){
                max = w;
            }
        }
        System.out.println("max = " + max);

        List<Integer> list1 = new ArrayList<>();

        for (int i = 0; i<arr.length; i++){
            if(arr[i]==max){
                break;
            }
            list1.add(arr[i]);

        }
        System.out.println("list1 = " + list1);

        List<Integer> list2 = new ArrayList<>();

        for(int i = 0; i<list.size(); i++){
            if(i<list.indexOf(max)){
                continue;
            }
            list2.add(arr[i]);

        }
        System.out.println("list2 = " + list2);


        List<Integer> list1Copy = new ArrayList<>(list1);
        System.out.println("list1Copy = " + list1Copy);
        Collections.sort(list1Copy);

        List<Integer> list2Copy = new ArrayList<>(list2);
        System.out.println("list2Copy = " + list2Copy);
        Collections.sort(list2Copy);

        Collections.reverse(list2Copy); // tersine çevir

        if(list1.equals(list1Copy)&&list2.equals(list2Copy)){
            System.out.println("Mountain Array");
        }else {
            System.out.println("Mountain Array DEGIL");
        }



            }

        }














