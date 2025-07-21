package esercizio4;

/**
 * Classe astratta Figura che definisce la struttura base per le figure geometriche.
 * Contiene una costante PI_GRECO e un metodo astratto per calcolare l'area.
 */
public abstract class Figura {
    // Costante PI_GRECO dichiarata come public static final
    public static final double PI_GRECO = 3.14;
    
    /**
     * Metodo astratto per calcolare l'area della figura.
     * Deve essere implementato dalle sottoclassi.
     * @return l'area della figura
     */
    public abstract double calcolaArea();
    
    /**
     * Metodo per ottenere una descrizione della figura.
     * @return descrizione della figura
     */
    public abstract String getDescrizione();
}