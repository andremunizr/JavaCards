
package mons;

import core.Elemento;
import core.Tipo;
import habs.ArmaduraAco;

public class CavaleiroColina extends Monster{
    
    public ArmaduraAco hab;
    
     public CavaleiroColina(){
         this.elemento = Elemento.TERRA;
         this.tipo = Tipo.CAVALEIRO;
         this.hp = 70;
         this.atk = 15;
     }
         
}
