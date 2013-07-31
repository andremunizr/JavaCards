
package mons;

import core.Card;
import core.Elemento;
import core.Tipo;

public class Monster extends Card{
    
    protected Integer hp;
    protected Integer atk;
    protected boolean podeAtacar = true;
    protected boolean podeDefender = true;
    protected Elemento elemento;
    protected Tipo tipo;
    protected Integer contadorDeTurnos;

    public Integer getHp(){
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getAtk() {
        return atk;
    }

    public void setAtk(Integer atk) {
        this.atk = atk;
    }

    public boolean podeAtacar() {
        return podeAtacar;
    }

    public void setPodeAtacar(boolean podeAtacar) {
        this.podeAtacar = podeAtacar;
    }

    public boolean podeDefender() {
        return podeDefender;
    }

    public void setPodeDefender(boolean podeDefender) {
        this.podeDefender = podeDefender;
    }

    public Elemento getElemento() {
        return elemento;
    }

    public void setElemento(Elemento elemento) {
        this.elemento = elemento;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Integer getContadorDeTurnos() {
        return contadorDeTurnos;
    }

    public void setContadorDeTurnos(Integer contadorDeTurnos) {
        this.contadorDeTurnos = contadorDeTurnos;
    }
    
}
