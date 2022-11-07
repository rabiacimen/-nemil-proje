package day18arraylistspassbyvalue;

public class MethodOverloading01 {

    /*
    Method overloading nasil yapilir?
    1)Method isimleri ayni olmalidir
    2)Method parametreleri farkli olmalidir
        i)Parametre sayilari degistirilebilir
        ii)Data tiplerini degistirebilirsiniz
        iii)Yerlerini degistirebilirsiniz ama data tipi farkliysa
    3)Method isimleri+parametreler=method signature(imza)
    Method signature disinda ne degistirirseniz degistirin
    java o methodlari farkli kabul etmez.Imzaya bakar
     */
    public static void main(String[] args) {

        add(3,5);
        add(3,5.0);

    }



    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void add(int a, double b) {
        System.out.println(a + b);
    }

    public static void add(double a, int b) {
        System.out.println(a + b);
    }
}