package br.inatel.cdg.jogo.pokemons;

import br.inatel.cdg.jogo.habilidades.AerialAce;
import br.inatel.cdg.jogo.habilidades.Flamethrower;
import br.inatel.cdg.jogo.habilidades.Hurricane;
import br.inatel.cdg.jogo.habilidades.HyperBeam;
import br.inatel.cdg.jogo.tipo.Fogo;
import br.inatel.cdg.jogo.tipo.Voador;


public class Moltres extends Pokemon {
    public Moltres(){
        super("Moltres", 90, 125, 90, 90);
        this.getTipos().add(new Fogo());
        this.getTipos().add(new Voador());
        this.getHabilidades().add(new Flamethrower());
        this.getHabilidades().add(new AerialAce());
        this.getHabilidades().add(new Hurricane());
        this.getHabilidades().add(new HyperBeam());
    }
}
