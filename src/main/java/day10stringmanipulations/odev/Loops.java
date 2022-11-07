package day10stringmanipulations.odev;

public class Loops {
    public static void main(String[] args) {

        /*
        SORU1:120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki
        ardışık tam sayı arasında boşluk bırakarak yazınız
        1.yol:
        String s="";
        for(int i=120; i>10; i--){
            if(i%4==0 && i%6==0){
                s=s+i+" ";
                System.out.println(s);


            }
        }
        2.yol:
        String s = "";
        Integer i=120;
        while(i>10){
            if(i%4==0 && i%6==0){
                s = s + i + " ";
            }
            i--;
        }
        System.out.println(s);



       // 3.yol:
        String s = "";
        Integer i=120;
        do{
            if(i%4==0 && i%6==0){
                s = s + i + " ";
            }
            i--;
        }while(i>10);
        System.out.println(s);

*/
        /*benim yöntem
        for (int i = 120; i > 10; i--) {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print(i+ " ");
            }
        }
*/
        // SORU2:Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız.
        //Örneğin; accessories ´ ces

       /* String s = "accessories";
        String d = "";
        for (int i = 0; i < s.length() - 1; i++) {
            String c = s.substring(i, i + 1);
            if (s.indexOf(c) != s.lastIndexOf(c)) {
                if (!d.contains(c)) {
                    d = d + c;

                }
            }
        }

        System.out.println(d);
*/
        /*SORU8:20'den 3'e kadar olan tek tamsayıları aynı satırda ardışık olacak şekilde aralarında boşluk
        bırakarak yazdırmak için gereken kodu yazınız
         */
        //1.YOL:
       /* String v = "";
        for (Integer i = 20; i > 2; i--) {
            if (i % 2 != 0) {
                v = v + i + " ";

            }

        }
        System.out.println(v);

        //2.YOL:
        String g="";
        int i=20;
        while(i>2){
            if(i%2!=0){
                g=g+i+" ";
            }
            i--;

        }
        System.out.println(g);


        //3YOL:
        String h="";
        int ii=20;
        do{
            if(ii%2!=0){
                h=h + ii + " ";

            }
            ii--;


        }while(ii>2);
        System.out.println(h);


*/
        /*

        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
*/
      /*  for (int i = 1; i < 6; i++) {

            for (int k = 1; k <= i; k++) {

                System.out.print(k);
            }
            System.out.println("");
        }

*/

        // 9) String içindeki tüm küçük harfleri yıldız işaretiyle yazdırmak için gereken kodu yazınız.
        //Örneğin; 'Ali Can?' ==> l*i*a*n*
        // 1. Yol:

        /*String s= "Ali Can?";
       s= s.replaceAll("[^a-z]","");//li an
       String t="";
       for(int i=0; i<s.length();i++){
           String r=s.substring(i,i+1);
           t=t+r+'*';

       }
        System.out.println(t);

*/
        //2.yol:

       /* String s="Ali Can?";
        s=s.replaceAll("[^a-z]","");
        String t="";
        Integer i=0;
        while(i<s.length()){
            String r=s.substring(i,i+1);
            t=t+r+'*';
            i++;
        }
        System.out.println(t);
*/

        //3.yol:
      /*  String s="Ali Can?";
        s=s.replaceAll("[^a-z]","");
        String t="";
        Integer i=0;
        do {
            String r = s.substring(i, i + 1);
            t = t + r + '*';
            i++;
        }while(i<s.length());
        System.out.println(t);

        */

        /*10) Verilen ondalık sayının sadece ondalık kısmındaki rakamlarını, kendisinden önce bir yıldız
        işaretiyle yazdırmak için gereken kodu yazınız.
        Örneğin; 75.4238 ´ *4*2*3*8
        1. Yol:
*/
       /* double num= 75.4238;
        String s=String.valueOf(num);
        int idxnokta=s.indexOf(".");
        String decimalPart=s.substring(idxnokta+1);
        String t="";
        for(Integer i=0; i<decimalPart.length();i++){
            String r=decimalPart.substring(i,i+1);
            t=t+"*"+r;

        }
        System.out.println(t);
*/
        //2.yol:
       /* double num=75.4238;
        String s= String.valueOf(num);
        int idxnokta=s.indexOf(".");
        String decimalPart=s.substring(idxnokta+1);
        String t="";
        Integer i=0;
        while(i<decimalPart.length()){
            String r=decimalPart.substring(i,i+1);
            t=t+"*"+r;
            i++;
        }

        System.out.println(t);
*/
        //3.yol:
       /* double num=75.4238;
        String s=String.valueOf(num);
        int idxnokta=s.indexOf(".");
        String decimakPart=s.substring(idxnokta+1);
        String t="";
        Integer i=0;
        do{
            String r=decimakPart.substring(i,i+1);
            t=t+"*"+r;
            i++;
        }while(i<decimakPart.length());
        System.out.println(t);
*/
        // 11) Bir String’ i tersine çevirmek için kod yazınız. Örnek; Mark ==> kraM
        //1. Yol:
       /* String t = "Mark";
        String s = "";
        for (Integer i = t.length() - 1; i > -1; i--) {
            s = s + t.substring(i, i + 1);
        }
        System.out.println(s);
        //2.yol:

        String isim="mark";
        StringBuilder ters=new StringBuilder(isim);
        System.out.println(ters.reverse());

        */
        /*12) Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        A A A A A A A A
        A X X X X X X A
        A X X X X X X A
        A X X X X X X A
        1. Yol:

*/
       /* int satır = 4, sütün = 8;
        for (int i = 1; i <= satır; i++) {
            String s = "";
            if (i == 1 || i == satır) {

                for (Integer k = 1; k <= sütün; k++) {
                    s = s + "A";
                }
                System.out.println(s);
            } else {
                s = s + "A";
                for (Integer m = 2; m < sütün; m++) {
                    s = s + "X";
                }
                s = s + "A";
                System.out.println(s);
            }


        }
*/

// 13) 3 ile 14 arasındaki tam sayıların toplamını bulmak için kodu yazınız.
/* 1.yol:
        int sum=0;
         for(int i=3; i<15;i++){

             sum+=i;
         }
        System.out.println(sum);
*/
      /* 2.yol
        int sum=0;
        int i=3;

        while( i<15){
            sum=sum+i;
            i++;

        }
        System.out.println(sum);


        int sum = 0;
        int i = 3;

        do {
            sum += i;
            i++;

        } while (i < 15);
        System.out.println(sum);
        */

//14) 3 ile 9 arasındaki tam sayıların çarpımını bulmak için kodu yazınız.
        //1.yol
       /* int çarpım=1;
        for(int i=3; i<10;i++){
            çarpım=çarpım*i;
        }

        System.out.println(çarpım);
*/
        //2.yol
        /* int i=3;
        int çarpım=1;
        while(i<10){
            çarpım=çarpım*i;
            i++;
        }
        System.out.println(çarpım);
*/
        //3.yol
       /* int i=3;
        int çarpım=1;
        do{
            çarpım=çarpım*i;
            i++;
        }while(i<10);
        System.out.println(çarpım);
*/
        //15) Do-while döngüsünü kullanarak konsolda 'C' ile 'A' arasındaki karakterleri yazdırmak için
        //kod yazınız.

       /* 3.yol
        String str="";
        char ch='C';
        do{
            str=str+ch;
            ch--;
        }while(ch>='A');
        System.out.println(str);
*/
        /*2.yol
        String str="";
        char ch='C';
        while(ch>='A'){
            str+=ch;
            ch--;
        }
        System.out.println(str);
*/
        /*1.yol
        String str = "";

        for (char ch = 'C'; ch >= 'A'; ch--) {
            str += ch;
        }
        System.out.println(str);
*/
        //16) Bir String de, ilk 'm' karakterinden önceki tüm karakterleri yazınız

       /* 1. Yol:
        String s = "Christmas";
        String result = "";
        for(int i=0; i<s.length(); i++){
            String c = s.substring(i,i+1);
            if(c.equals("m")){
                break;
            }
            result = result + c;
        }
        System.out.println(result);
*/
        //2.yol
        /*String s = "Christmas";
        String result = "";
        int i=0;
        while( i<s.length()){
            String c = s.substring(i,i+1);
            if(c.equals("m")){
                break;
            }
            result = result + c;;
            i++;
        }
        System.out.println(result);
*/
        //3.yol
       /* String s = "Christmas";
        String result = "";
        int i=0;
        do {
            String c = s.substring(i, i + 1);
            if (c.equals("m")) {
                break;

            }
            result += i;
            i++;
        } while (i < s.length()) ;
                System.out.println(result);

           */

        //17) Bir tamsayıdaki rakamların toplamını bulmak için kodu yazınız.
        //1. Yol:


        /*int n = 753;
        int sumOfDigits = 0;
        for(int i = n; i>0; i=i/10){
            sumOfDigits = sumOfDigits + i%10;
        }
        System.out.println(sumOfDigits);
       //***************************************************************************
         */

        //18) Bir String’ de benzersiz(tekrarsız) karakterler yazdırmak için kod yazınız.
       // Örneğin; Hello ==> Heo
        /*String s = "Hello";
        for(int i=0; i<s.length();i++){
            String c = s.substring(i,i+1);
            if(s.indexOf(c) == s.lastIndexOf(c)){
                System.out.print(c);
            }
        }

*/
        /*String s="Hello";
        int i=0;
        while(i<s.length()){
            String c=s.substring(i,i+1);
            i++;
            if(s.indexOf(c)==s.lastIndexOf(c)){
                System.out.print(c);
            }
        }
*/
       /* String s="Hello";
        int i=0;
        do{
            String c=s.substring(i,i+1);
            i++;
            if(s.indexOf(c)==s.lastIndexOf(c)){
                System.out.print(c);
            }
        }while(i<s.length());
*/

        //19) Bir String’ deki boşluk ve noktalama işaretleri dışındaki toplam karakter sayısını bulunuz.
        /*String s = "Java is a strongly typed, object-oriented programming language.";
        s=s.replaceAll("\\s","").replaceAll("\\p{Punct}","");
        System.out.println(s.length());
*/
       /*
        20) Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.

        * * * * * *
        * * * * *
        * * * *
        * * *
        * *
        *
*/

      /*  int sayi=6;
        String s = "";
        for(int i=1; i<= sayi; i++){
            for(int k= sayi; k>=i; k--){
                s = s + "* ";
            }
            System.out.println(s);
            s = "";
        }
*/


       // 21) Bir tamsayının benzersiz(tekrarsız) basamaklarının toplamını bulmak için kodu yazınız.
       // Örnek:12133455 ´ 2+4=6











    }
}