package br.inatel.cdg.jogo.pokemons;

import br.inatel.cdg.jogo.habilidades.ThunderShock;
import br.inatel.cdg.jogo.habilidades.ZapCannon;
import br.inatel.cdg.jogo.habilidades.ThunderWave;
import br.inatel.cdg.jogo.habilidades.AerialAce;
import br.inatel.cdg.jogo.tipo.Eletrico;
import br.inatel.cdg.jogo.tipo.Voador;

public class Zapdos extends Pokemon {
    public Zapdos(){
        super("Zapdos", 90, 125, 90, 100);
        this.getTipos().add(new Eletrico());
        this.getTipos().add(new Voador());
        this.getHabilidades().add(new ThunderShock());
        this.getHabilidades().add(new ZapCannon());
        this.getHabilidades().add(new ThunderWave());
        this.getHabilidades().add(new AerialAce());
    }
}
