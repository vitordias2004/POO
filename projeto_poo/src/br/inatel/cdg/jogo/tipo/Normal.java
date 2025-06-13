package br.inatel.cdg.jogo.tipo;

public class Normal extends Tipo{
    public Normal() {
        super("Normal");
    }

    @Override
    public double calcDanoTipo(Tipo ataque) {
        return 1;
    }
}
