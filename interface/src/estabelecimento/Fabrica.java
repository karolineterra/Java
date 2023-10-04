package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {

        EquipamentoMultifuncional multifuncional = new EquipamentoMultifuncional();

        Impressora impressora = multifuncional;
        Digitalizadora digitalizadora = multifuncional;
        Copiadora copiadora = multifuncional;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
