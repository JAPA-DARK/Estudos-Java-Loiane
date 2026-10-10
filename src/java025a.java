import java.util.Scanner;

public class java025a {
    public static void main(String[] args) {
        //12
        Scanner scan = new Scanner(System.in);
        System.out.println("calculador de peso ideal");
        System.out.println("digite sua altura!");
        double Altura = scan.nextDouble();
        System.out.println("digite seu peso");
        double peso = scan.nextDouble();
        double IMC = peso / Math.pow(Altura, 2);
        System.out.println("seu indice de massa corporal(IMC) é = " + IMC);
        String resultado;
        if (IMC < 18.5) {
            resultado = "abaixo do peso";
        } else if (IMC >= 18.5 && IMC <= 24.9) {
            resultado = "peso medio";
        } else if (IMC >= 25 && IMC <= 29.9) {
            resultado = "sobrepeso";
        } else {
            resultado = "obesidade";
        }

        System.out.println("seu indice de massa corporal indica " + resultado);
        //12 Tendo como dados de entrada a altura de uma pessoa, construa um
        //algoritmo que calcule seu peso ideal
        System.out.println("entre com sua altura");
        double Altpessoa = scan.nextDouble();
        double pesoIDEAL = (72.7 * Altpessoa) - 58;
        System.out.println("seu peso ideal é = " + pesoIDEAL);
    }
}