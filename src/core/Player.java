
package core;

import java.util.ArrayList;
import java.util.HashMap;
import mons.Monster;

public class Player {
    
    private ArrayList<Card> mao = new ArrayList<>();
    private ArrayList<Card> baralho = new ArrayList<>();
    private Monster ativo = new Monster();
    private ArrayList<Monster> banco = new ArrayList<>();
    private HashMap<Elemento,Integer> energia = new HashMap<>();
    private String nome;
    
    public Player( String nome ){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Card> getMao() {
        return mao;
    }

    public void setMao(ArrayList<Card> mao) {
        this.mao = mao;
    }

    public ArrayList<Card> getBaralho() {
        return baralho;
    }

    public void setBaralho(ArrayList<Card> baralho) {
        this.baralho = baralho;
    }

    public Monster getAtivo() {
        return ativo;
    }

    public void setAtivo(Monster ativo) {
        this.ativo = ativo;
    }

    public ArrayList<Monster> getBanco() {
        return banco;
    }

    public void setBanco(ArrayList<Monster> banco) {
        this.banco = banco;
    }

    public HashMap<Elemento, Integer> getEnergia() {
        return energia;
    }

    public void setEnergia(HashMap<Elemento, Integer> energia) {
        this.energia = energia;
    }
    
    public void comprar(){
        
        Card carta = baralho.get( 0 );
        mao.add( carta );
        baralho.remove( baralho.get( 0 ) );        
    }
}
