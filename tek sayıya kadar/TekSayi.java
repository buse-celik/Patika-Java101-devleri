import java.util.Scanner;

class TekSayi {
    public static void main(String[] args) {
        
        /*
        Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.
        */


        Scanner input = new Scanner(System.in);

        int i = 0, toplam = 0;

        /* do {
            System.out.println("Tam sayı giriniz");
            i = input.nextInt();
            if (i % 2 != 0 && i > 0) {
                toplam += i;
            }
        }while (i > 0);

        System.out.println("Girilmiş tek sayıların toplamı: " + toplam); */


        /* Ödev
        Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
        */ 

        do {
            System.out.println("Tamsayı giriniz: ");
            i = input.nextInt();

            if (i % 2 == 0 && i % 4 == 0) {
                toplam += i;
            }
        }while (i % 2 == 0);
        System.out.println("Girilmiş 2'ye ve 4'e bölünen sayıların toplamı: " + toplam);
    }
}