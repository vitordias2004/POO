package br.inatel.cdg.jogo.pokemons;

import br.inatel.cdg.jogo.habilidades.LeafStorm;
import br.inatel.cdg.jogo.habilidades.MagicalLeaf;
import br.inatel.cdg.jogo.habilidades.Tackle;
import br.inatel.cdg.jogo.habilidades.TakeDown;
import br.inatel.cdg.jogo.tipo.Grama;

public class Snivy extends Pokemon {
    public Snivy(){
        super("Snivy", 100, 30, 30, 50);
        this.getTipos().add(new Grama());
        this.getHabilidades().add(new MagicalLeaf()); // Golpe de Grama
        this.getHabilidades().add(new LeafStorm()); // Golpe de Grama
        this.getHabilidades().add(new Tackle()); // Golpe Normal
        this.getHabilidades().add(new TakeDown()); // Golpe Normal
    }
}
