package atm;

import java.util.Scanner;

public class MenuIslemler {
    static String kartNo = "1234 1234 1234 1234";
    static String sifre = "12345";

    static boolean cikilsinMi = false;
    public static void menu() {


        boolean dogruMu = false;
        Scanner scan = new Scanner(System.in);
        String kartNoKullanici = "";
        String sifreKullanici = "";
        System.out.println("JAVA BANK'A HOSGELDINIZ");
        while (!dogruMu) {
            System.out.print("Lutfen 16 haneli kart numaranizi giriniz : ");
            kartNoKullanici = scan.nextLine().replaceAll(" ", "");
            if (kartNo.replaceAll(" ", "").equals(kartNoKullanici)) {
                System.out.println("Kart Numarasi Dogrulandi\nLutfen kart sifresini giriniz : ");
                sifreKullanici = scan.nextLine().replaceAll(" ", "");
                if (sifre.replaceAll(" ", "").equals(sifreKullanici)) {
                    System.out.println("Sifre dogrulandi...");
                    dogruMu = true;
                } else {
                    System.out.println("sifreyi yanlis girdiniz \nLutfen tekrar giriniz");
                }
            } else {
                System.out.println("Kart Numarasini yanlis girdiniz \nLutfen tekrar giriniz");
            }
        }


        //static boolean cikilsinMi = false;
        while (!cikilsinMi) {
            System.out.println("Yapacaginiz Islemi seciniz...\n1: BakiyeSorgulama  \n2: Para Yatirma\n3: Para Cekme\n4: Para Gonderme\n5: Sifre Degistir\n6: Cikis ");

            int islem = scan.nextInt();
            AtmRunner bakiyeSorgu = new AtmRunner();
            switch (islem) {
                case 1:
                    BakiyeSorgula.hesaptakiPara();
                    break;
                case 2:
                    ParaYatirma.paraYatirma();
                    break;
                case 3:
                    ParaCekme.paraCekme();
                    break;
                case 4:
                    ParaGonderme.paraGonderme();
                    break;
                case 5:
                    SifreDegistirme.sifreDegistir();
                    break;
                case 6:
                    Cikis.cikis();
                    break;
                default:
                    System.out.println("Yanlis bir tusa bastiniz lutfen yeniden deneyin..");
                    break;
            }
        }

    }

}