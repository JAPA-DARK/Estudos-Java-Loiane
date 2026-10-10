import java.util.Scanner;

public class java034a {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // EXERCÍCIO 01

            int maiorNumero;

            System.out.println("qual é o primeiro numero inteiro?");
            int primeiroNumero = scan.nextInt();

            System.out.println("qual é o segundo numero inteiro?");
            int segundoNumero = scan.nextInt();

            if (primeiroNumero > segundoNumero) {
                maiorNumero = primeiroNumero;
                System.out.println("o maior numero digitado foi " + maiorNumero);

            } else if (segundoNumero > primeiroNumero) {
                maiorNumero = segundoNumero;
                System.out.println("o maior numero digitado foi " + maiorNumero);

            } else {
                System.out.println("os numeros digitados são iguais");
            }
        }

    }
