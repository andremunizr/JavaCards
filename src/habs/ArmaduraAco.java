
package habs;

import core.Elemento;
import mons.Monster;

public class ArmaduraAco extends Habilidade{
    
    public ArmaduraAco(){
        this.texto = "Quando cavaleiro da colina é alvo de ataques do tipo vento, o dano é dividido pela metade";
    }

    public boolean condicao( Monster atacante ) {
        return atacante.getTipo().name().equals( Elemento.VENTO.name() );
    }
    
    public Monster ativar( Monster atacante, Monster defensor ){
        defensor.setHp( defensor.getHp() - atacante.getAtk() );
        return defensor;
    }
    
    @Override
    public boolean condicao() {
        return true;
    }
    
}
