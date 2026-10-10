import java.util.Scanner;

    public class java040a {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

    // EXERCÍCIO 07

        System.out.println("digite o 1° numero");
        int Numeroum = scan.nextInt();
        System.out.println("digite o 2° numero");
        int Numerodois = scan.nextInt();
        System.out.println("digite o 3° numero");
        int Numerotres = scan.nextInt();


        int maiorNumerovisto = Numeroum;
        int menorNumero = Numeroum;

        if (Numerodois > maiorNumerovisto) {
            maiorNumerovisto = Numerodois;
        }
        if (Numerodois < menorNumero) {
            menorNumero = Numerodois;
        }
        if (Numerotres > maiorNumerovisto) {
            maiorNumerovisto = Numerotres;
        }
        if (Numerotres < menorNumero) {
            menorNumero = Numerotres;
        }
        System.out.println("o maior numero digitado foi o " + maiorNumerovisto + " e o menor numero foi " + menorNumero);
    }
}
