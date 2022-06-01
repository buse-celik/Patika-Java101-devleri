import java.util.Scanner;

class HarmonikSeri {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int a;
        double i, total = 0.0;
        
        System.out.print("Bir sayı giriniz: ");
        a = scan.nextInt();

        for (i = 1.0; i <= a; i++) {
            total = total + (1 / i);
        }System.out.println(total);


    }
}