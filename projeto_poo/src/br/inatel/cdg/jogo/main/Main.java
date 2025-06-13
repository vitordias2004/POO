package br.inatel.cdg.jogo.main;

import br.inatel.cdg.jogo.combate.Combate;
import br.inatel.cdg.jogo.jogador.Jogador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("jogador 1 escolha seu nome: ");
        String nome1 = sc.nextLine();
        System.out.println("jogador 2 escolha seu nome: ");
        String nome2 = sc.nextLine();

        boolean jogarNovamente = false;

        do {
            Jogador jogador1 = new Jogador(nome1, sc);
            Jogador jogador2 = new Jogador(nome2, sc);
            Combate combate = new Combate(jogador1.getPokemon(), jogador2.getPokemon(), jogador1, jogador2);
            combate.iniciar();

            boolean opcao_valida = false;

            while(!opcao_valida) {
                try {
                    System.out.println("deseja jogar novamente? digite (sim) ou (nao)");
                    String again = sc.nextLine().trim().toLowerCase();
                    if (again.equals("sim")) {
                        jogarNovamente = true;
                        opcao_valida = true;
                    } else if (again.equals("nao")) {
                        jogarNovamente = false;
                        opcao_valida = true;
                    } else {
                        throw new IllegalArgumentException("Entrada invalida, digite apenas 'sim' ou 'nao'");
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("erro: " + e.getMessage() + "\ntente novamente");
                }
            }

        } while(jogarNovamente);



    }
}