package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner01 {

    //Scanner, kullanıcıdan data almaya yarar, kullanıcı ile etkileşim kurmamızı sağlar. mesela hesap makinası oluşturma
    //Scanner, bir java class'ıdır. Bu class'ı kullanabilmek için import etmek gerekir.
    //Scanner class'ı java'nın util kütüphanesindedir.




    public static void main(String[] args) {

        //Kullanıcıdan data almak için yapılması gerekenler

        //1.adım: Scanner Class'ından object oluştur.
        Scanner input = new Scanner(System.in);

        //2.adım: Kullanıcıya ne yapacağını söylemem lazım
        System.out.println("Hey kullanici yasini gir...");

        //3.adım: Kullanıcıdan aldığınız datayı bir variable'nin içine koyun.
        byte age = input.nextByte();

        System.out.println("Hey kullanici senin yasin" + age);



    }


}
