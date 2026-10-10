import java.util.Scanner;

public class java051a {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

                System.out.println("me diga sua data de nascimento");
                String data = scan.nextLine();

                String[] partes = data.split("/");

                int dia = Integer.parseInt(partes[0]);
                int mes = Integer.parseInt(partes[1]);
                int ano = Integer.parseInt(partes[2]);

                if (dia < 1 ||  dia > 31 ||  mes < 1 || mes > 12 || ano < 1 || ano > 2026 ){
                    System.out.println("essa informação é invalida");
                    return;
                }
                else if ((mes == 4  || mes == 6  || mes == 9  || mes == 11 ) && dia > 30){
                    System.out.println("essa data é invalida esse mes só possui 30 dias" );
                }
                else if (mes == 2) {

                    if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {

                        if (dia > 29) {
                            System.out.println("fevereiro tem no maximo 29 dias");
                        } else {
                            System.out.println("sua data de nascimento é "+ partes[0]+"/"+partes[1]+"/"+partes[2]+ " essa é uma data valida");

                    }


                    } else {

                        if (dia > 28) {
                            System.out.println("fevereiro tem no maximo 28 dias");
                        } else {
                            System.out.println("sua data de nascimento é "+ partes[0]+"/"+partes[1]+"/"+partes[2]+ " essa é uma data valida");
                        }
                    }

                } else {

                    System.out.println("sua data de nascimento é "+ partes[0]+"/"+partes[1]+"/"+partes[2]+ " essa é uma data valida");
                }

            scan.close();
        }
}