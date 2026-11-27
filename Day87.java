import java.util.Scanner;

public class seratusharingoding {
    public static void main(String[] args) {
    Scanner al = new Scanner(System.in);
      
        int[] angka = {4, 8, 13, 25, 32};

        System.out.println("Data awal:");

        for(int a = 0; a < angka.length; a++){
            System.out.print(angka[a] + " ");
        }

        // Mengubah/Memanipulasi data array
        angka[2] = 15;

        System.out.println("\nData setelah diubah:");

        for(int a = 0; a < angka.length; a++){
            System.out.print(angka[a] + " ");
        }
    }
}
