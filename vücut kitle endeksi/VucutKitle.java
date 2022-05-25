import java.util.Scanner;
class VucutKitle {
    public static void main(String[] args) {
        
    /* Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

    Formül: Kilo (kg) / Boy(m) * Boy(m) 
*/

    Scanner input = new Scanner(System.in);
    double boy, kilo, vki;

    System.out.print("Boyunuzu metre cinsinden giriniz: ");
    boy = input.nextDouble();

    System.out.print("Kilonuzu kilogram cinsinden giriniz: ");
    kilo = input.nextDouble();

    vki = kilo / (boy * boy);

    System.out.println("Vücut kitle indeksiniz: " + vki);

    }
}