import java.util.Scanner;

public class seratusharingoding {
    public static void main(String[] args) throws Exception {
        Scanner al = new Scanner(System.in);

     int[] angka = {10, 20, 30, 40, 50};

        System.out.print("Masukkan angka yang dicari: ");
        int cari = al.nextInt();

        boolean ditemukan = false;

        for (int a = 0; a < angka.length; a++) {
            if (angka[a] == cari) {
                System.out.println("Angka ditemukan pada indeks ke-" + a);
                ditemukan = true;
                break;
            }
        }

        if (ditemukan == false) {
            System.out.println("Angka tidak ditemukan!");
        }

        al.close();
    } 
}
