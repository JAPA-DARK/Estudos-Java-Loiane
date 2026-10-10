import java.util.Scanner;

public class java019a {
    public static void main(String[] args) {

        //06 ultilizei a classe math. para usar a função

        Scanner scan = new Scanner(System.in);

        System.out.println("digite o raio da area(em centimetros pfv né) que deseja calcular");
        double raio = scan.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("a area desse raio é = " + area);
    }
}
