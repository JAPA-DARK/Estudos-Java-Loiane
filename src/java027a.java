import java.util.Scanner;

public class java027a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //14
        System.out.println("microcomputador verificador de peso de peixes");
        double multa;
        double excesso;
        System.out.println("informe o peso em (kg) de peixe adquiridos");
        double pesoP = scan.nextDouble();

        if (pesoP > 50) {
            excesso = pesoP - 50;
            multa = excesso * 4;
        } else {
            excesso = 0;
            multa = 0;

        }
        System.out.println("a quantidade de peso é = " + pesoP + "o que excedeu o valor foi " + excesso + "a mais que voce adicionou, voce precisa efeturar o pagamento de " + multa);

    }
}
