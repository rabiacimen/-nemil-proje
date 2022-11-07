package day23inheritancepolymorphism;

public class Bird extends Animal{

    /*

    "final" keyword nedir?
        i)variable'larda kullanılabilir.
            public final int age=12; //asla değişmez
            * Atanan değer değiştirilemez.
            * Değer ataması yapmak zorundayız. örn: pi sayısında kullanırız.

        ii) method'larda kullanılabilir.
            public final int add(){
                    return a+b;
           }
           * Bir method oluşturulurken final olarak oluşturulmuş ise o methodun body'si asla değiştirilemez.
             Dolayısıyla o method override edilemezler.

        iii) class'larda kullanılabilir.
            Bir class'ı final yaparsanız o class'ı kısırlaştırmış olursunuz.
            Onun child'ı olamaz. O class'a extend edilemez.
            Ama final class'ın kendisi child olabilir.

     */



}
