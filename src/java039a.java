import java.util.Scanner;

public class java039a {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // EXERCÍCIO 06
            System.out.println("digite o 1° numero");
            int numeroPrimeiro = scan.nextInt();
            System.out.println("digite o 2° numero");
            int numeroSegundo = scan.nextInt();
            System.out.println("digite o 3° numero");
            int numeroTerceiro = scan.nextInt();

            int bigNumber = numeroPrimeiro;

            if (numeroSegundo > bigNumber) {
                bigNumber = numeroSegundo;
            }
            if (numeroTerceiro > bigNumber) {
                bigNumber = numeroTerceiro;
            }
            System.out.println("o maior numero que voce digitou é este > " + bigNumber + " <");
        }


    }
