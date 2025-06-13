package br.inatel.cdg.jogo.tipo;

public class Eletrico extends Tipo {
    public Eletrico() {
        super("Eletrico");
    }

    @Override
    public double calcDanoTipo(Tipo ataque) {
        if (ataque.nome.equals("Eletrico") || ataque.nome.equals("Voador")) {
            return 0.5;
        }else{
            return 1;
        }
    }
}
