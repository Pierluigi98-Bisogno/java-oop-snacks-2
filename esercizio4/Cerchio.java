package esercizio4;

/**
 * Classe Cerchio che estende la classe astratta Figura.
 * Implementa il calcolo dell'area usando la costante PI_GRECO.
 */
public class Cerchio extends Figura {
    private double raggio;
    
    /**
     * Costruttore per creare un cerchio con il raggio specificato.
     * @param raggio il raggio del cerchio
     */
    public Cerchio(double raggio) {
        this.raggio = raggio;
    }
    
    /**
     * Implementazione del metodo astratto calcolaArea().
     * Usa la costante PI_GRECO per calcolare l'area.
     * @return l'area del cerchio (PI_GRECO * raggio^2)
     */
    @Override
    public double calcolaArea() {
        return PI_GRECO * raggio * raggio;
    }
    
    /**
     * Implementazione del metodo astratto getDescrizione().
     * @return descrizione del cerchio
     */
    @Override
    public String getDescrizione() {
        return "Cerchio con raggio: " + raggio;
    }
    
    /**
     * Getter per il raggio.
     * @return il raggio del cerchio
     */
    public double getRaggio() {
        return raggio;
    }
    
    /**
     * Setter per il raggio.
     * @param raggio il nuovo raggio del cerchio
     */
    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }
}