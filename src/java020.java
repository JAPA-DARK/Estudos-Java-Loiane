import java.util.Scanner;

public class java020 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        exercicio12(scan);

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
        } else if (salarioBruto > 900 && salarioBruto <= 1500) {
            descontoIR = salarioBruto * 0.05;
        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            descontoIR = salarioBruto * 0.10;
        } else {
            descontoIR = salarioBruto * 0.20;
        }
        double sindicato = salarioBruto * 0.03;
        double fgts = salarioBruto * 0.11;
        double salarioLiquido = salarioBruto - descontoIR - sindicato;


        System.out.println("após a verificação identificamos essas informações");
        System.out.println("seu salario bruto é de " + salarioBruto);
        System.out.println("o valor descontado para o sindicato é "+sindicato);
        System.out.println("descontos de IR do salario totalizam " + descontoIR);
        System.out.println("fgts que é depositado na conta é "+ fgts);
        System.out.println("salario liquido recebido "+ salarioLiquido);

    }
}

