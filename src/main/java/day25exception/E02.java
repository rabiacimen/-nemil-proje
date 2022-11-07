package day25exception;

public class E02 {
    public static void main(String[] args) {

       String arr[]={"Ali","Can","Veli","han"};

       getElementFromArray(arr,2); //Veli
        getElementFromArray(arr,0); //Ali
        getElementFromArray(arr,4); // hata verir

    }

    //Bir String Array'den index girerek eleman elde edebilmek için bir method oluşturun.

    public static void getElementFromArray(String arr[], int idx){
        try{
            System.out.println(arr[idx]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index'te bir problem oluştu====>"+ e.getMessage()); //benim teknik olmayan açıklamam. + javanın teknik açıklması


          e.printStackTrace();  //Exception ile ilgili detaylıca teknik mesaj verir.
             System.err.println("Array index'te  bir problem yaşandı"); //hata mesajını diğer mesajlardan ayırmak için kullanırız.


        }

    }





}
