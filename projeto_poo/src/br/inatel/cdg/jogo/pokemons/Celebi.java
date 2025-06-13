package br.inatel.cdg.jogo.pokemons;

import br.inatel.cdg.jogo.tipo.Grama;
import br.inatel.cdg.jogo.tipo.Psiquico;
import br.inatel.cdg.jogo.habilidades.LeafStorm;
import br.inatel.cdg.jogo.habilidades.Confusion;
import br.inatel.cdg.jogo.habilidades.MagicalLeaf;
import br.inatel.cdg.jogo.habilidades.GigaDrain;

public class Celebi extends Pokemon {
    public Celebi(){
        super("Celebi", 200, 40, 50, 50);
        this.getTipos().add(new Grama());
        this.getTipos().add(new Psiquico());
        this.getHabilidades().add(new LeafStorm());
        this.getHabilidades().add(new Confusion());
        this.getHabilidades().add(new MagicalLeaf());
        this.getHabilidades().add(new GigaDrain());
    }
}
