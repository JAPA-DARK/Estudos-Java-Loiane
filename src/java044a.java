import java.util.Scanner;



public class java044a {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
    // EXERCÍCIO 011
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

