import java.util.Scanner; 

class UsluSayi {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int a, b, i, total = 1;

        System.out.println("Pozitif bir tamsayı giriniz: ");
        a = scan.nextInt();
        System.out.println("Tamsayının üstünü giriniz: ");
        b = scan.nextInt();

        for (i = 0; i < b; i++) {
            total *= a;   
        } System.out.println(total);



    }
}