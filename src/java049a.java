import java.util.Scanner;

public class java049a {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

                System.out.println("qual é o valor de A ");
                int valorA = scan.nextInt();
                // delta = b² - 4.a.c
                if (valorA == 0) {
                    System.out.println("equação não é do segundo grau");
                    return;
                }
                System.out.println("qual é o valor de B ");
                int valorB = scan.nextInt();
                System.out.println("qual é o valor de C ");
                int valorC = scan.nextInt();

                int delta = valorB * valorB - 4 * valorA * valorC;
                if (delta < 0) {
                    System.out.println("essa equação não possui raizes reais, o seu delta é negativo");
                } else if (delta == 0) {
                    System.out.println("essa equação possui apenas uma raiz real, delta igual a zero");
                } else {
                    System.out.println("essa equação possui duas raizes reais, delta maior que zero");
                }
            }

        }
