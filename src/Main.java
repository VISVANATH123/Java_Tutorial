import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int  a = scan.nextInt();
        if (a > 20) {
            System.out.println("greater.");
        } else {
            System.out.println("Lesser.");
        }
        Main siva = new Main();
        System.out.println(siva.visva());
    }

    public int visva() {
        System.out.println("visvanath r");
        return 0;

    }
}
