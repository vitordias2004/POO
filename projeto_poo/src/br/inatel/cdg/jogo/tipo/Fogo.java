package br.inatel.cdg.jogo.tipo;

public class Fogo extends Tipo {
    public Fogo() {
        super("Fogo");
    }


    @Override
    public double calcDanoTipo(Tipo ataque) {
        if(ataque.nome.equals("Agua")){
            return 2;
        } else if (ataque.nome.equals("Grama") || ataque.nome.equals("Fogo")) {
            return 0.5;
        }else{
            return 1;
        }

    }
}
