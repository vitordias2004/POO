package br.inatel.cdg.jogo.pokemons;

import br.inatel.cdg.jogo.tipo.Fogo;
import br.inatel.cdg.jogo.habilidades.Ember;
import br.inatel.cdg.jogo.habilidades.FireWheel;
import br.inatel.cdg.jogo.habilidades.Flamethrower;
import br.inatel.cdg.jogo.habilidades.Tackle;

public class Arcanine extends Pokemon {
    public Arcanine(){
        super("Arcanine", 90, 110, 80, 95);
        this.getTipos().add(new Fogo());
        this.getHabilidades().add(new Tackle());
        this.getHabilidades().add(new Ember());
        this.getHabilidades().add(new FireWheel());
        this.getHabilidades().add(new Flamethrower());

    }


}
