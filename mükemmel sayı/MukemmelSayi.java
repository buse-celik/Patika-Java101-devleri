import java.util.Scanner;

class MukemmelSayi {
    public static void main(String[] args) {
        
        //bölenleri bul topla
        //sayıya eşit mi bak
        //eşitse mükemmel sayı print

        int n, toplam = 0; 
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        n = scan.nextInt();

        for(int i = 1; i < n; i++) {
            if(n % i == 0) {
            toplam += i;
            }
        }if (toplam == n) {
            System.out.println(n + " mükemmel sayıdır.");
        }else {
            System.out.println(n + " mükemmel sayı değildir.");
        }

    }
}