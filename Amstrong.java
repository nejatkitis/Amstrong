import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        int sayi,kalan,s1;
        int sonuc = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        sayi = input.nextInt();
        int i =0; // Basamak sayısı
        s1 = sayi;
        while (s1!=0){
            s1 /= 10;
            i++;
        }
        int j =0;
        s1 = sayi;
        while (s1!=0){
            int carp =1;
            kalan = s1 %10;
            s1 = s1/10;
            for (int k=0;k<i;k++){
                carp *= kalan;
            }
            j++;
            sonuc += carp;
        }
        if (sonuc==sayi){
            System.out.println("Girmiş olduğunuz sayı bir Amstrong sayıdır.");
        }
        else {
            System.out.println("Girmiş olduğunuz sayı bir Amstrong sayı değildir.");
        }
    }
}
