import java.util.Scanner;

public class java015 {
    public static void main(String[] args){

        //06
        Scanner scan = new Scanner(System.in);
        System.out.println("digite o raio da area(em centimetros pfv né) que deseja calcular");
        double raio = scan.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("a area desse raio é = "+ area);

        //07
        System.out.println("digite o tamanho da base(b)");
        double base = scan.nextDouble();
        System.out.println("digite o tamanho da altura(h)");
        double altura = scan.nextDouble();
        double areaDoquadrado = base * altura;
        double dobroDaArea = areaDoquadrado * 2;
        System.out.println("a area desse quadrado é "+ areaDoquadrado+ " e o seu dobro é igual a = "+ dobroDaArea);

        //08
        System.out.println("quanto que voce ganha por hora? ");
        double salarioHora = scan.nextDouble();
        System.out.println("quantas horas voce trabalha no mês? ");
        double horasTrabalhadasDia = scan.nextDouble();
        double totalRecebidomes = salarioHora * horasTrabalhadasDia;
        System.out.println("voce recebe um total de "+ totalRecebidomes+ " no mês referente a "+ horasTrabalhadasDia+ " 2horas trabalhas no mês!!! ");

        //09
        System.out.println("digite a temperatura em Farenheit");
        double tempFarenheit = scan.nextDouble();
        double celsius =  (5 * (tempFarenheit-32) / 9);
        System.out.println("a temperatura que voce digitou em Farenheir é igual a = "+ celsius + " em celsius!!!");

        //010
        System.out.println("digite a temperatura em celsius");
        double tempCelsius = scan.nextDouble();
        double farenheit = (celsius * 1.8) + 32;
        System.out.println("a temperatura que voce digitou em celsius é igual a = "+farenheit + " em farenheint!!!");

    }
}
