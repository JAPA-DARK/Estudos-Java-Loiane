import java.util.Scanner;

public class java041a {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            // EXERCÍCIO 08
                System.out.println("digite os preços dos produtos aqui");
                System.out.println("quanto custa a bandagem?");
                int produto1 = scan.nextInt();
                String primeiroProduto = "bandagem";
                System.out.println("quanto custa a camisa?");
                int produto2 = scan.nextInt();
                String segundoProduto = "camisa";
                System.out.println("quanto custa o caderno?");
                int produto3 = scan.nextInt();
                String terceiroProduto = "caderno";

                String Produto;
                int produtoMaisbarato = produto1;
                Produto = "bandagem";

                if (produto2 < produtoMaisbarato) {
                    produtoMaisbarato = produto2;
                    Produto = "camisa";
                }
                if (produto3 < produtoMaisbarato) {
                    produtoMaisbarato = produto3;
                    Produto = "caderno";
                }

                System.out.println("indentificamos que o produto mais barato é " + Produto + " que custa " + produtoMaisbarato);
            }
}
