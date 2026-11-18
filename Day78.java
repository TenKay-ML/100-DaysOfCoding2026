import java.util.Scanner;

public class seratusharingoding {

    public static void main(String[] args) throws Exception {
        Scanner al = new Scanner(System.in);

      System.out.println("BUAT AKUN !");
      System.out.print("masukkan username : ");
      String name = al. nextLine();
      System.out.print("masukkan password : ");
      String pass = al.nextLine();
      System.out.println("Akun Berhasil dibuat!");

      String user;
      String word;

        do{
            System.out.println("--LOGIN AKUN--");
            System.out.print("Masukkan username : ");
            user = al.nextLine();
            System.out.print("Masukkan password : ");
            word = al. nextLine();
            if (user.equals(name) && pass.equals(word)) {
             System.out.println("Selamat anda berhasil login :)");  
             break; 
            } else {
                System.out.println("Username atau Password masih salah!");
            }
        } while(true);
    } 
}
