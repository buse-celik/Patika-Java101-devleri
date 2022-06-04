import java.util.Scanner;

class atm {
    public static void main(String[] args) {
        
        //switch-case kullan
        //kullanıcı adı sifre al. sifre 3 kez yanlıs firilise hesap bloke. 
        //para yatırma para cekme bakiye sorgulama cıkıs yapma

        Scanner sc = new Scanner(System.in);

        String userName = "patika", password = "dev";
        int kalanHak = 2, balance = 1500, yatirma, cekme;

        System.out.println("Kullanıcı adı: ");
        userName = sc.nextLine();
        System.out.println("Şifre: ");
        password = sc.nextLine();

        switch (userName) {
            case ("patika"):
            System.out.println("Kullanıcı adı doğru.");
        break;
        default: System.out.println("Kullanıcı adınız hatalı.");  
        }
        switch (password) {
            case("dev"): System.out.println("Şifre doğru.");
            break;
            default: 
                System.out.println( "Şifre hatalı.");
                while (!"dev".equals(password) && kalanHak > 0) {
                    System.out.println("Kalan hakkınız: " + kalanHak + ". Tekrar deneyiniz.");
                    kalanHak--;
                    password = sc.nextLine();
                }if (kalanHak == 0) {
                    System.out.println("Kartınız bloke edildi, bankanızla iletişime geçiniz.");
                }else {
                    System.out.println("Şifre doğru.");
                }
                
        } if (userName.equals("patika") && password.equals("dev")) {
            //para yatırma para cekme bakiye sorgulama cıkıs yapma
            System.out.println("Hoşgeldiniz.");
            System.out.println("Yapmak istediğiniz işlemi seçiniz: \n1: Para yatırma \n2: Para çekme \n3: Bakiye Sorgulama \n4: Çıkış");

            int secim = sc.nextInt();

            switch (secim) {

                case 1: //para yatırma 
                System.out.println("Yatırmak istediğiniz miktarı giriniz: ");
                yatirma = sc.nextInt();
                balance += yatirma; 
                break;

                case 2: //para çekme
                System.out.println("Çekmek istediğiniz miktarı giriniz: ");
                cekme = sc.nextInt();
                if (balance >= cekme) {
                   balance -= cekme; 
                } else {
                    System.out.println("Bakiyeniz yetersiz.");
                }
                break;

                case 3: //bakiye sorgulama
                System.out.println("Bakiyeniz: " + balance);
                break;

                case 4: //çıkış
                System.out.println("İyi günler.");

            }
        } 

    } 
}