public class java012 {
    public static void main(String[] args){
        //operadores logicos
        int valor1 = 1;
        int valor2 = 2;
        boolean resultado1 = (valor1 == 1) && (valor2 == 2);
        System.out.println("valor1 é 1 AND valor2 é 2 "+ resultado1);
        boolean resultado2 = (valor1 == 1) || (valor2 == 2);
        System.out.println("valor1 é 1 OR valor2 é 2 "+ resultado2);

        boolean verdadeiro = true;
        boolean falso = false;
        System.out.println(verdadeiro && falso); // falso esse só da verdadeiro quando ambos são verdadeiros
        System.out.println(verdadeiro || falso); // verdadeiro esse só da falso quando os dois sao falsos
        System.out.println(verdadeiro ^ falso); // verdadeiro esse só da falso quando ambos são falso ou ambos verdadeiros
        System.out.println(!verdadeiro && falso); //false esse tem uma negação no versadeiro que daria falso e falso com falso no && da falso
        System.out.println(!verdadeiro || falso); //falso esse tem uma negação no verdadeiro e quando tem dois falso o || continua sendo falso

    }
}
