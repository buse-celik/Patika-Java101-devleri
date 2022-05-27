import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
class KucuktenBuyuge {
    public static void main(String[] args) {
        
        //Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.

        Scanner input = new Scanner(System.in);
        int a, b, c;

    
        System.out.print("İlk sayıyı giriniz: ");
            a = input.nextInt();
        
        System.out.print("İkinci sayıyı giriniz: ");
            b = input.nextInt();
        
        System.out.print("Üçüncü Sayıyı giriniz: ");
            c = input.nextInt();

        if ((a < b)) {
            if (a < c) {
                if (b < c) {
                    System.out.println(a + "<" + b + "<" + c);
                }else {
                    System.out.println(a + "<" + c + "<" + b);
                }
            }else if (c < a) {
                System.out.println(c + "<" + a + "<" + b);
            }
        }else if (b < a) {
            if (a < c) {
                System.out.println(b + "<" + a + "<" + c);
            }else if (c < a) {
                if (b < c) {
                    System.out.println(b + "<" + c + "<" + a);
                }else if (c < b){
                    System.out.println(c + "<" + b + "<" + a);
                }
            }
        }else {
            System.out.println(a + "=" + b + "=" + c);
        }  


    }
}