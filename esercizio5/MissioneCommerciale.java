package esercizio5;

/**
 * Sottoclasse di MissioneSpaziale per missioni commerciali.
 * Aggiunge un campo specifico per l'azienda partner.
 */
public class MissioneCommerciale extends MissioneSpaziale {
    // Campo aggiuntivo per l'azienda partner
    private String aziendaPartner;
    
    /**
     * Costruttore per creare una missione commerciale.
     * @param nomeMissione il nome della missione
     * @param aziendaPartner l'azienda partner della missione
     */
    public MissioneCommerciale(String nomeMissione, String aziendaPartner) {
        super(nomeMissione); // Chiama il costruttore della classe padre
        this.aziendaPartner = aziendaPartner;
    }
    
    /**
     * Override del metodo stampaDettagli() per includere l'azienda partner.
     */
    @Override
    public void stampaDettagli() {
        super.stampaDettagli(); // Chiama il metodo della classe padre
        System.out.println("  Tipo: Missione Commerciale");
        System.out.println("  Azienda Partner: " + aziendaPartner);
    }
    
    /**
     * Getter per l'azienda partner.
     * @return l'azienda partner
     */
    public String getAziendaPartner() {
        return aziendaPartner;
    }
    
    /**
     * Setter per l'azienda partner.
     * @param aziendaPartner la nuova azienda partner
     */
    public void setAziendaPartner(String aziendaPartner) {
        this.aziendaPartner = aziendaPartner;
    }
    
    /**
     * Metodo specifico per ottenere una descrizione completa della missione commerciale.
     * @return descrizione completa della missione
     */
    public String getDescrizioneCompleta() {
        return "Missione Commerciale '" + getNomeMissione() + "' (ID: " + getIdMissione() + 
               ") - Partner: " + aziendaPartner;
    }
    
    /**
     * Metodo specifico per calcolare il costo stimato della missione.
     * @param costoBase il costo base della missione
     * @return il costo totale stimato
     */
    public double calcolaCostoStimato(double costoBase) {
        // Le missioni commerciali hanno un markup del 20%
        return costoBase * 1.20;
    }
}