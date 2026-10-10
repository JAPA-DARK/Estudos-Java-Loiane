import java.util.Scanner;

public class java026a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        //13
        System.out.println("entre com sua altura");
        double alturaDapessoa = scan.nextDouble();
        scan.nextLine();
        System.out.println("entre com sexo (masculino) ou (feminino)");
        String sexo = scan.nextLine();
        double pesoIdeal;
        if (sexo.equalsIgnoreCase("masculino")) {
            pesoIdeal = (72.7 * alturaDapessoa) - 58;
        } else if (sexo.equalsIgnoreCase("feminino")) {
            pesoIdeal = (62.1 * alturaDapessoa) - 44.7;
        } else {
            System.out.println("informação invalida");
            return;
        }
        System.out.println("seu peso ideal é " + pesoIdeal);

    }
}
