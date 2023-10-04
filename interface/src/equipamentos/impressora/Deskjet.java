package equipamentos.impressora;

import javax.xml.transform.Source;

public class Deskjet implements Impressora {

    @Override
    public void imprimir() {
        System.out.println("Imprimindo a partir da Deskjet");
    }

}
