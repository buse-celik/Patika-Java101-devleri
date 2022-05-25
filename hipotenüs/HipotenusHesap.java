import java.util.Scanner;

class HipotenusHesap {
    public static void main(String[] args) {

 /* 
Dik Üçgende Hipotenüs Bulan Program
Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

 */ 

Scanner input = new Scanner(System.in);

double a, b, c, u, alan;

// a ve b dik kenarlar, c hipotenüs, d hipotenüs'ün karesi, u üçgenin çevresinin yarısı.


System.out.print("1. dik kenar uzunluğunu giriniz: ");
a = input.nextDouble();

System.out.print("2. dik kenar uzunluğunu giriniz: ");
b = input.nextDouble();

c = Math.sqrt(a*a + b*b); 

System.out.println("hipotenüs: " + c);



} 
}