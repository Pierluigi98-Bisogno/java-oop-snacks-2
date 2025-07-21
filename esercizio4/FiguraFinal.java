package esercizio4;

/**
 * Classe final che non può essere estesa.
 * Questa versione di Figura dimostra l'uso del modificatore final su una classe.
 */
public final class FiguraFinal {
    // Costante PI_GRECO
    public static final double PI_GRECO = 3.14;
    
    private String tipo;
    private double area;
    
    /**
     * Costruttore per FiguraFinal.
     * @param tipo il tipo di figura
     * @param area l'area della figura
     */
    public FiguraFinal(String tipo, double area) {
        this.tipo = tipo;
        this.area = area;
    }
    
    /**
     * Metodo per ottenere l'area.
     * @return l'area della figura
     */
    public double getArea() {
        return area;
    }
    
    /**
     * Metodo per ottenere il tipo.
     * @return il tipo di figura
     */
    public String getTipo() {
        return tipo;
    }
    
    /**
     * Metodo per ottenere una descrizione completa.
     * @return descrizione della figura
     */
    public String getDescrizione() {
        return "Figura di tipo: " + tipo + " con area: " + area;
    }
}