import java.util.Scanner;

public class java017a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
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
        if (mediadoAno > 7) {
            resultado = "aprovado";
        } else {
            resultado = "reprovado";
        }
        System.out.println("suas notas são 1bimestre = " + notasAno1b + ", segundo bimestre = " + notasAno2b + ", terceiro bimestre = " + notasAno3b + " e quarto bimestre = " + notasAno4b);
        System.out.println("sua media foi finalizada com " + mediadoAno);
        System.out.println("seu resultado é = " + resultado);
        System.out.println("obrigado por responder ao questionario");
    }
}