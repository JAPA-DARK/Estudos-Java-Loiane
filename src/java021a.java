import java.util.Scanner;

public class java021a {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //08
        System.out.println("quanto que voce ganha por hora? ");
        double salarioHora = scan.nextDouble();
        System.out.println("quantas horas voce trabalha no mês? ");
        double horasTrabalhadasDia = scan.nextDouble();
        double totalRecebidomes = salarioHora * horasTrabalhadasDia;
        System.out.println("voce recebe um total de " + totalRecebidomes + " no mês referente a " + horasTrabalhadasDia + " 2horas trabalhas no mês!!! ");

    }
}