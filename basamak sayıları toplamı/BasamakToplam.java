import java.util.Scanner;

class BasamakToplam {
    public static void main(String[] args) {
        
        /*
            Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
            Örnek : 1643 = 1 + 6 + 4 + 3 = 14
        */
        
        int a, basamaklar = 0, result = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        a = scan.nextInt();

        while (a != 0) {
            basamaklar = a % 10;
            result = result + basamaklar;
            a /= 10;
        } System.out.println(result);

    }
}