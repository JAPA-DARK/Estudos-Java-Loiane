import java.util.Scanner;

public class java032a {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
//controle de decisão ( if e else)
        //verificador de idade
        System.out.println("digite sua idade ");
        int idade = scan.nextInt();
        if (idade >= 18) {
            System.out.println("usuario maior de idade");
        } else {
            System.out.println("usuario menor de idade");
        }
        //indicador de compra
    /*
    barato - <= 20
    pedir desconto - valor < 25 < 50
    pesquisar mais - valor > 50 <= 75
    muito caro - <= 100
     */
        System.out.println("digite o valor da compra");
        int valor = scan.nextInt();
        if (valor <= 20) {
            System.out.println("o valor é " + valor + " barato" + "pode comprar");
        } else if (valor <= 50) {
            System.out.println("se conseguir um desconto nesse valor " + valor + " vai ficar muito bom para comprar");
        } else if (valor <= 75) {
            System.out.println("o valor é " + valor + " e isso é bem alto, da pra pesquisar um pouco mais pra achar um melhor");
        } else
            System.out.println(+valor + " Reais é muito caro, não compra, tu é pobre esquece disso não!!! nem fez a compra do mês ainda");
    }
}

