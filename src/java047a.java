import java.util.Scanner;

public class java047a {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);


                System.out.println("digite sua primeira nota");
                int nota1 = scan.nextInt();
                System.out.println("digite sua segunda nota");
                int nota2 = scan.nextInt();

                String conceito = "sem nota";
                String situacao = "analise";
                double media = (nota1 + nota2) / 2.0;
        /*
        media de aproveitamento         conceito
        entre 9.0 e 10.0                   A
        entre 7.5 e 9.0                    B
        entre 6.0 e 7.5                    C
        entre 4.0 e 6.0                    D
        entre 4.0 e 0                      E
         */
                if (media < 4 && media >= 0) {
                    conceito = "E";
                    situacao = "REPROVADO";
                    System.out.println("sua nota é " + nota1 + " na primeira avaliação " + nota2 + " na segunda avaliação");
                    System.out.println("sua media é " + media);
                    System.out.println("seu conceito é " + conceito + " " + situacao);
                } else if (media >= 4 && media < 6) {
                    conceito = "D";
                    situacao = "REPROVADO";
                    System.out.println("sua nota é " + nota1 + " na primeira avaliação " + nota2 + " na segunda avaliação");
                    System.out.println("sua media é " + media);
                    System.out.println("seu conceito é " + conceito + " " + situacao);
                } else if (media >= 6 && media < 7.5) {
                    conceito = "C";
                    situacao = "APROVADO";
                    System.out.println("sua nota é " + nota1 + " na primeira avaliação " + nota2 + " na segunda avaliação");
                    System.out.println("sua media é " + media);
                    System.out.println("seu conceito é " + conceito + " " + situacao);
                } else if (media >= 7.5 && media < 9) {
                    conceito = "B";
                    situacao = "APROVADO";
                    System.out.println("sua nota é " + nota1 + " na primeira avaliação " + nota2 + " na segunda avaliação");
                    System.out.println("sua media é " + media);
                    System.out.println("seu conceito é " + conceito + " " + situacao);
                } else if (media >= 9 && media <= 10) {
                    conceito = "A";
                    situacao = "APROVADO";
                    System.out.println("sua nota é " + nota1 + " na primeira avaliação " + nota2 + " na segunda avaliação");
                    System.out.println("sua media é " + media);
                    System.out.println("seu conceito é " + conceito + " " + situacao);
                } else {
                    System.out.println("informação invalida");
                    return;
                }
            }

        }

