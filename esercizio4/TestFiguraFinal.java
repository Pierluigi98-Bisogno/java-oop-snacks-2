package esercizio4;

/**
 * Classe che dimostra come usare FiguraFinal senza estenderla.
 * Invece di ereditarietà, usa la composizione.
 * 
 * NOTA: Se si tentasse di estendere FiguraFinal con:
 * public class TestFiguraFinal extends FiguraFinal
 * si otterrebbe un errore di compilazione perché FiguraFinal è dichiarata final.
 */
public class TestFiguraFinal {
    private FiguraFinal figura;
    
    /**
     * Costruttore che crea un'istanza di FiguraFinal.
     * @param tipo il tipo di figura
     * @param area l'area della figura
     */
    public TestFiguraFinal(String tipo, double area) {
        this.figura = new FiguraFinal(tipo, area);
    }
    
    /**
     * Metodo che delega alla figura interna.
     * @return la descrizione della figura
     */
    public String getDescrizioneFigura() {
        return "Test wrapper: " + figura.getDescrizione();
    }
    
    /**
     * Getter per la figura.
     * @return l'istanza di FiguraFinal
     */
    public FiguraFinal getFigura() {
        return figura;
    }
}