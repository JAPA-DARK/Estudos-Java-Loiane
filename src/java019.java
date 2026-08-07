import java.util.Scanner;

public class java019 {
    public static void main(String[] args) {
        //aula015 exercicios
        Scanner scan = new Scanner(System.in);
        int maiorNumero;
        System.out.println("qual é o primeiro numero inteiro?");
        int primeiroNumero = scan.nextInt();
        System.out.println("qual é o segundo numero inteiro?");
        int segundoNumero = scan.nextInt();

        if (primeiroNumero > segundoNumero) {
            maiorNumero = primeiroNumero;
            System.out.println("o maior numero digitado foi " + maiorNumero + " desses dois que digitou");

        } else if (segundoNumero > primeiroNumero) {
            maiorNumero = segundoNumero;
            System.out.println("o maior numero digitado foi " + maiorNumero + " desses dois que digitou");

        } else {
            System.out.println("os numero digitado são iguais");
        }

        String resultado;
        System.out.println("digite um valor!");
        double valor = scan.nextDouble();
        if (valor >= 0) {
            resultado = "valor positivo";
        } else {
            resultado = "valor negativo";
        }
        System.out.println("valor que voce digitou é um " + resultado);

        System.out.println("digite seu sexo sendo (f) feminino e (m) masculino");
        scan.nextLine();
        String sexo = scan.next();
        if (sexo.equalsIgnoreCase("f")){
            System.out.println("feminino");
        }
        else if (sexo.equalsIgnoreCase("m")){
            System.out.println("masculino");
        }
        else {
            System.out.println("sexo invalido,digite um dentro dos parametros ");
        }
    }
}
