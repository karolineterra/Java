package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora,Impressora{

    public void imprimir() {
        System.out.println("Imprimindo através do equipamento multifuncional");
    }

    public void digitalizar() {
        System.out.println("Digitalizando através do equipamento multifuncional");
    }

    public void copiar() {
        System.out.println("Copiando a partir do equipamento multifuncional");
    }
    
}
