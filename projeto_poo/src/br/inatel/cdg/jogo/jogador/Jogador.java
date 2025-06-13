package br.inatel.cdg.jogo.jogador;

import br.inatel.cdg.jogo.pokemons.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Jogador {

    private String nome;
    private Pokemon pokemon;
    private int vitorias;

    public Jogador(String nome, Scanner sc) {
        this.nome = nome;
        this.vitorias = 0;
        this.pokemon = escolher_Pokemon(sc);
    }

    public Pokemon escolher_Pokemon(Scanner sc) {
        System.out.println(nome
                + ", escolha qual pokemon quer utilizar, digite (1) para pikachu, (2) para zapdos, (3) para arcanine, (4) para moltres,"
                +
                "(5) para mudkip, (6) para kyogre, (7) para snivy, (8) para celebi");

        int opcao = 0;
        boolean opcao_valida = false;
        while(!opcao_valida) {
            try {
                opcao = sc.nextInt();
                sc.nextLine();
                if(opcao < 1 || opcao > 8) {
                    throw new IllegalArgumentException("opcao fora do intervalo permitido (1 a 8)");
                }

                opcao_valida = true;

            } catch (InputMismatchException e) {
                System.out.println("Erro: voce deve digitar um numero inteiro. Tente novamente.");
                sc.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage() + ", tente novamente.");
            }

        }
        switch (opcao) {
            case 1:
                return new Pikachu();

            case 2:
                return new Zapdos();

            case 3:
                return new Arcanine();

            case 4:
                return new Moltres();

            case 5:
                return new Mudkip();

            case 6:
                return new Kyogre();

            case 7:
                return new Snivy();

            case 8:
                return new Celebi();

            default:
                System.out.println("Opção Inválida. Pokémon padrão atribuído");
                return new Pikachu();
        }
    }

    public String getNome() {
        return nome;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void addVitorias() {
        vitorias++;
    }

    public void salvarPlacarGeral() {
        File arquivo = new File("data/ranking/placar_geral.txt");
        Map<String, Integer> placar = new HashMap<>();

        if (arquivo.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
                String linha;
                while ((linha = reader.readLine()) != null) {
                    String[] partes = linha.split(":");
                    if (partes.length == 2) {
                        String nomeJogador = partes[0];
                        int vitoriasJogador = Integer.parseInt(partes[1]);
                        placar.put(nomeJogador, vitoriasJogador);
                    }
                }
            } catch (IOException | NumberFormatException e) {
                System.out.println("Erro ao ler o placar geral.");
            }
        }

        placar.put(nome, placar.getOrDefault(nome, 0) + 1);

        List<Map.Entry<String, Integer>> ranking = new ArrayList<>(placar.entrySet());
        ranking.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo))) { //escrever no arquivo o conteudo ja ordenado
            for (Map.Entry<String, Integer> entry : ranking) {
                writer.write(entry.getKey() + ":" + entry.getValue());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar placar geral.");
        }
    }


}