import java.util.Scanner;

public class java031a {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            //18
            System.out.println("entre com o tamanho do arquivo");
            double tamArquivo = scan.nextDouble();
            System.out.println("entre com a velociade da internet");
            double velInternet = scan.nextDouble();
            double tempopDownload = tamArquivo / velInternet;
            System.out.println("o tempo para fazer o download é de "+ tempopDownload);


        }
    }
