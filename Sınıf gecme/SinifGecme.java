import java.util.Scanner;

class SinifGecme{
    public static void main(String[] args) {
        /*
        Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

        Geçme Notu : 55

        Ödev
        Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
        */

        double mat, fiz, tur, kim, muz, ortalama, toplam = 0, bolum = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Matematik notunuzu girin: ");
            mat = input.nextDouble();

            if (mat < 0 || mat > 100) {
            System.out.println("Matematik notunuz geçersiz.");
            }else {
                bolum = bolum + 1;
                toplam = toplam + mat;
            }

        System.out.print("Fizik notunuzu girin: ");
            fiz = input.nextDouble();

            if (fiz < 0 || fiz > 100) {
                System.out.println("Fizik notunuz geçersiz.");
            }else {
                bolum = bolum + 1;
                toplam = toplam + fiz;
            }

        System.out.print("Türkçe notunuzu girin: ");
            tur = input.nextDouble();

            if (tur < 0 || tur > 100) {
                System.out.println("Türkçe notunuz geçersiz.");
            }else {
                bolum = bolum + 1;
                toplam = toplam + tur;
            }

        System.out.print("Kimya notunuzu girin: ");
            kim = input.nextDouble();

            if (kim < 0 || kim > 100) {
                System.out.println("Kimya notunuz geçersiz");
            } else {
                bolum = bolum + 1;
                toplam = toplam + kim;
            }

        System.out.print("Müzik notunuzu girin: ");
            muz = input.nextDouble();

            if (muz < 0 || muz > 100) {
                System.out.println("Müzik notunuz geçersiz");
            } else {
                bolum = bolum + 1;
                toplam = toplam + muz;
            }
        
        ortalama = toplam / bolum;
        System.out.println("Ortalamanız: " + ortalama);
            if (ortalama > 55) {
                System.out.println("Sınıfı Geçtiniz!");
            }else {
                System.out.println("Sınıfta Kaldınız.");
            }

        


        


            

    
    }
}