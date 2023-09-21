public class Operadores {
    public static void main(String[] args){
        int numero = 5;
        numero = - numero;

        int numero2 = -2;
        numero2 = numero2 * -1; //Para tornar um número negativo em positivo

        //incremento

        int numero3 = 5;

        
        numero3 = numero3 + 2;

        System.out.println(numero);

        //operador ternário
        
        int a, b;
        a = 6;
        b = 6;
        
        String resultado = a == b ? "verdadeiro" : "falso";

        System.out.println(resultado);

        String nomeUm = "KAROLINE";
        String nomeDois = new String("KAROLINE");

        System.out.println(nomeUm.equals(nomeDois));
        System.out.println(nomeUm == nomeDois);
    }
}