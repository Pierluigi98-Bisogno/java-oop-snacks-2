package esercizio1;

/**
 * Sottoclasse Auto che estende Veicolo con campo aggiuntivo numeroPorte
 */
public class Auto extends Veicolo {
    private int numeroPorte;
    
    // Costruttore
    public Auto(String marca, int anno, int numeroPorte) {
        super(marca, anno); // Chiama il costruttore della classe padre
        this.numeroPorte = numeroPorte;
    }
    
    // Metodi get e set per numeroPorte
    public int getNumeroPorte() {
        return numeroPorte;
    }
    
    public void setNumeroPorte(int numeroPorte) {
        this.numeroPorte = numeroPorte;
    }
    
    // Sovrascrittura del metodo stampaInfo()
    @Override
    public void stampaInfo() {
        System.out.println("Auto: " + getMarca() + ", Anno: " + getAnno() + ", Numero Porte: " + numeroPorte);
    }
}