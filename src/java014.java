import java.util.Scanner;

public class java014 {
    public static void main(String[] args) {
        //exercicios loiane {aula-013 ex 01 a 05}

        //01
        String saudacaoEUA = "hello World ,";
        String saudacaoBR = " olá Mundo ,";
        String saudacaoSPAN = " hola Mundo";
        System.out.println("essas são saudações EUA, BR E SPAN respectivamente na ordem = " + saudacaoEUA + saudacaoBR + saudacaoSPAN);

        //02
        Scanner scan = new Scanner(System.in);
        System.out.println("escreva um numero");
        int numerosDigitados = scan.nextInt();
        System.out.println("voce escreveu o numero '" + numerosDigitados + "'");

        //03
        System.out.println("escreva dois numeros que goste");
        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();
        int somaDosnumeros = numero1 + numero2;
        System.out.println("seus numeros preferidos são '" + numero1 + " e "+ numero2 +"'");
        System.out.println("a soma desses dois numeros é igual a "+ somaDosnumeros);

        //04
        System.out.println("agora vamos falar sobre as suas notas do 3 ano do ensino médio");
        System.out.println("digite sua nota do 1° bimestre");
        double notasAno1b = scan.nextDouble();
        System.out.println("digite sua nota do 2° bimestre");
        double notasAno2b = scan.nextDouble();
        System.out.println("digite sua nota do 3° bimestre");
        double notasAno3b = scan.nextDouble();
        System.out.println("digite sua nota do 4° bimestre");
        double notasAno4b = scan.nextDouble();


        double total = notasAno1b + notasAno2b + notasAno3b + notasAno4b;
        double mediadoAno = total / 4;

        String resultado;
        if (mediadoAno > 7){
            resultado = "aprovado";
        } else {
            resultado = "reprovado";
        }

        //05
        System.out.println("suas notas são 1bimestre = "+ notasAno1b+ ", segundo bimestre = "+ notasAno2b + ", terceiro bimestre = "+ notasAno3b +" e quarto bimestre = "+ notasAno4b);
        System.out.println("sua media foi finalizada com " + mediadoAno);
        System.out.println("seu resultado é = "+ resultado);
        System.out.println("obrigado por responder ao questionario");

        System.out.println("escreva o tamanho em metros");
        double metrosPeca = scan.nextInt();
        double centimetros = metrosPeca * 100;
        double milimetros = centimetros * 100;
        System.out.println("voce digitou "+ metrosPeca + " em metros e isso é = "+ centimetros + " em centimetros ");
        System.out.println("e em milimetros é = " + milimetros);

    }
}
