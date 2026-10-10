import java.util.Scanner;

public class java046a {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
                System.out.println("Digite um numero referente ao dia da semana");
                int diaSemana = scan.nextInt();

                String dias = "dia";


                if (diaSemana == 1) {
                    dias = "domingo";
                } else if (diaSemana == 2) {
                    dias = "segunda feira";
                } else if (diaSemana == 3) {
                    dias = "terça feira";
                } else if (diaSemana == 4) {
                    dias = "quarta feira";
                } else if (diaSemana == 5) {
                    dias = "quinta feira";
                } else if (diaSemana == 6) {
                    dias = "sexta feira";
                } else if (diaSemana == 7) {
                    dias = "sabado";
                } else {
                    System.out.println("esse valor não é valido preencha com 1 até 7");

                }

                System.out.println("hoje é " + dias + " tenha um bom dia ");
            }

        }
