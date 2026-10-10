import java.util.Scanner;

public class java028a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //15
        System.out.println("quanto que voce ganha por hora? ");
        double salarioHora = scan.nextDouble();
        System.out.println("quantas horas voce trabalha no mês? ");
        double horasTrabalhadasDia = scan.nextDouble();
        double totalRecebidomes = salarioHora * horasTrabalhadasDia;
        System.out.println("voce recebe um total de " + totalRecebidomes + " no mês referente a " + horasTrabalhadasDia + " horas trabalhas no mês!!! ");
        double INSS = totalRecebidomes / 100 * 8;
        double Sindicato = totalRecebidomes / 100 * 5;
        double impostoRenda = totalRecebidomes / 100 * 11;
        double SalarioLiquido = totalRecebidomes / 100 * 23;// salario bruto - descontos = salario liquido.
        double Descontos = INSS + Sindicato + impostoRenda;
        System.out.println("voce paga para o INSS um total de " + INSS + " do seu salario bruto");
        System.out.println("voce paga para o SINDICATO um total de " + Sindicato + " do seu salario bruto");
        System.out.println("voce paga para o IR um total de " + impostoRenda + " do seu salario bruto");
        System.out.println("voce recebe de salario liquido um total de = " + SalarioLiquido + " mes");
        System.out.println("voce paga um total de " + Descontos + " todos os meses de descontos ");

        //16
        System.out.println("loja de tintas");
        System.out.println("informe o tamamanho em m² a ser tingido");
        double areaQuadrada = scan.nextDouble();
        double litrosusadosporLata = areaQuadrada / 3;
        double latasnecessarias = Math.ceil(litrosusadosporLata / 18);
        double precoLata = 80;
        double totalValor = latasnecessarias * precoLata;

        System.out.println("voce vai precisar de " + (int) latasnecessarias + " lata para tingir esses " + (int) areaQuadrada + " metros quadrado e o total dessa compra é de  " + totalValor + " reais");


    }
}
