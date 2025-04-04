package Equipamentos.Equipamentos.estabelecimento;

import Equipamentos.Equipamentos.copiadora.Copiadora;
import Equipamentos.Equipamentos.digitalizadora.Digitalizadora;
import Equipamentos.Equipamentos.impressora.Deskjet;
import Equipamentos.Equipamentos.impressora.Impressora;
import Equipamentos.Equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Deskjet deskjet = new Deskjet();

        Impressora impressora = deskjet;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
