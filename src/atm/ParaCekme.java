package atm;

import java.util.Scanner;

public class ParaCekme {
    public static void paraCekme(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Cekmek istediginiz miktari giriniz");
        int cekilenPara= scan.nextInt();
        if (cekilenPara>BakiyeSorgula.hesaptakiPara()){
            System.out.println("Yetersiz bakiye yeni bir miktar giriniz");
        }else {
            cekilenPara = (BakiyeSorgula.hesaptakiPara) - (cekilenPara);
            BakiyeSorgula.hesaptakiPara = cekilenPara;
            System.out.println("Hesaptaki Paraniz : " + BakiyeSorgula.hesaptakiPara());
        }
    }


}
