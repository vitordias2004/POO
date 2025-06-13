package br.inatel.cdg.jogo.combate;

import br.inatel.cdg.jogo.habilidades.Habilidade;
import br.inatel.cdg.jogo.jogador.Jogador;
import br.inatel.cdg.jogo.pokemons.Pokemon;


public class Combate {

    private Pokemon poke1;
    private Pokemon poke2;
    private Jogador j1;
    private Jogador j2;

    public Combate(Pokemon poke1, Pokemon poke2, Jogador j1, Jogador j2) {
        this.poke1 = poke1;
        this.poke2 = poke2;
        this.j1 = j1;
        this.j2 = j2;
    }

    public boolean verificaFim(){
        if(poke1.getHp() <= 0){
            System.out.println(poke1.getNome() + " foi derrotado, vitoria de " + poke2.getNome());
            j2.addVitorias();
            j2.salvarPlacarGeral();
            return true;
        } else if (poke2.getHp() <= 0) {
            System.out.println(poke2.getNome() + " foi derrotado, vitoria de " + poke1.getNome());
            j1.addVitorias();
            j1.salvarPlacarGeral();
            return true;
        } else {
            return false;
        }
    }

    public void iniciar(){
        System.out.println("\n=== BATALHA POKÉMON ===");
        System.out.println(j1.getNome() + " escolheu: " + poke1.getNome());
        System.out.println(j2.getNome() + " escolheu: " + poke2.getNome());

        int rodada = 1;
        while(!verificaFim()){
            System.out.println("\n--- RODADA " + rodada + " ---");
            turno(j1, j2, poke1, poke2);
            if(verificaFim()) break;
            turno(j2, j1, poke2, poke1);
            if(verificaFim()) break;
            rodada++;
        }

    }

    public void turno(Jogador jogadorAtaque, Jogador jogadorDefesa, Pokemon atacante, Pokemon defensor){
        System.out.println("\nTurno de " + jogadorAtaque.getNome() + " com " + atacante.getNome());

        atacante.mostrarHP();
        defensor.mostrarHP();

        Habilidade habilidadeEscolhida = atacante.decidirHabilidade();

        if (habilidadeEscolhida != null) {
            double danoDado = defensor.receberAtaque(atacante, habilidadeEscolhida);
            System.out.println(atacante.getNome() + " deu " + String.format("%.2f", danoDado) + " de dano em "+ defensor.getNome());
        }else {
            System.out.println("Nenhuma habilidade foi usada.");
        }
    }

}
