import java.util.Scanner;
class NotOrt {
    public static void main(String[] args) {
        
    /*

    dersler: matematik, fizik, kimya, türkçe, tarih, müzik
    1- ders degiskenlerini tanımla
    2- notları kullanıcıdan alacak sınıfı tanımla (scanner)
    3- notları al
    4- notların ortalamasını al
    5- print

    */ 

    double matematik, fizik, kimya, turkce, tarih, muzik;

    Scanner input = new Scanner(System.in); 

    System.out.print("Matematik Notunuz:");
    matematik = input.nextDouble();
    

    System.out.print("Fizik Notunuz:");
    fizik = input.nextDouble();
    

    System.out.print("Kimya Notunuz:");
    kimya = input.nextDouble();
    

    System.out.print("Türkçe Notunuz:");
    turkce = input.nextDouble();
    

    System.out.print("Tarih Notunuz:");
    tarih = input.nextDouble();
    

    System.out.print("Müzik Notunuz:");
    muzik = input.nextDouble();
    
    double toplam = (matematik+muzik+tarih+turkce+fizik+kimya);
    double sonuc = toplam / 6;
    System.out.println("Ortalamanız: " + sonuc);


    }
}