package br.inatel.cdg.jogo.tipo;

public class Agua extends Tipo {
    public Agua() {
        super("Agua");
    }

    @Override
    public double calcDanoTipo(Tipo ataque) {
        if(ataque.nome.equals("grama") || ataque.nome.equals("Eletrico")){
            return 2;
        } else if (ataque.nome.equals("Fogo") || ataque.nome.equals("Agua")) {
            return 0.5;
        }else{
            return 1;
        }
    }
}
