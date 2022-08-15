package atm;

import java.util.Scanner;

public class ParaGonderme {

    public static void paraGonderme(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Para Gondereceginiz kisinin iban no'sunu giriniz");
        String ibanNo=scan.next();
        if (ibanNo.substring(0,2).equals("TR") && ibanNo.length()==26){
            System.out.print("Gondermek istediginiz miktari giriniz : ");
            int ibanaGiden=scan.nextInt();
            if (ibanaGiden>BakiyeSorgula.hesaptakiPara()){
                System.out.println("Yetersiz bakiye lutfen yeni bir miktar giriniz");
            }else {
                ibanaGiden = (BakiyeSorgula.hesaptakiPara) - (ibanaGiden);
                BakiyeSorgula.hesaptakiPara = ibanaGiden;
                System.out.println("Hesaptaki Paraniz : " + BakiyeSorgula.hesaptakiPara());
                System.out.println(ibanNo + " nolu  Iban'a paraniz gonderilmistir");
            }
        } else System.out.println("iban numarasini hatali girdiniz tekrar deneyin!");

    }
}
