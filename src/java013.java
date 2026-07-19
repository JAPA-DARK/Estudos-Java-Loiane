public class java013 {
    public static void main(String[] args){
        boolean verdadeiro = true;
        boolean falso = false;
        boolean resultado1 = falso && verdadeiro; // melhor execução
        boolean resultado2 = falso & verdadeiro; // execução mais lenta 
        System.out.println(resultado2);
    }
}
