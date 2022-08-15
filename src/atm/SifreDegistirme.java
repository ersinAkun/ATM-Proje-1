package atm;

import java.util.Scanner;

public class SifreDegistirme extends MenuIslemler {

    public static String sifreDegistir(){
        Scanner scan = new Scanner(System.in);
        System.out.println("sifre degistirmek icin sifrenizi giriniz");
        String degisecekSifre = scan.nextLine().replaceAll(" ","");

        if (degisecekSifre.equals(sifre)){
            System.out.print("\nYeni sifreyi giriniz");
            String yeniSifre=scan.next().replaceAll(" ","");
            sifre=yeniSifre;
            System.out.println("Sifreniz basariyla degistirildi!\n");
        }else System.out.println("sifreyi yanlis girdiniz yeniden deneyin");
        return sifre;
    }
}
