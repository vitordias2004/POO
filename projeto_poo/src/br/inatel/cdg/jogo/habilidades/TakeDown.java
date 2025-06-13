package br.inatel.cdg.jogo.habilidades;

import br.inatel.cdg.jogo.tipo.Normal; // Importe a classe para o tipo Normal

public class TakeDown extends Habilidade {
    public TakeDown() {
        super("Take Down", 90, 85, 20); // Nome, Dano, Acerto, Max_usos
        this.tipo = new Normal(); // Define o tipo da habilidade como Normal
    }
}
