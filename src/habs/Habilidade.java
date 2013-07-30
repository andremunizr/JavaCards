
package habs;

public abstract class Habilidade {
    
    protected String texto;

    public Habilidade(){}
    
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    public abstract boolean condicao();    
    
}
