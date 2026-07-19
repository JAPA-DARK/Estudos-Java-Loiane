import java.util.Scanner;

public class java014 {
    public static void main(String[] args) {
        //exercicios loiane {013}
     /*   String saudacaoEUA = "hello World ,";
        String saudacaoBR = " olá Mundo ,";
        String saudacaoSPAN = " hola Mundo";
        System.out.println("essas são saudações EUA, BR E SPAN respectivamente na ordem = " + saudacaoEUA + saudacaoBR + saudacaoSPAN);

        Scanner scan = new Scanner(System.in);
        System.out.println("escreva um numero");
        int numerosDigitados = scan.nextInt();
        System.out.println("voce escreveu o numero '" + numerosDigitados + "'");

        System.out.println("escreva dois numeros que goste");
        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();
        int somaDosnumeros = numero1 + numero2;
        System.out.println("seus numeros preferidos são '" + numero1 + " e "+ numero2 +"'");
        System.out.println("a soma desses dois numeros é igual a "+ somaDosnumeros);

        */
        System.out.println("agora vamos falar sobre as suas notas do 3 ano do ensino médio");
        double notasBimestre1 = 6.5;
        double notasBimestre2 = 7.5;
        double notasBimestre3 = 6;
        double notasBimestre4 = 8.5;
        double total = notasBimestre1 + notasBimestre2 + notasBimestre3 + notasBimestre4;
        double resultadoAnual = total;
        double mediadoAno = total / 4;

        String resultado;
        if (mediadoAno > 7){
            resultado = "aprovado";
        } else {
            resultado = "reprovado";
        }

        System.out.println("suas notas são 1bimestre = "+ notasBimestre1+ ", segundobimestre = "+ notasBimestre2 + ", terceirobimestre = "+ notasBimestre3 +" e quartobimestre = "+ notasBimestre4);
        System.out.println("sua media foi finalizada com " + mediadoAno);
        System.out.println("seu resultado é = "+ resultado);
    }
}
