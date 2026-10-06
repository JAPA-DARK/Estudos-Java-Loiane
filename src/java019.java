import java.util.Scanner;

public class java019 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        exercicio01(scan);
        exercicio02(scan);
        exercicio03(scan);
        exercicio04(scan);
        exercicio05(scan);
        exercicio06(scan);
        exercicio07(scan);
        exercicio08(scan);
        exercicio09(scan);
        exercicio10(scan);
        exercicio11(scan);

        scan.close();
    }


    // EXERCÍCIO 01
    public static void exercicio01(Scanner scan) {

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


    // EXERCÍCIO 02
    public static void exercicio02(Scanner scan) {

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


    // EXERCÍCIO 03
    public static void exercicio03(Scanner scan) {

        System.out.println("digite seu sexo sendo (f) feminino e (m) masculino");

        String sexo = scan.next();

        if (sexo.equalsIgnoreCase("f")) {
            System.out.println("feminino");

        } else if (sexo.equalsIgnoreCase("m")) {
            System.out.println("masculino");

        } else {
            System.out.println("sexo invalido");
        }
    }


    // EXERCÍCIO 04
    public static void exercicio04(Scanner scan) {

        System.out.println("verificador de vogais");

        String letra = scan.next();

        if (letra.equalsIgnoreCase("a") ||
                letra.equalsIgnoreCase("e") ||
                letra.equalsIgnoreCase("i") ||
                letra.equalsIgnoreCase("o") ||
                letra.equalsIgnoreCase("u")) {

            System.out.println("é uma vogal");

        } else {
            System.out.println("é uma consoante");
        }
    }


    // EXERCÍCIO 05
    public static void exercicio05(Scanner scan) {

        System.out.println("verificador de aprovação");

        System.out.println("diga a sua 1° nota");
        double nota1 = scan.nextDouble();

        System.out.println("diga a sua 2° nota");
        double nota2 = scan.nextDouble();

        double notaMedia = (nota1 + nota2) / 2;

        if (notaMedia == 10) {
            System.out.println("voce foi aprovado com Distinção!");

        } else if (notaMedia >= 7) {
            System.out.println("voce foi aprovado!");

        } else {
            System.out.println("voce foi reprovado!");
        }

        System.out.println("sua media ficou em " + notaMedia);
    }

// EXERCÍCIO 06
public static void exercicio06(Scanner scan) {
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
        System.out.println("o maior numero que voce digitou é este > " + bigNumber + " <");
    }


    // EXERCÍCIO 07
    public static void exercicio07(Scanner scan){
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
// EXERCÍCIO 08
public static void exercicio08(Scanner scan) {
    System.out.println("digite os preços dos produtos aqui");
    System.out.println("quanto custa a bandagem?");
    int produto1 = scan.nextInt();
    String primeiroProduto = "bandagem";
    System.out.println("quanto custa a camisa?");
    int produto2 = scan.nextInt();
    String segundoProduto = "camisa";
    System.out.println("quanto custa o caderno?");
    int produto3 = scan.nextInt();
    String terceiroProduto = "caderno";

    String Produto;
    int produtoMaisbarato = produto1;
    Produto = "bandagem";

    if (produto2 < produtoMaisbarato) {
        produtoMaisbarato = produto2;
        Produto = "camisa";
    }
    if (produto3 < produtoMaisbarato) {
        produtoMaisbarato = produto3;
        Produto = "caderno";
    }

    System.out.println("indentificamos que o produto mais barato é " + Produto + " que custa " + produtoMaisbarato);
}
    // EXERCÍCIO 09
    public static void exercicio09(Scanner scan) {
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

// EXERCÍCIO 010
public static void exercicio10(Scanner scan) {
scan.nextLine();
    System.out.println("em que turno voce estuda?");
    System.out.println("M(matutino) V(verpertino) N(noturno");
    String turnoEstudante = scan.nextLine();

    if (turnoEstudante.equalsIgnoreCase("M")) {
        System.out.println("olá estudante, tenha um otimo dia");
    } else if (turnoEstudante.equalsIgnoreCase("V")) {
        System.out.println("olá estudante, tenha uma boa tarde");
    } else if (turnoEstudante.equalsIgnoreCase("N")) {
        System.out.println("olá estudante, tenha uma boa noite");
    } else {
        System.out.println("essa informação é invalida, por favor adicione APENAS AS LETRAS M | V | N  no questionario!!!");
    }
}
    // EXERCÍCIO 011
    public static void exercicio11(Scanner scan) {
        System.out.println("digite seu salario atual?!");
        double salarioAtual = scan.nextDouble();

        int porcentagem20 = 20;
        int porcentagem15 = 15;
        int porcentagem10 = 10;
        int porcentagem05 = 5;
        int aplicado;
        double novoSalario;
        double aumentoSalarial;

    if (salarioAtual <= 280){
        novoSalario = salarioAtual * 1.20;
        aplicado = porcentagem20;
        aumentoSalarial = novoSalario - salarioAtual;

    }
    else if (salarioAtual > 280 && salarioAtual <= 700 ){
        novoSalario = salarioAtual * 1.15;
        aplicado = porcentagem15;
        aumentoSalarial = novoSalario - salarioAtual;

    }
    else if (salarioAtual > 700 && salarioAtual <= 1500){
        novoSalario = salarioAtual * 1.10;
        aplicado = porcentagem10;
        aumentoSalarial = novoSalario - salarioAtual;

    }
    else {
        novoSalario = salarioAtual * 1.05;
        aplicado = porcentagem05;
        aumentoSalarial = novoSalario - salarioAtual;

    }

    System.out.println("seu salario antes do reajuste era = " + salarioAtual);
    System.out.println("a porcentagem aplicada ao seu salario foi de "+ aplicado+ "%");
    System.out.printf("valor do aumento = R$ %.2f%n",aumentoSalarial );
    System.out.printf("seu novo salario é = R$ %.2f ", novoSalario ,"R$");

    }
}
