import java.util.Scanner;
public class HmSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, select;

        System.out.print("ilk sayıyı giriniz: ");
        a = input.nextInt();

        System.out.print("ikinci sayıyı giriniz: ");
        b = input.nextInt();

        System.out.println("1- Toplama\n2- Çıkarma\n3- Çarpma\n4- Bölme");

        System.out.print("Seçiminiz: ");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                if(b != 0){
                  System.out.println(a / b);  
                }else{
                    System.out.println("Bir sayı 0'a bölünemez.");
                }
                break;
            default: 
                System.out.println("Hatalı seçim yaptınız.");
        }


    }
}
