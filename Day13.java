/**
 * belajarjava
 */
import java.util.Scanner;
public class belajarjava {

    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);

    System.out.print("nama saya : ");
    String nama = input.nextLine();

    System.out.print("umur saya : ");
    int umur = input.nextInt();

    System.out.print("tinggi saya : ");
    double tinggi = input.nextDouble();

    System.out.print("berat saya : ");
    float berat = input.nextFloat();

    System.out.print("jenis kelamin saya : ");
    char kelamin = input.next().charAt(0);
    input.nextLine();

    System.out.print("wa saya : ");
    String wa = input.nextLine();
    System.out.println("\n");

    System.out.println("==========BIODATA SAYA==========");
    System.out.println("Nama \t\t: "+ nama);
    System.out.println("umur \t\t: "+ umur);
    System.out.println("Tinggi \t\t: "+ tinggi);
    System.out.println("Berat \t\t: "+ berat);
    System.out.println("Jenis Kelamin \t: "+ kelamin);
    System.out.println("Nomor \t\t: "+ wa);
    System.out.println("================================");

    }
}
