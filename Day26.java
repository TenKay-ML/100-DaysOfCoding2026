import java.util.Scanner;

public class belajarjava {
    public static void main(String[] args) {
        Scanner al = new Scanner(System.in);

       int jumlahsaldo = al.nextInt();
       int tariktunai = al.nextInt();


       int berhasil = (tariktunai / 100000)*100000;
       int lembar = berhasil / 100000;
       int gagal = tariktunai % 100000;


       System.out.println("\nBerhasil ditarik \t: Rp"+berhasil);
       System.out.println("Jumlah lembar 100rb \t: "+lembar+" Lembar");
       System.out.println("Gagal ditarik \t\t: Rp"+gagal);
    }
}
