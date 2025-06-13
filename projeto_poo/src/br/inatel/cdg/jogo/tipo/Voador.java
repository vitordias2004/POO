package br.inatel.cdg.jogo.tipo;

public class Voador extends Tipo{

    public Voador() {
        super("Voador");
    }


    @Override
    public double calcDanoTipo(Tipo ataque) {
        if(ataque.nome.equals("Eletrico")){
            return 2;
        } else if (ataque.nome.equals("Grama")) {
            return 0.5;
        }else{
            return 1;
        }
    }

}
