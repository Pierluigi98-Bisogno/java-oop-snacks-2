package esercizio1;

/**
 * Classe Veicolo con campi privati marca e anno
 */
public class Veicolo {
    private String marca;
    private int anno;
    
    // Costruttore
    public Veicolo(String marca, int anno) {
        this.marca = marca;
        this.anno = anno;
    }
    
    // Metodi get e set per marca
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    // Metodi get e set per anno
    public int getAnno() {
        return anno;
    }
    
    public void setAnno(int anno) {
        this.anno = anno;
    }
    
    // Metodo stampaInfo()
    public void stampaInfo() {
        System.out.println("Veicolo: " + marca + ", Anno: " + anno);
    }
}