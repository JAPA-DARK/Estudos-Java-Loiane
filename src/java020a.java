import java.util.Scanner;

public class java020a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //07
        System.out.println("digite o tamanho da base(b)");
        double base = scan.nextDouble();
        System.out.println("digite o tamanho da altura(h)");
        double altura = scan.nextDouble();
        double areaDoquadrado = base * altura;
        double dobroDaArea = areaDoquadrado * 2;
        System.out.println("a area desse quadrado é " + areaDoquadrado + " e o seu dobro é igual a = " + dobroDaArea);
    }
}
