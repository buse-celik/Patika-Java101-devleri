import java.util.Scanner;

class EbobEkok {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int kucuk, buyuk, ebob = 0, ekok = 0; 

        System.out.println("n sayısını giriniz: ");
        kucuk = sc.nextInt();
        System.out.println("k sayısını giriniz: ");
        buyuk = sc.nextInt();

        if (kucuk > buyuk) {
            int temp = 0;
            temp = kucuk;
            kucuk = buyuk;
            buyuk = temp;
        } //swapped the integers

        //ebob

        for (int i = 1; i <= kucuk; i++) {
            if ((kucuk % i == 0) && (buyuk % i == 0)){
               ebob = i;  
            } 
        } System.out.println("EBOB: " + ebob);

        //ekok EKOK = (n1*n2) / EBOB

        ekok = (kucuk * buyuk) / ebob;
        System.out.println("EKOK: " + ekok);


        

    



    }
}