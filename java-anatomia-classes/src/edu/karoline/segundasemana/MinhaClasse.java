package edu.karoline.segundasemana;
public class MinhaClasse {
    public static void main (String [] args){
        String primeiroNome = "Karoline";
        String segundoNome = "Terra";
        System.out.println(nomeCompleto(primeiroNome, segundoNome));
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
