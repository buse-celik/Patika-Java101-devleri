import java.util.Scanner;
class KdvTutari {
    public static void main (String[] args) {
    

    Scanner input = new Scanner(System.in);
    
    double kdvli, kdvsiz, kdvTutar;

    System.out.print("KDV'siz fiyatı giriniz: ");
    kdvsiz = input.nextInt();

    kdvli = (kdvsiz + ((kdvsiz * 18) / 100));
    kdvTutar = (kdvli - kdvsiz);

    System.out.println("KDV'li fiyat: " + kdvli);
    System.out.println("KDV tutarı: " + kdvTutar);


    }
}