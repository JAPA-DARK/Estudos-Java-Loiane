import java.util.Scanner;

public class java016 {
    public static void main(String[] args) {
        //11
        Scanner scan = new Scanner(System.in);
        System.out.println("entre com um numero inteiro!");
        double numberInt = scan.nextDouble();
        System.out.println("entre com outro numero inteiro!");
        double numberInt2 = scan.nextDouble();
        System.out.println("entre com um numero real!");
        double numberReal = scan.nextDouble();

        double Produto = (numberInt * 2) * (numberInt2 / 2);
        System.out.println("o produto do dobro do primeiro e metade do segundo é = " + Produto);

        double Soma = (numberInt * 3) + (numberReal);
        System.out.println("a soma do triplo do primeiro com o terceiro numero é  = " +Soma);

        double Terceiro = Math.pow(3, numberReal);
        System.out.println("o terceiro elevado ao cubo é = " + Terceiro);

        //12
        System.out.println("calculador de peso ideal");
        System.out.println("digite sua altura!");
        double Altura = scan.nextDouble();
        System.out.println("digite seu peso");
        double peso = scan.nextDouble();
        double IMC = peso / Math.pow(Altura, 2)  ;
        System.out.println("seu indice de massa corporal(IMC) é = "+ IMC);
        String resultado;
        if (IMC < 18.5) {
            resultado = "abaixo do peso";
        }
         else if (IMC >= 18.5 && IMC <= 24.9) {
            resultado = "peso medio";
        }
         else if (IMC >= 25 && IMC <= 29.9){
             resultado = "sobrepeso";
        }
         else  {
             resultado = "obesidade";
        }

        System.out.println("seu indice de massa corporal indica " + resultado);

         //13
        System.out.println("quanto que voce ganha por hora? ");
        double salarioHora = scan.nextDouble();
        System.out.println("quantas horas voce trabalha no mês? ");
        double horasTrabalhadasDia = scan.nextDouble();
        double totalRecebidomes = salarioHora * horasTrabalhadasDia;
        System.out.println("voce recebe um total de "+ totalRecebidomes+ " no mês referente a "+ horasTrabalhadasDia + " horas trabalhas no mês!!! ");
        double INSS = totalRecebidomes / 100 * 8;
        double Sindicato = totalRecebidomes / 100 * 5;
        double impostoRenda = totalRecebidomes / 100 * 11;
        double SalarioLiquido = totalRecebidomes / 100 * 23;// salario bruto - descontos = salario liquido.
        double Descontos = INSS + Sindicato + impostoRenda;
        System.out.println("voce paga para o INSS um total de " + INSS + " do seu salario bruto");
        System.out.println("voce paga para o SINDICATO um total de " + Sindicato  + " do seu salario bruto");
        System.out.println("voce paga para o IR um total de " + impostoRenda  + " do seu salario bruto");
        System.out.println("voce recebe de salario liquido um total de = " + SalarioLiquido + " mes");
        System.out.println("voce paga um total de " + Descontos + " todos os meses de descontos ");

        //14 // no arquivo esta 15
        System.out.println("entre com o tamanho do arquivo");
        double tamArquivo = scan.nextDouble();
        System.out.println("entre com a velociade da internet");
        double velInternet = scan.nextDouble();
        double tempopDownload = tamArquivo / velInternet;
        System.out.println("o tempo para fazer o download é de "+ tempopDownload);


    }
}
