import java.util.Scanner;

public class java042a {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            // EXERCÍCIO 09
                System.out.println("qual é o primeiro numero?");
                int numero1 = scan.nextInt();
                System.out.println("qual é o segundo numero?");
                int numero2 = scan.nextInt();
                System.out.println("qual é o terceiro numero?");
                int numero3 = scan.nextInt();

                if (numero1 >= numero2 && numero2 >= numero3) {
                    System.out.println(numero1 + " " + numero2 + " " + numero3);
                } else if (numero1 >= numero3 && numero3 >= numero2) {
                    System.out.println(numero1 + " " + numero3 + " " + numero2);
                } else if (numero2 >= numero1 && numero1 >= numero3) {
                    System.out.println(numero2 + " " + numero1 + " " + numero3);
                } else if (numero2 >= numero3 && numero3 >= numero1) {
                    System.out.println(numero2 + " " + numero3 + " " + numero1);
                } else if (numero3 >= numero1 && numero1 >= numero2) {
                    System.out.println(numero3 + " " + numero1 + " " + numero2);
                } else {
                    System.out.println(numero3 + " " + numero2 + " " + numero1);
                }
                System.out.println("os numeros estão em ordem descrescente");
            }

        }
