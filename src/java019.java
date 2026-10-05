import java.util.Scanner;

public class java019 {
    public static void main(String[] args) {
        //aula015 exercicios
        Scanner scan = new Scanner(System.in);
        /*
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
        if (sexo.equalsIgnoreCase("f")) {
            System.out.println("feminino");
        } else if (sexo.equalsIgnoreCase("m")) {
            System.out.println("masculino");
        } else {
            System.out.println("sexo invalido,digite um dentro dos parametros ");

        }

        System.out.println("verificador de vogais pra saber se é vogal ou consoante");
        String letra = scan.next();


        if (letra.equalsIgnoreCase("a") ||
                letra.equalsIgnoreCase("e")
                || letra.equalsIgnoreCase("i")
                || letra.equalsIgnoreCase("o")
                || letra.equalsIgnoreCase("u")) {
            System.out.println("é uma vogal");

        } else if (letra.equalsIgnoreCase("b") ||
                letra.equalsIgnoreCase("c") ||
                letra.equalsIgnoreCase("d") ||
                letra.equalsIgnoreCase("f") ||
                letra.equalsIgnoreCase("g") ||
                letra.equalsIgnoreCase("h") ||
                letra.equalsIgnoreCase("j") ||
                letra.equalsIgnoreCase("k") ||
                letra.equalsIgnoreCase("l") ||
                letra.equalsIgnoreCase("m") ||
                letra.equalsIgnoreCase("n") ||
                letra.equalsIgnoreCase("p") ||
                letra.equalsIgnoreCase("q") ||
                letra.equalsIgnoreCase("r") ||
                letra.equalsIgnoreCase("s") ||
                letra.equalsIgnoreCase("t") ||
                letra.equalsIgnoreCase("v") ||
                letra.equalsIgnoreCase("w") ||
                letra.equalsIgnoreCase("x") ||
                letra.equalsIgnoreCase("y") ||
                letra.equalsIgnoreCase("z")) {
            System.out.println(" é uma consoante");

        } else {
            System.out.println("informação invalida 'digite apenas uma letra e dentro dos parametros'");
        }
        System.out.println("verificador de aprovação");
        System.out.println("diga a sua 1° nota ");
        double nota1 = scan.nextDouble();
        System.out.println("diga a sua 2° nota ");
        double nota2 = scan.nextDouble();

        double notaMedia = (nota1 + nota2) / 2;
        if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10) {
            System.out.println("nota invalida, digite uma nota entre 0 e 10");
        }
        if (notaMedia == 10) {
            System.out.println("voce foi aprovado com Distinção, excelente!!! ");
            System.out.println("sua media ficou em   " + notaMedia);
        } else if (notaMedia >= 7) {
            System.out.println("voce foi aprovado parabéns!");
            System.out.println("sua media ficou em  " + notaMedia);
        } else {
            System.out.println("voce foi reprovado, tente novamente");
            System.out.println("sua media ficou em   " + notaMedia);
        }
        */

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
        else {
            System.out.println("esse numero é invalido");
        }
        System.out.println("o maior numero que voce digitou é este > " + bigNumber +" <");

        System.out.println("digite o 1° numero");
        int Numeroum = scan.nextInt();
        System.out.println("digite o 2° numero");
        int Numerodois = scan.nextInt();
        System.out.println("digite o 3° numero");
        int Numerotres = scan.nextInt();

        int maiorNumero = Numeroum;
        int menorNumero = Numeroum;

        if (Numerodois > maiorNumero) {
            maiorNumero = Numerodois;
        }
        if (Numerodois < maiorNumero) {
            menorNumero = Numerodois;
        }
        if (Numerotres > maiorNumero) {
            maiorNumero = Numerotres;
        }
        if (Numerotres < maiorNumero) {
            menorNumero = Numerotres;
        }
        System.out.println("o maior numero digitado foi o "+ maiorNumero + " e o menor numero foi " + menorNumero );
    }
}
