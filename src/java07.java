import java.util.Scanner;

public class java07 {
    public static void main (String[] args) {
    //leitura dados de teclado
        Scanner scan = new Scanner(System.in);
        System.out.println("digite seu nome completo:");
        String nomeCompleto = scan.nextLine();
        System.out.println("seu nome completo é: " + nomeCompleto);

        System.out.println("digite seu primeiro nome: ");
        String primeiroNome = scan.next();
        System.out.println("seu primeiro nome é: " + primeiroNome);

        System.out.println("digite sua idade: ");
        int suaIdade = scan.nextInt();
        System.out.println("sua idade é:" + suaIdade);
    }
}
