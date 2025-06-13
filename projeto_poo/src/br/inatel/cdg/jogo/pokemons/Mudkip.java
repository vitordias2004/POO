package br.inatel.cdg.jogo.pokemons;

import br.inatel.cdg.jogo.habilidades.Tackle;
import br.inatel.cdg.jogo.habilidades.WaterGun;
import br.inatel.cdg.jogo.habilidades.WaterPulse;
import br.inatel.cdg.jogo.tipo.Agua;
import br.inatel.cdg.jogo.habilidades.HydroPump;

public class Mudkip extends Pokemon {
    public Mudkip(){
        super("Mudkip", 50, 70, 50, 40);
        this.getTipos().add(new Agua());
        this.getHabilidades().add(new Tackle());
        this.getHabilidades().add(new WaterGun());
        this.getHabilidades().add(new WaterPulse());
        this.getHabilidades().add(new HydroPump());
    }
}
