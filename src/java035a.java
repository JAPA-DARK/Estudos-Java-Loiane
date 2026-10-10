import java.util.Scanner;

public class java035a {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // EXERCÍCIO 02

            String resultado;

            System.out.println("digite um valor!");
            double valor = scan.nextDouble();

            if (valor >= 0) {
                resultado = "valor positivo";
            } else {
                resultado = "valor negativo";
            }

            System.out.println("valor que voce digitou é um " + resultado);
        }


    }
