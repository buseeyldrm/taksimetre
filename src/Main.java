import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner klavye=new Scanner(System.in);
        int acilisUcreti=10;
        double Yol=2.20;
        System.out.print("kaç km yol gideceksiniz: ");
        int km= klavye.nextInt();
        double toplamTutar=acilisUcreti+(km*Yol);
        int minUcret=20;

        if (toplamTutar<20){
            System.out.println("toplam tutar: " +minUcret);
        }
        else {
            System.out.println("toplam ucret: " +toplamTutar);
        }
    }
}