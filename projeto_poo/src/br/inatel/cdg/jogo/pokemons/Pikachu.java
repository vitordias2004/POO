package br.inatel.cdg.jogo.pokemons;

import br.inatel.cdg.jogo.habilidades.QuickAttack;
import br.inatel.cdg.jogo.habilidades.Tackle;
import br.inatel.cdg.jogo.habilidades.Thunder;
import br.inatel.cdg.jogo.habilidades.ThunderShock;
import br.inatel.cdg.jogo.tipo.Eletrico;

public class Pikachu extends Pokemon {
    public Pikachu(){
        super("Pikachu", 35, 55, 50, 90);
        this.getTipos().add(new Eletrico());
        this.getHabilidades().add(new QuickAttack());
        this.getHabilidades().add(new ThunderShock());
        this.getHabilidades().add(new Thunder());
        this.getHabilidades().add(new Tackle());
    }

}
