import java.util.Scanner;
class ManavKasa {
    public static void main(String[] args) {
        
        /* Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

        Meyveler ve KG Fiyatları
        
        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL */

    double armutkg, elmakg, domateskg, muzkg, patlicankg, toplam;
    double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5;

    Scanner input = new Scanner(System.in);

    System.out.print("Kaç kg armut aldınız? ");
    armutkg = input.nextDouble();

    System.out.print("Kaç kg elma aldınız? ");
    elmakg = input.nextDouble();

    System.out.print("Kaç kg domates aldınız? ");
    domateskg = input.nextDouble();

    System.out.print("Kaç kg muz aldınız? ");
    muzkg = input.nextDouble();

    System.out.print("Kaç kg patlıcan aldınız? ");
    patlicankg = input.nextDouble();

    toplam = (patlicankg * patlican) + (muzkg * muz) + (domateskg * domates) + (elmakg * elma) + (armutkg * armut);

    System.out.println("Toplam tutar: " + toplam);



    }
}