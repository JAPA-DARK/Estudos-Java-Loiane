import java.util.Scanner;

public class java018 {
    public static void main(String[] args) {
        //SwitchCase
        Scanner scan = new Scanner(System.in);
        System.out.println("digite o numero do dia da semana sendo guiado por 0 (domingo) 6 (sabado)");
        int diaSemana = scan.nextInt();
        /*if (diaSemana == 0) {
            System.out.println("domingo");
        } else if (diaSemana == 1) {
            System.out.println("segunda");
        } else if (diaSemana == 2) {
            System.out.println("terça");
        } else if (diaSemana == 3) {
            System.out.println("quarta");
        } else if (diaSemana == 4) {
            System.out.println("quinta");
        } else if (diaSemana == 5) {
            System.out.println("sexta");
        } else if (diaSemana == 6) {
            System.out.println("sabado");
        }
        else {
            System.out.println("não é um dia da semana valido (pfv digite algo entre 0-6)");
        }

         */
       /* switch (diaSemana){
            case 0: System.out.println("domingo"); break;
            case 1: System.out.println("segunda-feira");break;
            case 2: System.out.println("terça-feira"); break;
            case 3: System.out.println("quarta-feira"); break;
            case 4: System.out.println("quinta-feira"); break;
            case 5: System.out.println("sexta-feira"); break;
            case 6: System.out.println("sabado"); break;
            default: System.out.println("não é um dia da semana valido (digite algo dentre os parametros 0-6)");
        }

        */
        switch (diaSemana) {
            case 6:
            case 0: System.out.println("fim de semana");break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: System.out.println("dia util"); break;

            default:System.out.println("não é um dia da semana valido (digite algo dentre os parametros 0-6)");
        }
    }
}