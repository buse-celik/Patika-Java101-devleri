import java.util.Scanner;
class KdvTutari {
    public static void main (String[] args) {
    
        /* Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
        */

    Scanner input = new Scanner(System.in);
    
    double kdvli, kdvsiz, kdvTutar, kdvOran1 = 0.18, kdvOran2 = 0.08;

    System.out.print("KDV'siz fiyatı giriniz: ");
    kdvsiz = input.nextInt();
    
    boolean kosul1 = kdvsiz < 1000;

    double kdv1 = (kdvsiz + (kdvsiz * kdvOran1));
    double kdv2 = (kdvsiz + (kdvsiz * kdvOran2));

    String kdvSonuc = kosul1 ? "KDV'li fiyat: " + kdv1 : "KDV'li fiyat: " + kdv2;
    System.out.println(kdvSonuc);

    double kdvTutar1 = (kdv1 - kdvsiz);
    double kdvTutar2 = (kdv2 - kdvsiz);

    System.out.println(kosul1 ? "KDV tutarı: " + kdvTutar1 : "KDV tutarı: " + kdvTutar2);


    }
}