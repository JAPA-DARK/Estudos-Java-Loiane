import java.util.Scanner;

public class java020 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        exercicio12(scan);
        exercicio13(scan);
        exercicio14(scan);
        exercicio15(scan);

        scan.close();
    }

    public static void exercicio12(Scanner scan) {
        System.out.println("Folha de pagamento");
        System.out.println("quanto é a hora de trabalho?");
        int horaDeTrabalho = scan.nextInt();
        System.out.println("quantidade de horas trabalhadas?");
        int quantidadeHoraTrabalhada = scan.nextInt();

        double salarioBruto = horaDeTrabalho * quantidadeHoraTrabalhada;
        double descontoIR = 0;

        if (salarioBruto <= 900) {
            descontoIR = 0;
        } else if (salarioBruto > 900 && salarioBruto < 1500) {
            descontoIR = salarioBruto * 0.05;
        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            descontoIR = salarioBruto * 0.10;
        } else {
            descontoIR = salarioBruto * 0.20;
        }
        double sindicato = salarioBruto * 0.03;
        double fgts = salarioBruto * 0.11;
        double salarioLiquido = salarioBruto - descontoIR - sindicato;
        double totalDescontos = descontoIR + sindicato;


        System.out.println("após a verificação identificamos essas informações");
        System.out.println("seu salario bruto é de " + salarioBruto);
        System.out.println("o valor descontado para o sindicato é " + sindicato);
        System.out.println("descontos de IR do salario totalizam " + descontoIR);
        System.out.println("o total de descontos é " + totalDescontos);
        System.out.println("fgts que é depositado na conta é " + fgts);
        System.out.println("salario liquido recebido " + salarioLiquido);
    }

    public static void exercicio13(Scanner scan) {
        System.out.println("Digite um numero referente ao dia da semana");
        int diaSemana = scan.nextInt();

        String dias = "dia";


        if (diaSemana == 1) {
            dias = "domingo";
        } else if (diaSemana == 2) {
            dias = "segunda feira";
        } else if (diaSemana == 3) {
            dias = "terça feira";
        } else if (diaSemana == 4) {
            dias = "quarta feira";
        } else if (diaSemana == 5) {
            dias = "quinta feira";
        } else if (diaSemana == 6) {
            dias = "sexta feira";
        } else if (diaSemana == 7) {
            dias = "sabado";
        } else {
            System.out.println("esse valor não é valido preencha com 1 até 7");

        }

        System.out.println("hoje é " + dias + " tenha um bom dia ");
    }

    public static void exercicio14(Scanner scan) {

        System.out.println("digite sua primeira nota");
        int nota1 = scan.nextInt();
        System.out.println("digite sua segunda nota");
        int nota2 = scan.nextInt();

        String conceito = "sem nota";
        String situacao = "analise";
        double media = (nota1 + nota2) / 2.0;
        /*
        media de aproveitamento         conceito
        entre 9.0 e 10.0                   A
        entre 7.5 e 9.0                    B
        entre 6.0 e 7.5                    C
        entre 4.0 e 6.0                    D
        entre 4.0 e 0                      E
         */
        if (media < 4 && media >= 0) {
            conceito = "E";
            situacao = "REPROVADO";
            System.out.println("sua nota é " + nota1 + " na primeira avaliação " + nota2 + " na segunda avaliação");
            System.out.println("sua media é " + media);
            System.out.println("seu conceito é " + conceito + " " + situacao);
        } else if (media >= 4 && media < 6) {
            conceito = "D";
            situacao = "REPROVADO";
            System.out.println("sua nota é " + nota1 + " na primeira avaliação " + nota2 + " na segunda avaliação");
            System.out.println("sua media é " + media);
            System.out.println("seu conceito é " + conceito + " " + situacao);
        } else if (media >= 6 && media < 7.5) {
            conceito = "C";
            situacao = "APROVADO";
            System.out.println("sua nota é " + nota1 + " na primeira avaliação " + nota2 + " na segunda avaliação");
            System.out.println("sua media é " + media);
            System.out.println("seu conceito é " + conceito + " " + situacao);
        } else if (media >= 7.5 && media < 9) {
            conceito = "B";
            situacao = "APROVADO";
            System.out.println("sua nota é " + nota1 + " na primeira avaliação " + nota2 + " na segunda avaliação");
            System.out.println("sua media é " + media);
            System.out.println("seu conceito é " + conceito + " " + situacao);
        } else if (media >= 9 && media <= 10) {
            conceito = "A";
            situacao = "APROVADO";
            System.out.println("sua nota é " + nota1 + " na primeira avaliação " + nota2 + " na segunda avaliação");
            System.out.println("sua media é " + media);
            System.out.println("seu conceito é " + conceito + " " + situacao);
        } else {
            System.out.println("informação invalida");
            return;
        }
    }

    public static void exercicio15(Scanner scan) {
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








