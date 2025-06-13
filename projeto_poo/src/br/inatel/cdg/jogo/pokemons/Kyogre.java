package br.inatel.cdg.jogo.pokemons;
import br.inatel.cdg.jogo.habilidades.AquaTail;
import br.inatel.cdg.jogo.habilidades.WaterGun;
import br.inatel.cdg.jogo.habilidades.WaterPulse;
import br.inatel.cdg.jogo.tipo.Agua;
import br.inatel.cdg.jogo.habilidades.HydroPump;
public class Kyogre extends Pokemon {
    public Kyogre(){
        super("Kyogre", 100, 150, 140, 90);
        this.getTipos().add(new Agua());
        this.getHabilidades().add(new HydroPump());
        this.getHabilidades().add(new WaterPulse());
        this.getHabilidades().add(new AquaTail());
        this.getHabilidades().add(new WaterGun());
    }
}
