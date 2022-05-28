import java.util.Scanner;

import javax.xml.transform.Source;

class UcakBileti {
    public static void main(String[] args) {

        int km, yas, yolTip;
        double fiyat, ucret = 0.10;

        Scanner input = new Scanner(System.in);
        
            System.out.print("Mesafeyi km cinsinden giriniz: ");
            km = input.nextInt();
                if (km <= 0) {
                    System.out.println("Hatalı veri girdiniz!");
                }
            System.out.print("Yaşınızı giriniz: ");
            yas = input.nextInt();
                if (yas < 0) {
                    System.out.println("Hatalı veri girdiniz!");
                }
            System.out.print("Yolculuk tipini giriniz: " + "1: Tek yön veya 2: Gidiş dönüş");
            yolTip = input.nextInt();
                if (!(yolTip == 1 || yolTip == 2)) {
                    System.out.println("Hatalı veri girdiniz!");
                }

        fiyat = (km * ucret); //fiyat hesaplandı ama printlenmedi
                 
                if (yolTip == 1) {
                    if (yas < 12 && yas >= 0) {
                    fiyat = (fiyat - fiyat * 0.3);

                    }else if (yas >= 12 && yas < 24) {
                    fiyat = (fiyat - fiyat * 0.1);

                    }else if (yas >= 65) {
                    fiyat = (fiyat - fiyat * 0.3);
                    }
                }else if (yolTip == 2) {
                    if (yas >= 65) {
                        fiyat = (fiyat - fiyat * 0.3);
                    }else if (yas < 12 && yas >= 0) {
                        fiyat = (fiyat - fiyat * 0.3);
                    }else {
                       fiyat = (fiyat - fiyat * 0.2); 
                    }  
                }
            
        System.out.println("Bilet fiyatı: " + fiyat);


            


    }
}