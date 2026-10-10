import java.util.Scanner;

public class java024a {

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
    }
}
