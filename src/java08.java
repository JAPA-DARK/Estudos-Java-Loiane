import java.util.Scanner;

public class java08 {
    public static void main(String[] args){
//teste pratico de leitura de dados
        Scanner scan = new Scanner(System.in);
        System.out.println("qual é o nome dos alunos de sua turma:");
        String nomeAlunos = scan.nextLine();
        System.out.println("então seus colegas de trabalho são :" + nomeAlunos);
    }
}
