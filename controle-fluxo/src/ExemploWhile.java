import java.util.concurrent.ThreadLocalRandom;

import javax.sound.sampled.SourceDataLine;
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while(mesada > 0) {
            Double valorDoce = valorAleatorio();

            if(valorDoce > mesada){
                System.out.println("Joãozinho não pode comprar mais doces");
                break;
            }

            System.out.println("Doce do valor: " + valorDoce + " Adicionado ao carrinho");
            mesada = mesada - valorDoce;
            System.out.println("Sobraram " + mesada + " reais");
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");

    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
