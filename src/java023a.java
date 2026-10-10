import java.util.Scanner;

    public class java023a {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            //010
            System.out.println("digite a temperatura em celsius");
            double tempCelsius = scan.nextDouble();
            double farenheit = (tempCelsius * 1.8) + 32;
            System.out.println("a temperatura que voce digitou em celsius é igual a = "+farenheit + " em farenheint!!!");

        }
    }
