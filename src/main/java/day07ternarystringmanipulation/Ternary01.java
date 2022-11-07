package day07ternarystringmanipulation;

public class Ternary01 {

    public static void main(String[] args) {
        //Bir sayının pozitif olup olmadığını ekrana yazdıran kodu yazınız.
        //1.yol: if-else
        int a = 12;
        if(a>0) {
            System.out.println("Pozitif");
        }else {
            System.out.println("Pozitif değil");
        }

        //Ternary:

                    //condition ? condition doğru ise      : condition yanlış ise uygulancak kod

        String sonuc = a>0      ?      "Pozitif"                :                 "Pozitif değil" ;
        System.out.println(sonuc);

        //İki sayıdan küçük olanı seçen kodu yazınız.
        int b = 120;
        int c = 23;

        int min = b<c ? b : c ;
        System.out.println(min);

        //Example 3: Verilen bir sayının mutlak değerini hedsaplayam kodu yaınız.
         // <pozitif sayıların ve sıfırın mutlak değeri kendileridir. negatif sayıların mutlak değeri _1 ile çarpılmış halleridir.

        int d = 45;
        int abs = d<0 ? -1*d : d;
        System.out.println(abs);

        //Example4: iki tane sayı aynı işsarteli ise bu sayıları çarpınız farklı işsaretli ise işlem yapamam nmesajı veriniz.

        int e = 12;
        int f = 10;

        Object islem = (e>0 && f>0) || (e<0 && f<0) ? e*f : "işlem yapamam";
        System.out.println(islem);
          // ternary farklı data tiplerimde sonuç return ederse sonucun data tipini "object" yapınız.
        // java'da her class'ın en az bir tane parent class'ı vardır.
        //Sadece Object class'ın parent class'ı yoktur.









        }

    }

