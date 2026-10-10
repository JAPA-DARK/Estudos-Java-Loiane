import java.util.Scanner;

public class java038a {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    // EXERCÍCIO 05

        System.out.println("verificador de aprovação");

        System.out.println("diga a sua 1° nota");
        double nota1 = scan.nextDouble();

        System.out.println("diga a sua 2° nota");
        double nota2 = scan.nextDouble();

        double notaMedia = (nota1 + nota2) / 2;

        if (notaMedia == 10) {
            System.out.println("voce foi aprovado com Distinção!");

        } else if (notaMedia >= 7) {
            System.out.println("voce foi aprovado!");

        } else {
            System.out.println("voce foi reprovado!");
        }

        System.out.println("sua media ficou em " + notaMedia);
    }

}
