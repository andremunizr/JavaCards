
package core;

public enum Elemento {
    
    AGUA("Água","Fogo","Terra"), FOGO("Fogo","Vento","Água"), 
    TERRA("Terra","Água","Trevas"), VENTO("Vento","Luz","fogo"), 
    LUZ("Luz","Trevas","Vento"), TREVAS("Trevas","terra","Luz"),
    PURO("Puro", null, null);
    
    public String nome;
    public String vantagem;
    public String fraqueza;
    
    Elemento( String n, String v, String f ){
        nome = n;
        vantagem = v;
        fraqueza = f;
    }
    
}
