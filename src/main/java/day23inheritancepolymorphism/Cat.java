package day23inheritancepolymorphism;

public class Cat extends Mammal{

    public void meow(){

        System.out.println("Cat meow");
    }

    @Override//overriding method denir
    public void eat() {
      //  super.eat();//parent a git eat kullan demek. ama ben bunu kullanmak istemediğim için silyorum..

        System.out.println("Cats eat");

    }

    @Override
    public Integer multiply(int a, int b) {
        return a*b+1;
    }

    @Override
    public Animal create() { //animal'ı mammal da yapabiliriz.
        return new Mammal();//hayvan objesi oluşturuyordu ben memeliler objesi oluşturum. küçük kutuyu büyük kutunun içen koyabiliriz.
    }




    /*

    @Override , eat methodu sıfırdan oluşturulmuş değil, parent dan alınmıştır demektir. javanın yaptığımız işi kontrol etmesini sağlar. "@" işareti annotation demektir.
    1) Override yaparken "method'un body'si değiştirilir.
    2)Override yaparken asla method signuture'a(isim ve parametre kısmı) dokunulmaz.
    3)Override yaparken inheritance olmak zorundadır. parent'dan alıp değiştirme işlemidir zaten. override yapmanın ön şartı inheritance'ın olmasıdır.
    4)Override yaparken "access modifer"lar belli kurallara göre farklılaştırılabilirler.
        i) private method'lar override edilemezler.
        ii) Child Class'daki override edilen methodun access modifier'ı parent class'daki methodun access modifier'i ile aynı veya geniş olmalıdır.
        örn: ya ikisi de pulic olmalı ya da child class public iken parent olan default/protected olmalı. tersi olmuyor.
        örn:parent default, child protected olabilir. childdaki access modifier daha büyük olmalıdır.
        not: child class'daki methodun access modifier'i daha dar olamaz.
        ii) default methodlar aynı package içindeyse override edilebilirler. farklı packageden override edilemezler.
    5) parent class'daki methodun return type'ı void ise return type değiştirilemez. eğer değiştirirseniz hata verir.
    6) parent clss'daki methodun return type' primitive ise return type değiştirilemez. örneğin mesela int i sen short yapmak istedin. kabul etmez.
    7)parent clss'daki methodun return type'ı wrapper class ise return type değiştirilemez.
    8)parent clss'daki methodun return type'ı Parent class ise return type child'lardan biri olabilir.
        note: Child Class'daki return type parent class'dakinden geniş olamaz.
        Note: Aralarında parent/child ilişkisi olmayan class'lar overriding'de return type değişiminde kullanılamazlar.
        örneğin: "short" integer'dan küçüktür fakat aralarında parent/child ilişkisi olmadığından "Integer" yerine short kullanamazsınız.
    9) Child'daki methodun return type'ından parent'taki methodun return type'ına gidişte "IS-A" relationship olmalı.
        parent'dan child'a gitmek istersen "HAS-A" relationship olmalı.
        Aralarında IS-A relationship olan Data Type'lara "Covariant" denir.
    10) Final methodlar override edilemezler. çünkü overriding'de method body değiştirilir. Fakat final method buna müsade etmez.
    11) POlymorphism = Overloading + Overriding ( çoklu yapı/çok biçimlilik =
        Note: Polymorphism nedir? derlerse Overloading ve Overriding'i anlatınız.
     12) OVERLOADİNG ile OVERRİDİNG arasındaki farklar nelerdir?
            i) Overloading için inheritance gerekmez fakat overriding için gerekir. (overloading bir class'ın içinde oluyordu çünkü.)
            ii)"private" method'lar overload edilebilir, override edilemezler.
            iii) Final methodlar overload edilebilir(burada sadece parametrelere dokunuyorum), override edilemezler.
            iV) Overloading static polymorphism olarak, overriding dinamic polymorphism olarak adlandırılır.
            Çünkü static methodlar overload edilebilir, override edilemezler.
            V)"Overloading" de method signature değişir ama "Overriding" de method signature'a dokunulmaz.


     */



}
