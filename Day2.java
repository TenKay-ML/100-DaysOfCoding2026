import javax.print.DocFlavor.STRING;

/**
 * Day2
 */
public class Day2 {

    public static void main(String[] args) {
        
        String nama = "Alhadi Nurrahman M";
        String nim = "D0226520";
        String alamat = "Polewali, Sulawesi Barat";
        String nomor = "082345937093";
        String hobi = "Berenang";

        //Menggunakan println
        System.out.println("===========BIODATA DIRI==========");
        System.out.println("nama \t\t:" + nama);
        System.out.println("nim \t\t:" + nim);
        System.out.println("alamat \t\t:" + alamat);
        System.err.println("nomor \t\t:" + nomor);
        System.out.println("hobi \t\t:" + hobi);

        System.out.println("\n\n");

        //Menggunakan print
        System.out.print("nama \t\t:" + nama + "\n");
        System.out.print("nim \t\t:" + nim + "\n");
        System.out.print("alamat \t\t:" + alamat + "\n");
        System.out.print("nomor \t\t:" + nomor + "\n");
        System.out.print("hobi \t\t:" + hobi + "\n");

        System.out.println("\n\n");

        //Menggunakan printf
        System.out.printf("nama \t\t: %s\n", nama);
        System.out.printf("nim \t\t: %s\n", nim);
        System.out.printf("alamat \t\t: %s\n", alamat);
        System.out.printf("nomor \t\t: %s\n", nomor);
        System.out.printf("hobi \t\t: %s\n", hobi);
        System.out.println("==================================");
    }
}
