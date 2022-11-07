package day23inheritancepolymorphism;

public class AnimalRunner {

    public static final int age=12; //asla değişmez
    //final olmayan bir methodu değer ataması yapmadan da yazabiliriz. java 0 koyar oraya.
    public static void main(String[] args) {




        Cat cat=new Cat(); //obje oluşturduk.

        cat.eat(); //animals eat yazdı. bunu update etmek istiyorum. cat classa git. update edince cats eat yazdı. overriding dyoruz.



        //age++; // artırıp azaltamayız. hata verir.






    }
}
