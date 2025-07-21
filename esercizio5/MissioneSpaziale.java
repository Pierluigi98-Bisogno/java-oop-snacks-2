package esercizio5;

/**
 * Classe base per rappresentare una missione spaziale.
 * Ogni missione ha un nome e un ID univoco auto-generato.
 */
public class MissioneSpaziale {
    // Campo privato per il nome della missione
    private String nomeMissione;
    
    // Campo final per l'ID della missione (auto-generato)
    private final int idMissione;
    
    // Contatore statico condiviso per generare ID univoci
    private static int contatoreId = 1;
    
    /**
     * Costruttore per creare una nuova missione spaziale.
     * L'ID viene auto-generato usando il contatore statico.
     * @param nomeMissione il nome della missione
     */
    public MissioneSpaziale(String nomeMissione) {
        this.nomeMissione = nomeMissione;
        this.idMissione = contatoreId++; // Assegna ID e incrementa il contatore
    }
    
    /**
     * Metodo per stampare i dettagli della missione.
     * Può essere sovrascritto dalle sottoclassi.
     */
    public void stampaDettagli() {
        System.out.println("Missione: " + nomeMissione + " (ID: " + idMissione + ")");
    }
    
    /**
     * Metodo statico per ottenere il numero totale di missioni create.
     * @return il numero totale di missioni create
     */
    public static int getNumeroTotaleMissioni() {
        return contatoreId - 1; // Sottrae 1 perché il contatore parte da 1
    }
    
    /**
     * Getter per il nome della missione.
     * @return il nome della missione
     */
    public String getNomeMissione() {
        return nomeMissione;
    }
    
    /**
     * Setter per il nome della missione.
     * @param nomeMissione il nuovo nome della missione
     */
    public void setNomeMissione(String nomeMissione) {
        this.nomeMissione = nomeMissione;
    }
    
    /**
     * Getter per l'ID della missione.
     * @return l'ID della missione
     */
    public int getIdMissione() {
        return idMissione;
    }
    
    /**
     * Metodo statico per resettare il contatore (utile per test).
     * ATTENZIONE: Usare solo per scopi di test!
     */
    public static void resetContatore() {
        contatoreId = 1;
    }
}