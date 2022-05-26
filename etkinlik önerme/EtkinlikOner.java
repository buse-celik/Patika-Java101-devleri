import java.util.Scanner;

class EtkinlikOner {
    public static void main(String[] args) {
        
        /* Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner. */

        Scanner input = new Scanner(System.in);
        int hava;

        System.out.print("Size bir etkinlik önerebilmem için sıcaklığı giriniz: ");
        hava = input.nextInt();

        if (hava <= 5) {
            System.out.println("Hava durumuna göre önerilen etkinlik: kayak.");
        }else if ((hava > 5) && (hava < 15) ) {
            System.out.println("Hava durumuna göre önerilen etkinlik: sinema");
        }else if ((hava == 15)) {
            System.out.println("Hava durumuna göre önerilen etkinlik: sinema ve piknik");
        }else if ((hava > 15 && hava < 25)) {
            System.out.println("Hava durumuna göre önerilen etkinlik: piknik");
        }else if ((hava == 25)) {
            System.out.println("Hava durumuna göre önerilen etkinlik: piknik ve yüzme");
        }else if (hava >= 25) {
            System.out.println("Hava durumuna göre önerilen etkinlik: yüzme");
        }else{
            System.out.println("Hatalı girdi");
        }

    }
}