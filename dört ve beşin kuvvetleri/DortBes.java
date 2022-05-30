import java.util.Scanner;
import java.lang.Math;

class DortBes {
    public static void main(String[] args) {

        /* Ödev
        Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz. */

        Scanner scan = new Scanner(System.in);
        int girilenSayi, i = 0;
        
        System.out.print("Tamsayı giriniz: ");
            girilenSayi = scan.nextInt();

            while (i <= girilenSayi) {
                System.out.println(Math.pow(4, i) + " ve " + Math.pow(5, i));
                i++;
            }
    }
}