import java.util.Scanner;
    public class java022a {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            //09
            System.out.println("digite a temperatura em Farenheit");
            double tempFarenheit = scan.nextDouble();
            double celsius = (5 * (tempFarenheit - 32) / 9);
            System.out.println("a temperatura que voce digitou em Farenheir é igual a = " + celsius + " em celsius!!!");

        }
    }
