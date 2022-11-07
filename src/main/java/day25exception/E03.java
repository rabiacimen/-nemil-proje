package day25exception;

public class E03 {

    public static void main(String[] args) {

        String str="Ali";
        getNumOfChars(str); //length 3, son index 2 dir.

        String s="";
        getNumOfChars(s);//0
        String a; //null

        String t= null;
        getNumOfChars(t); //nullPointerException
        //eğer length() methodunda null kullanırsanız bu exception'ı alırısnız.


    }

    //Bir String'te bulunan karakterlerin sayısını bulabilmek için bir method oluşturunuz.
    public static void getNumOfChars(String str){


        try{
            System.out.println(str.length());
        }catch(NullPointerException e){
            System.out.println("length() methodundaa bir problem oluştu===>");

            e.printStackTrace(); //bu methodu kullandığınız zaman System.out.println(); kullanmanıza gerek yok.
        }

    }

}
