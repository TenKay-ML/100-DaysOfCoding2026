import java.util.Scanner;

public class belajarjava {
    public static void main(String[] args) {
      Scanner al = new Scanner(System.in);

      int sisi = al.nextInt();
      
        for (int a = 1; a <= sisi; a++) {
            for (int b = 1; b <= sisi; b++) {
                System.out.print("×");
            }
            System.out.println();
        }
    }
}
