import java.util.Scanner;

class Taksimetre {

public static void main(String[] args) {
    
    /* Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

    Taksimetre KM başına 2.20 TL tutmaktadır.
    Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
    Taksimetre açılış ücreti 10 TL'dir. 

    */

    double gidilenYol, tutar, kisaMesafe;
    Scanner input = new Scanner(System.in);


    System.out.print("Gidilen mesafeyi giriniz: ");
    gidilenYol = input.nextDouble();

    tutar = (gidilenYol * 2.20);
    boolean kosul = tutar < 20;

    System.out.println(kosul ? "20 tl" : 10 + tutar + "tl");


}
}