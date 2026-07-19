import java.util.Scanner;

public class java09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite seu nome: ");
        String seuNome = scan.nextLine();
        System.out.println("digite sua idade: ");
        int suaIdade = scan.nextInt();
        String l = scan.nextLine();
        System.out.println("digite sua profissão: ");
        String suaProfissao = scan.nextLine();
        System.out.println("digite se possui filho: ");
        boolean tFilhos = scan.nextBoolean();
        boolean sim = true;
        boolean nao = false;
        String n = scan.nextLine();
        System.out.println("digite se voce é homem ou mulher: ");
        String seuSexo = scan.nextLine();

        System.out.println("temos aqui um " + seuSexo + " de " + suaIdade +" anos de idade que é um profissional " + suaProfissao+ " seu nome é "+ seuNome + " e é " + tFilhos + " que voce tem filhos!!! ");

    }
}
