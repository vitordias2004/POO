package br.inatel.cdg.jogo.habilidades;
import br.inatel.cdg.jogo.tipo.Agua;

public class WaterGun extends Habilidade  {
    public WaterGun(){
        super ("watergun", 40, 100, 25);
        this.tipo = new Agua();
    }

}
