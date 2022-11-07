package day25exception;

public class E01 {

    /*  1-"Exception" (istisnai hata) javada kodlarımızı çalıştırırken meydana gelen beklenmedik durumlardır.
        2-Exception'larla çalışmanın iki yolu vardır.
            a) try-catch block kullanma ve exception oluşsa bile çalışmayı devam ettirme
            b) throw exception kullanarak çalışmayı durdurma( mesela
            yazdığımız kod gereği bir dosya üzerinden okuma yapmamız gerekiyor ise
            bu dosyamız eğer silinmişse java dosyayı bulamaz ve uygulamanın devam etmesi gerekmez)

        3- Eğer wxception'ı handle etmezsek(sorunu çözmezsek) java çalışmayı durdurur.
        4- try catch kullanırken try kodunu bir ya da birden fazla catch ile birlikte kullanabiliriz.
        5- Try ,catch olmaksızın tek başına kullanılamaz.
        6- Eğer yazmış olduğunuz herhangi bir kod satırında problem olabileceğini düşünüyosanız try-catch block içine koymalısınız.
        7- Catch block parantezi içerisine olması muhtemel exception class ismi yazılır.

        8- e.getmessage() , methodunu kullanarak teknik mesajlar elde edebiliriz.

           System.out.println(); burada yazmış olduğum mesajlar benim teknik olmayan açıklamalarımdır

           e.printStackTrace(); methodu Exception ile ilgili detaylıca teknik mesaj verir. KOD ÇALIŞMAYA DEVAM EDER.

           System.err.println(); hata mesajını RENKLİ olarak verir. bu sayede konsolda diğer messjlardan ayırmak için kullanırız.

        9- Eğer try body içindeki kod sorunsuz çalışırsa catch block devreye girmez.
     */
    public static void main(String[] args) {

        divide(6,2); //3
        divide(0,2); //0
        divide(6,0); // matematikte bir sayının sıfıra bölümü tanımsızdır.
        // bu matematikle alakalı bir sorun olmuştur. java burda bize exception verip bizden yardım istiyor.

        divide2(5,0);
        divide2(12,3);



    }



    //1.yol tavsiye edilmez.
    //Bir developer için tüm matematik kurallarını ezbere bilmek mümkün değildir.

    public static void divide (int a, int b) { //main içinde kullanmak için static yaptık.
        if(b==0){
            System.out.println("bir sayı sıfır ile bölünemez");
        }else {

            System.out.println(a / b); //methodumun görevi
        }
    }

    //2.yol : try-catch kullanarak exception'ı handle etmek tavsiye edilir.

    public static void divide2(int a,int b){

        try{
            System.out.println(a/b);
        }catch(ArithmeticException e){//ArithmeticException Class'ından "e" objesini çağırıyorum. e, variable adı.
                                    //her class aynı zamanda bir data tipidir. non-primitive'dir.
            System.out.println("bölme işleminde bir hata oluştu==>" +e.getMessage()); // teknik mesaj ekler buraya
            e.printStackTrace(); //zaten print yaptığı için sout içine yazmadık.

            System.err.println("bölme işleminde bir problem oluştu"); //renkli olarak gösterir. rahatlıkla bulmamızı sağlar.
        }







        //java matematik ile ilgili karşılaşılması muhtemel tüm istisnaları,hataları "ArithmeticException" class'ına koymuştur.

       // matemetikteki tüm istisnaları. detayları bilmek zorunda değiliz.


    }





}
