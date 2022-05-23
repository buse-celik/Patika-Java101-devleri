import java.util.Scanner;
class NotOrt {
    public static void main(String[] args) {
        

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
    
    System.out.println(sonuc > 60 ? "Sınıfı Geçti" : "Sınıfı Kaldı");
    

    }
}