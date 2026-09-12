/**
 * belajarjava
 */
import java.util.Scanner;
public class belajarjava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("NAMA SAYA : ");
        String nama = input.nextLine();

        System.out.print("NIM SAYA : ");
        String nim = input.nextLine();

        System.out.print("UMUR SAYA : ");
        int umur = input.nextInt();

        System.out.print("TINGGI BADAN SAYA : ");
        double tinggi = input.nextDouble();

        System.out.print("BERAT BADAN SAYA : ");
        Float berat = input.nextFloat();

       input.close();

    }    
    
}
