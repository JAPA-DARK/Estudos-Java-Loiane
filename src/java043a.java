import java.util.Scanner;

public class java043a {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // EXERCÍCIO 010
        System.out.println("em que turno voce estuda?");
        System.out.println("M(matutino) V(verpertino) N(noturno");
        String turnoEstudante = scan.nextLine();

        if (turnoEstudante.equalsIgnoreCase("M")) {
            System.out.println("olá estudante, tenha um otimo dia");
        } else if (turnoEstudante.equalsIgnoreCase("V")) {
            System.out.println("olá estudante, tenha uma boa tarde");
        } else if (turnoEstudante.equalsIgnoreCase("N")) {
            System.out.println("olá estudante, tenha uma boa noite");
        } else {
            System.out.println("essa informação é invalida, por favor adicione APENAS AS LETRAS M | V | N  no questionario!!!");
            return;
        }
    }
}
