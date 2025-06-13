package br.inatel.cdg.jogo.tipo;

public class Grama extends Tipo{
    public Grama(){
        super("Grama");
    }

    @Override
    public double calcDanoTipo(Tipo ataque) {
        if(ataque.nome.equals("Fogo") || ataque.nome.equals("Voador")){
            return 2;
        } else if (ataque.nome.equals("Agua") || ataque.nome.equals("Eletrico") || ataque.nome.equals("Grama")) {
            return 0.5;
        }else{
            return 1;
        }
    }
}
