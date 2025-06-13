package br.inatel.cdg.jogo.tipo;

public class Psiquico extends Tipo{
    public Psiquico() {
        super("Psiquico");
    }

    @Override
    public double calcDanoTipo(Tipo ataque) {
        if(ataque.nome.equals("Psiquico")){
            return 0.5;
        }else {
            return 1;
        }

    }
}
