import java.util.Scanner;
class DaireAlan {

    public static void main(String[] args) {
        
    /* Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

Alan Formülü : π * r * r;

Çevre Formülü : 2 * π * r;

Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360
    */
        
    Scanner input = new Scanner(System.in);
    double yaricap, alan, cevre, pi, a;

    pi = 3.14;
    System.out.print("Dairenin yarıçapını giriniz: ");
    yaricap = input.nextDouble();


    //alan hesapla Alan Formülü : π * r * r

    alan = pi * yaricap * yaricap;
    System.out.println("Dairenin alanı: " + alan);

    //çevre hesaspla Çevre Formülü : 2 * π * r

    cevre = 2 * pi * yaricap;
    System.out.println("Dairenin çevresi: " + cevre);


    

    }
}

