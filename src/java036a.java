import java.util.Scanner;

public class java036a {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // EXERCÍCIO 03

            System.out.println("digite seu sexo sendo (f) feminino e (m) masculino");

            String sexo = scan.next();

            if (sexo.equalsIgnoreCase("f")) {
                System.out.println("feminino");

            } else if (sexo.equalsIgnoreCase("m")) {
                System.out.println("masculino");

            } else {
                System.out.println("sexo invalido");
            }
        }


    }
