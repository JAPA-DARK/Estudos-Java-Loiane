import java.util.Scanner;

public class java037a {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            // EXERCÍCIO 04

                System.out.println("verificador de vogais");

                String letra = scan.next();

                if (letra.equalsIgnoreCase("a") ||
                        letra.equalsIgnoreCase("e") ||
                        letra.equalsIgnoreCase("i") ||
                        letra.equalsIgnoreCase("o") ||
                        letra.equalsIgnoreCase("u")) {

                    System.out.println("é uma vogal");

                } else {
                    System.out.println("é uma consoante");
                }
            }


        }
