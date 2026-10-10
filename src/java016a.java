import java.util.Scanner;

public class java016a {
    public static void main(String[] args) {
        //03
        Scanner scan = new Scanner(System.in);

        System.out.println("escreva dois numeros que goste");
        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();
        int somaDosnumeros = numero1 + numero2;
        System.out.println("seus numeros preferidos são '" + numero1 + " e " + numero2 + "'");
        System.out.println("a soma desses dois numeros é igual a " + somaDosnumeros);
    }
}