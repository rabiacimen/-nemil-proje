package day23inheritancepolymorphism;

public class Animal{

    public void eat(){

        System.out.println("Animals eat");
    }



    public Integer multiply(int a, int b){
        return a*b;
    }


    public Animal create(){//overridden method denir.
        return new Animal(); //hayvan objesi oluşturuyor ve hayvan objesi return edicek.
    }

    public final double divid(int a,int b){
        return a/b; //final methodlar override edilemez.
    }


}
