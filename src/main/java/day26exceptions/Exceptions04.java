package day26exceptions;

public class Exceptions04 {
    public static void main(String[] args) {

        int age = 25;
        try {
            printAge(age);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    //Yaş'ı ekrana yazdıran bir method yazınız.
/*
    public static void printAge(int age) {

        if (age > 0) {
            System.out.println(age);

        } else {
            System.out.println("Yaş negatif olamaz.");  //yanlış data ile iş yapmaya devam eder böyle yaparsak.. oysaki durmalı code buarada.
        }                                               //bu nedenle if/else kullanamayız

*/


    public static void printAge(int age) { //Exception üreten method oluşturduk. bunu main içinde kullandık.

        if (age < 0 || age>0) {
            throw new IllegalArgumentException("Yaş negatif olamaz veya 200 den büyük olamaz"); //Exception attığımız satırdan sonraki code lar çalışmaz ve -25 i ekrana yazdırmaz.
        }
        System.out.println(age);
    }

}

/*method'un içinde exception üretme hangi senaryolarda kullanılır?
application mimarları kurallar oluştururlar. bunu exceptionlarla yaparlar.

*/