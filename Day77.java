import java.util.Scanner;
public class belajar {
    public static void main(String[] args) {
      Scanner al = new Scanner(System.in);

     System.out.print("Masukkan sebuah kata : "); 
     String kata = al.nextLine();

     System.out.println("kata yang dimasukkan memiliki : "+kata.length() + " huruf");
     System.out.println("kapitanya : "+kata.toUpperCase());
     System.out.println("apakah katanya sama dengan (biru) ? "+kata.equals("biru"));
     System.out.println("apakah terdapat huruf (A) ? "+kata.contains("A"));
     System.out.println("apakah inputan yang dimasukkan itu kosong ? "+kata.isEmpty());
     System.out.println("ganti huruf tersebut dengan huruf : "+kata.replace("A", "U"));
    }}
