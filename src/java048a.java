import java.util.Scanner;

public class java048a {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

                System.out.println("me diga qual é a medida do primeiro lado do triangulo");
                int lado1 = scan.nextInt();
                System.out.println("me diga qual é a medida do segundo lado do triangulo");
                int lado2 = scan.nextInt();
                System.out.println("me diga qual é a medida do terceiro lado do triangulo");
                int lado3 = scan.nextInt();

                if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado3 + lado2 > lado1)
                    if (lado1 == lado2 && lado2 == lado3) {
                        System.out.println("é um Triângulo equilatero");
                    } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                        System.out.println("é um Triângulo Isósceles");
                    } else {
                        System.out.println("é um Triângulo Escaleno");
                    }
                else
                    System.out.println("esses valores não formam um triangulo");
            }


        }
