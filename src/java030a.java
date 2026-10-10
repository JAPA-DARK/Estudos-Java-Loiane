import java.util.Scanner;

public class java030a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //17
        System.out.println("loja de latas 2.0");
        System.out.println("informe a area² a ser pintada");
        double area = scan.nextDouble();
        double litros = area / 6; //1 litro pinta 6 metros
        double Latasnecessarias = Math.ceil(litros / 18); // litros por metro divididos pelos litros que vem na lata
        double valorporlata = 80; // valor de cada lata
        double totallata = valorporlata * Latasnecessarias;
        double galoesnecessarios = Math.ceil(litros / 3.6); //litros por metro divididos pelos litros que vem no galao arredondando para baixo
        double valorporgalao = 25;
        double totalgalao = valorporgalao * galoesnecessarios;
        double litroscomfolga = litros * 1.10;
        double latasmistura = Math.floor(litroscomfolga / 18);
        double litrosrestantes = litroscomfolga % 18;
        double galoesmistura = Math.ceil(litrosrestantes / 3.6);
        double totalmistura = (latasmistura * valorporlata) + (galoesmistura * valorporgalao);

        System.out.println("compra de apenas latas " + (int) Latasnecessarias + " totalizando " + totallata + " de reais");
        System.out.println("compra de apenas galoes " + (int) galoesnecessarios + " totalizando " + totalgalao + " de reais");
        System.out.println("compra misturando latas e galoes " + (int) latasmistura + " lata(s) e " + (int) galoesmistura + " galao(oes) totalizando " + totalmistura + " de reais");


    }
}