import java.util.Scanner;

class MinMax {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int a, b, c, d, tmp = 0;

        System.out.print("sayı giriniz: ");
        a = input.nextInt();
        System.out.print("sayı giriniz: ");
        b = input.nextInt();
        System.out.print("sayı giriniz: ");
        c = input.nextInt();
        System.out.print("sayı giriniz: ");
        d = input.nextInt();

        // a > b > c > d

        if (a < b) { tmp = a; a = b; b = tmp; }
        if (c < d) { tmp = c; c = d; d = tmp; }
        if (a < c) { tmp = a; a = c; c = tmp; }
        if (b < d) { tmp = b; b = d; d = tmp; }
        if (b < c) { tmp = b; b = c; c = tmp; }
        
        
        System.out.println(a + " > " + b + " > " + c + " > " + d);

    }
}