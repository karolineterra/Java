import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
        // Number valor = Double.valueOf("a1.75");
        // System.out.println(valor);

        try {
            Number valor2 = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor2);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // System.out.println(valor);
    }
}
