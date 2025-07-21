package esercizio4;

/**
 * Classe Rettangolo che estende la classe astratta Figura.
 * Contiene un metodo final che non può essere sovrascritto.
 */
public class Rettangolo extends Figura {
    private double base;
    private double altezza;
    
    /**
     * Costruttore per creare un rettangolo con base e altezza specificate.
     * @param base la base del rettangolo
     * @param altezza l'altezza del rettangolo
     */
    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }
    
    /**
     * Implementazione del metodo astratto calcolaArea().
     * @return l'area del rettangolo (base * altezza)
     */
    @Override
    public double calcolaArea() {
        return base * altezza;
    }
    
    /**
     * Implementazione del metodo astratto getDescrizione().
     * @return descrizione del rettangolo
     */
    @Override
    public String getDescrizione() {
        return "Rettangolo con base: " + base + " e altezza: " + altezza;
    }
    
    /**
     * Metodo final che calcola il perimetro.
     * Questo metodo non può essere sovrascritto nelle sottoclassi.
     * @return il perimetro del rettangolo
     */
    public final double calcolaPerimetro() {
        return 2 * (base + altezza);
    }
    
    /**
     * Getter per la base.
     * @return la base del rettangolo
     */
    public double getBase() {
        return base;
    }
    
    /**
     * Setter per la base.
     * @param base la nuova base del rettangolo
     */
    public void setBase(double base) {
        this.base = base;
    }
    
    /**
     * Getter per l'altezza.
     * @return l'altezza del rettangolo
     */
    public double getAltezza() {
        return altezza;
    }
    
    /**
     * Setter per l'altezza.
     * @param altezza la nuova altezza del rettangolo
     */
    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }
}