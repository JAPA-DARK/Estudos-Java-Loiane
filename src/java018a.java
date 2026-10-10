import java.util.Scanner;

public class java018a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //05
        System.out.println("escreva o tamanho em metros");
        double metrosPeca = scan.nextInt();
        double centimetros = metrosPeca * 100;
        double milimetros = centimetros * 100;
        System.out.println("voce digitou " + metrosPeca + " em metros e isso é = " + centimetros + " em centimetros ");
        System.out.println("e em milimetros é = " + milimetros);
    }
}

