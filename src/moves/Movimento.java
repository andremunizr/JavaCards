
package moves;

import core.Elemento;

public class Movimento {

    protected String nome;
    protected Elemento elemento;
    protected Integer dano;
    protected Integer custo;
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
}
