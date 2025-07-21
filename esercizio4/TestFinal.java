package esercizio4;

/**
 * Classe di test che estende Rettangolo.
 * Dimostra che non è possibile sovrascrivere un metodo final.
 */
public class TestFinal extends Rettangolo {
    
    /**
     * Costruttore che chiama il costruttore della superclasse.
     * @param base la base del rettangolo
     * @param altezza l'altezza del rettangolo
     */
    public TestFinal(double base, double altezza) {
        super(base, altezza);
    }
    
    // ERRORE: Il seguente metodo genererà un errore di compilazione
    // perché tenta di sovrascrivere un metodo final
    /*
    @Override
    public double calcolaPerimetro() {
        // Questo codice non compilerà mai!
        return 0;
    }
    */
    
    /**
     * Metodo aggiuntivo che non causa problemi.
     * @return una descrizione estesa
     */
    public String getDescrizioneEstesa() {
        return "TestFinal: " + getDescrizione() + " - Perimetro: " + calcolaPerimetro();
    }
}