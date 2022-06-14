import java.util.Scanner;

class Uslu {

    static int Calculate(int a, int b) {
        int i = 1, result = 1;
        for(i = 1; i <= b; i++) {
            result = result * a;
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        
        System.out.print("Taban değeri giriniz: ");
        int a = scan.nextInt();
        System.out.print("Üs değeri giriniz: ");
        int b = scan.nextInt();

        System.out.println("Sonuç: " + Calculate(a, b));

    }
}