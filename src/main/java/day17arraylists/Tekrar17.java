package day17arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tekrar17 {

    public static void main(String[] args) {
        //Example 1: "a" listinde "Shoes" elemaninin ilk gorunumunu siliniz


       /* List<String>a= new ArrayList<>();
        a.add("Ali");
        a.add("Said");
        a.add("Elif");
        a.add("Ali");

        System.out.println(a);

        a.remove("Ali");
        System.out.println(a);

        //tüm görünümlerini sil

        List<String>sil=new ArrayList<>();
        sil.add("Ali");
        a.removeAll(sil);
        System.out.println(a);

        //Example 3: Bir tane salary listi olusturun, eger salary 10000'den az ise %20 10000 ve 10000'den cok ise %10 zam yapiniz.
        List<Double> salary = new ArrayList<>();
        salary.add(12345.00);
        salary.add(8674.50);
        salary.add(15000.75);
        salary.add(9500.00);
        salary.add(20500.00);
        System.out.println(salary);

        for(Double w: salary){
            if(w<10000){
                salary.set(salary.indexOf(w),w*1.2);
            }else{
                salary.set(salary.indexOf(w), w*1.1);
        }

        }

        System.out.println(salary);
*/
        //Example 2: Kullanicidan bir harf aliniz, harf sizdeki List'in icinde varsa o harfi "Bulundu" ya ceviriniz yoksa o harfi List'e ekleyiniz
        //           [A, K, R, S]  ==> R  ==> [A, K, Bulundu, S]
        //           [A, K, R, S]  ==> X  ==> [A, K, R, S, X]
        Scanner input = new Scanner(System.in);


        System.out.println("Lutfen bir harf giriniz");
        String  harf = input.next().substring(0, 1);
        List<String> c = new ArrayList<>();
        c.add("A");
        c.add("K");
        c.add("R");
        c.add("S");

        do {

            if (c.contains(harf)) {
                c.set(c.indexOf(harf), "Bulundu");
            } else if(!harf.equals("Q")){
                c.add(harf);
            }
            System.out.println(c);
        }while(!harf.equals("Q"));



    }

}