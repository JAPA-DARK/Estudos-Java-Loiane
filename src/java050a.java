import java.util.Scanner;

public class java050a {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

                System.out.println("me diga o ano?");
                int ano = scan.nextInt();
                scan.nextLine();
                if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
                    System.out.println("o ano " + ano + " é bissexto");
                } else {
                    System.out.println("o ano " + ano + " não é bissexto");
                }
            }



        }
