import java.util.Scanner;

class UceDorde {
    public static void main(String[] args) {
        
        /*
        Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.

        Ödev
        Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
        */

        Scanner input = new Scanner(System.in);
        int i = 0, sayi, bolum = 0, toplam = 0;
        

        System.out.print("Bir sayı giriniz:" );
            sayi = input.nextInt();

        /*
        for (i = 1; i <= sayi; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        } */

       /* 
        while (i <= sayi) {
            if (i % 2 == 0) {
               System.out.println(i); 
            } i++;
        } */

        /* 
        do {
            if (i % 2 == 0) {
                System.out.println(i);
            } i++;
        }while (i <= sayi); */

        /*
        Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.

        Ödev
        Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
        */
        
        for (i = 0; i <= sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam = toplam + i;
                bolum++;   
                }   
            }System.out.println("3'e ve 4'e bölünebilen sayıların ortalaması: " + (toplam / bolum));
         
        

    }
}