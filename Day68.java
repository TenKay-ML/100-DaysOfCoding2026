import java.util.Scanner;

public class belajarjava {
    public static void main(String[] args) {
      Scanner al = new Scanner(System.in);

  System.out.println("===== DAFTAR AKUN=====");
  System.out.print("Buat Username : ");
  String a = al.nextLine();
  System.out.print("Buat Password : ");
  String b = al.nextLine();
  System.out.print("Akun berhasil dibuat!");

  String user;
  String name;
  int percobaan = 0;  

  do{
   System.out.println("=====LOGIN=====");
   System.out.print("Masukkan Username : ");
   user = al.nextLine();
   System.out.print("Masukkan Password : ");
   name = al.nextLine();
   percobaan++;
  if(!a.equals (user) || !b.equals(name)){
   System.out.println("Username atau Password salah, coba lagi.");
  }
  } while (!a.equals (user) || !b.equals(name));
    System.out.println("Login berhasil! Selamat datang, " + a);
    System.out.println("Jumlah percobaan login : "+percobaan);
    }
    }
