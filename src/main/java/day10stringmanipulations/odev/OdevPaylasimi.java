package day10stringmanipulations.odev;

import java.util.Scanner;

public class OdevPaylasimi {


    public static void main(String[] args) {


        /*Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.

                John White
        1234234534561478
        Output : Name :

        J** W*

                CCN  : ** ** ** 1478

                * Ilk Harfler Buyuk harf ile baslamalidir.
                */

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen isminizi,soyisminizi ve kart numaranizi giriniz.");
        String isim=input.next();
        String soyisim=input.next();
        String kartNo=input.next();
        int isimBoyut=isim.length();
        int soyIsimBoyut=soyisim.length();
        int kartNoBoyut=kartNo.length();
        System.out.println(isim.substring(0,1).toUpperCase()+isim.substring(1,isimBoyut).replaceAll("[A-Za-z]","*") +" ");
        System.out.println(soyisim.substring(0,1).toUpperCase()+soyisim.substring(1,soyIsimBoyut).replaceAll("[A-Za-z]","*")+" ");

        if (kartNo.replaceAll("[0-9]","*").length()>0){
            System.out.println("Kart numaraniz sadece rakamlardan olusmalidir.");
            if (kartNo.length()!=16) {
                System.out.println("Lutfen 16 haneli kart numaranizi giriniz.");
            }else {
                String newKart=(kartNo.substring(0,12).replaceAll("[0-9]","*")+kartNo.substring(12));
                System.out.println(newKart.substring(0,4) + " " + newKart.substring(4,8)+ " "+ newKart.substring(8,12)+" "+newKart.substring(12));
            }
        }


    }
    }

