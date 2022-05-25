import java.util.Scanner;

class KenarUzunlugu{
    public static void main(String[] args) {
        

double k1, k2, k3, cevre, alan;

Scanner input = new Scanner(System.in);

System.out.print("1. kenar uzunluğu: ");
k1 = input.nextDouble();

System.out.print("2. kenar uzunluğu: ");
k2 = input.nextDouble();

System.out.print("3. kenar uzunluğu: ");
k3 = input.nextDouble();

cevre = (k1 + k2 + k3);
alan = Math.sqrt((cevre / 2) * ((cevre / 2) - k1) * ((cevre / 2) - k2) * ((cevre / 2) - k3));

System.out.println("Üçgenin alanı: " + alan);

    }
}


