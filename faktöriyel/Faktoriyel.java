import java.util.Scanner;

class Faktoriyel {
    public static void main(String[] args) {

        /* 
        Java ile faktöriyel hesaplayan program yazıyoruz.

        Ödev
        N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

        Java ile kombinasyon hesaplayan program yazınız.

        Kombinasyon formülü
        C(n,r) = n! / (r! * (n-r)!)
        */

        Scanner scan = new Scanner(System.in);

        int n, r, totalN = 1, totalR = 1, totalNR = 1, combination, i; 

         System.out.print("Kümenin eleman sayısını giriniz: ");
            n = scan.nextInt();
        System.out.print("Oluşturulacak grupların eleman sayısını giriniz: ");
            r = scan.nextInt(); 

        //n faktöriyel hesapla 
        for (i = 1; i <= n; i++) {
            totalN *= i;
        } //r faktöriyel hesapla
        for (i = 1; i <= r; i++) {
            totalR *= i;
        }
        //n-r faktöriyel hesapla
        for (i = 1; i <= (n-r); i++) {
            totalNR *= i;
        }   
        combination = (totalN / (totalR * totalNR));
        System.out.println("C(" + n + "," + r + ") = " + combination);

        



    }
}