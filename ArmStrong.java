package armstrong;

import java.util.Scanner;

public class ArmStrong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int toplam = 0;
        int b = Integer.parseInt(a);
        int d = Integer.parseInt(a);
        for (int i = 0; i < a.length(); i++) {
            
            int basamak = (int) Math.pow(b%10, a.length());
            toplam += basamak;
            b = b/10;
            
        }
        
        if (toplam == d) {
            System.out.println("Sayiniz armstrong sayidir");
            
        }
        
        else 
            System.out.println("Sayiniz armstrong sayi degildir");
    }

}
