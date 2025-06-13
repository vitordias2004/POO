package br.inatel.cdg.jogo.pokemons;

import br.inatel.cdg.jogo.habilidades.Habilidade;
import br.inatel.cdg.jogo.tipo.Tipo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public abstract class Pokemon {

    protected String nome;
    protected List<Tipo> tipos = new ArrayList<>();
    protected float hp;
    protected int atk;
    protected int def;
    protected int speed;
    protected List<Habilidade> habilidades;
    protected float maxHp;



    public Pokemon(String nome, float hp, int atk, int def, int speed) {
        this.nome = nome;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.speed = speed;
        this.habilidades = new ArrayList<>();
        this.maxHp = hp;
    }


    public Habilidade decidirHabilidade() {
        if(habilidades != null && !habilidades.isEmpty()) {
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < habilidades.size(); i++) {
                System.out.println("digite (" + (i + 1) + ") para usar " + habilidades.get(i).getNome());
            }
            int id = sc.nextInt();
            return habilidades.get(id - 1);
        }else{
            System.out.println("nenhuma habilidade disponivel");
            return null;
        }
    }




    public boolean ataqueAcertou(Habilidade ataque) {
        Random rand  = new Random();
        int chance = rand.nextInt(100) + 1;
        if(ataque.getAcc() == 100 || ataque.getAcc() > chance){
            System.out.println(ataque.getNome() + " acertou!");
            return true;
        }else{
            System.out.println(ataque.getNome() + " falhou!");
            return false;
        }
    }

    public double receberAtaque(Pokemon atacante, Habilidade ataque) {

        if(ataqueAcertou(ataque)){
            int dano = ataque.getDano();
            double xTipo = 1;
            for (Tipo tipo : tipos) {
                xTipo *= tipo.calcDanoTipo(ataque.getTipo());
                if(tipo.calcDanoTipo(ataque.getTipo()) == 2){
                    System.out.println("dano super-efetivo, " + ataque.getTipo().getNome() + " x " + tipo.getNome());
                }else if(tipo.calcDanoTipo(ataque.getTipo()) == 0.5){
                    System.out.println("dano pouco efetivo, " + ataque.getTipo().getNome() + " x " + tipo.getNome());
                }
            }
            ataque.usarHabilidade();
            hp -= (float) ((atacante.atk * dano * xTipo) / def);
            return (atacante.atk * dano * xTipo) / def;
        }else{
            return 0;
        }
    }

    public void mostrarHP() {
        float currentHp = (hp/maxHp)*100;
        System.out.println(nome + " - HP: " + String.format("%.2f", currentHp) + "%");
    }


    public List<Habilidade> getHabilidades() {
        return habilidades;
    }

    public List<Tipo> getTipos() {return tipos;}

    public float getHp() {
        return hp;
    }


    public String getNome() {
        return nome;
    }

}
