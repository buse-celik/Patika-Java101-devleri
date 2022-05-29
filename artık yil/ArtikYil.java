import java.util.Scanner;

class ArtikYil {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int yil;
        System.out.print("Yıl giriniz: ");
        yil = input.nextInt();


        if (yil % 100 == 0) {
            if (yil % 400 == 0) {
                System.out.println(yil + " artık yıldır.");
            }else if (!(yil % 400 == 0)) {
                System.out.println(yil + " artık yıl değildir.");
            }else {
                System.out.println("Hatalı giriş yaptınız.");
            }
        }else if (yil % 4 == 0) {
            System.out.println(yil + " artık yıldır.");
        }else if (yil % 4 != 0) {
            System.out.println(yil + " artık yıl değildir.");
        }else {
            System.out.println("Hatalı giriş yaptınız.");
        }

    }
}