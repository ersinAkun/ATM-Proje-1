package atm;

import java.util.Scanner;

public class ParaYatirma {

    public static void paraYatirma() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Yatiracaginiz miktari giriniz");
        int yatanPara = scan.nextInt();
        yatanPara = yatanPara + BakiyeSorgula.hesaptakiPara;
        BakiyeSorgula.hesaptakiPara = yatanPara;
        System.out.println("Hesaptaki Paraniz : " + BakiyeSorgula.hesaptakiPara());
    }
}
