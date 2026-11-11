import java.util.Scanner;

public class seratusharingoding {

    public static void main(String[] args) throws Exception {
        Scanner al = new Scanner(System.in);

        int n = al. nextInt();

        for(int a = n; a>=1; a--){
            for(int b =1; b<=a; b++){
                System.out.print("+ ");
            }
            System.out.println();
        }
    } 
}
