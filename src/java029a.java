import java.util.Scanner;

public class java029a {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
    //16
        System.out.println("loja de tintas");
        System.out.println("informe o tamamanho em m² a ser tingido");
    double areaQuadrada = scan.nextDouble();
    double litrosusadosporLata = areaQuadrada / 3;
    double latasnecessarias = Math.ceil(litrosusadosporLata / 18);
    double precoLata = 80;
    double totalValor = latasnecessarias * precoLata;

        System.out.println("voce vai precisar de " + (int) latasnecessarias + " lata para tingir esses " + (int) areaQuadrada + " metros quadrado e o total dessa compra é de  " + totalValor + " reais");


    }
}
