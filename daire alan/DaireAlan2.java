import java.util.Scanner;
public class DaireAlan2 {
    public static void main(String[] args) {
        
        //ödev Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.𝜋 sayısını = 3.14 alınız. Formül : (𝜋 * (r*r) * 𝛼) / 360

    Scanner odev = new Scanner(System.in);
    double r, a, alan, pi = 3.14;

    System.out.print("Dairenin yarıçapını giriniz: ");
    r = odev.nextDouble();

    System.out.print("Dairenin merkez açı ölçüsünü giriniz: ");
    a = odev.nextDouble();

    alan = (pi * (r*r) * a) / 360;

    System.out.println("Dairenin alanı: " + alan);
    
    }
}
