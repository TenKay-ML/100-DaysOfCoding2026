import java.util.Scanner;

public class seratusharingoding {

    public static void main(String[] args) throws Exception {
        Scanner al = new Scanner(System.in);

       int a;
       int total = 0;

       do{
        System.out.print("masukkan angka : ");
        a = al.nextInt();
        if (a<0) {break;}
        total += a;
        
       } while(true);
       System.out.println(total);
    } 
}

