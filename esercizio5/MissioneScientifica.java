package esercizio5;

/**
 * Sottoclasse di MissioneSpaziale per missioni scientifiche.
 * Aggiunge un campo specifico per l'obiettivo scientifico.
 */
public class MissioneScientifica extends MissioneSpaziale {
    // Campo aggiuntivo per l'obiettivo scientifico
    private String obiettivo;
    
    /**
     * Costruttore per creare una missione scientifica.
     * @param nomeMissione il nome della missione
     * @param obiettivo l'obiettivo scientifico della missione
     */
    public MissioneScientifica(String nomeMissione, String obiettivo) {
        super(nomeMissione); // Chiama il costruttore della classe padre
        this.obiettivo = obiettivo;
    }
    
    /**
     * Override del metodo stampaDettagli() per includere l'obiettivo scientifico.
     */
    @Override
    public void stampaDettagli() {
        super.stampaDettagli(); // Chiama il metodo della classe padre
        System.out.println("  Tipo: Missione Scientifica");
        System.out.println("  Obiettivo: " + obiettivo);
    }
    
    /**
     * Getter per l'obiettivo scientifico.
     * @return l'obiettivo scientifico
     */
    public String getObiettivo() {
        return obiettivo;
    }
    
    /**
     * Setter per l'obiettivo scientifico.
     * @param obiettivo il nuovo obiettivo scientifico
     */
    public void setObiettivo(String obiettivo) {
        this.obiettivo = obiettivo;
    }
    
    /**
     * Metodo specifico per ottenere una descrizione completa della missione scientifica.
     * @return descrizione completa della missione
     */
    public String getDescrizioneCompleta() {
        return "Missione Scientifica '" + getNomeMissione() + "' (ID: " + getIdMissione() + 
               ") - Obiettivo: " + obiettivo;
    }
}