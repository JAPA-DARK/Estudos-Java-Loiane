public class java010 {
    public static void main(String[] args) {
         //operadores aritméticos
        int resultado = 1 + 2;
        System.out.println(resultado);
        //3

        resultado = resultado -1;
        System.out.println(resultado);
        //2

        resultado = resultado * 2;
        System.out.println(resultado);
        //4

        resultado = resultado / 2;
        System.out.println(resultado);
        //2

        resultado = resultado + 8;
        System.out.println(resultado);
        //10

        resultado = resultado % 7;
        System.out.println(resultado);
        //3

        //Strings concatenadas
        String primeiroNome = "ariel";
        String segundoNome = " da silva alves";
        String nomeCompleto = primeiroNome + segundoNome;
        System.out.println(nomeCompleto);
        //ariel da silva alves

        resultado++; // aqui ele mostra o resultado e depois mostra na tela
        System.out.println(resultado); //aqui ele apenas mostra o resultado
        //4


        System.out.println(resultado++); // aqui ele mostra o resultado e depois adiciona 1
        //4
        /* a linha acima é a mesma coisa que:
        //System.println(resultado);
        // resultado = +1;
        // resultado += 1;
        */

        System.out.println(++resultado); //aqui ele adiciona 1 no que ja existia e mostra o resultado
        //6
        /* a linha acima é a mesma coisa que:
        //resultado += 1;
        System.out.println(resultado); */

        resultado--; // aqui ele mostra o resultado e depois retira 1
        System.out.println(resultado); //aqui ele apenas mostra isso na tela
        //5

        System.out.println(resultado--);//aqui ele mostra o resultado que ja era 5 e depois retira
        //5-1
        System.out.println(--resultado);// aqui ele primeiro retira e depois imprimi o resultado na tela
        //4-1 = 3


    }
}
