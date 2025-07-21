package esercizio5;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe di utilità per gestire collezioni di missioni spaziali.
 * Dimostra pattern di design e operazioni avanzate sulle missioni.
 */
public class GestoreMissioni {
    private List<MissioneSpaziale> missioni;
    
    /**
     * Costruttore per creare un nuovo gestore di missioni.
     */
    public GestoreMissioni() {
        this.missioni = new ArrayList<>();
    }
    
    /**
     * Aggiunge una missione alla collezione.
     * @param missione la missione da aggiungere
     */
    public void aggiungiMissione(MissioneSpaziale missione) {
        if (missione != null) {
            missioni.add(missione);
        }
    }
    
    /**
     * Rimuove una missione dalla collezione per ID.
     * @param idMissione l'ID della missione da rimuovere
     * @return true se la missione è stata rimossa, false altrimenti
     */
    public boolean rimuoviMissione(int idMissione) {
        return missioni.removeIf(missione -> missione.getIdMissione() == idMissione);
    }
    
    /**
     * Trova una missione per ID.
     * @param idMissione l'ID della missione da cercare
     * @return la missione trovata o null se non esiste
     */
    public MissioneSpaziale trovaMissione(int idMissione) {
        for (MissioneSpaziale missione : missioni) {
            if (missione.getIdMissione() == idMissione) {
                return missione;
            }
        }
        return null;
    }
    
    /**
     * Ottiene tutte le missioni scientifiche.
     * @return lista delle missioni scientifiche
     */
    public List<MissioneScientifica> getMissioniScientifiche() {
        List<MissioneScientifica> missioniScientifiche = new ArrayList<>();
        for (MissioneSpaziale missione : missioni) {
            if (missione instanceof MissioneScientifica) {
                missioniScientifiche.add((MissioneScientifica) missione);
            }
        }
        return missioniScientifiche;
    }
    
    /**
     * Ottiene tutte le missioni commerciali.
     * @return lista delle missioni commerciali
     */
    public List<MissioneCommerciale> getMissioniCommerciali() {
        List<MissioneCommerciale> missioniCommerciali = new ArrayList<>();
        for (MissioneSpaziale missione : missioni) {
            if (missione instanceof MissioneCommerciale) {
                missioniCommerciali.add((MissioneCommerciale) missione);
            }
        }
        return missioniCommerciali;
    }
    
    /**
     * Conta il numero di missioni per tipo.
     * @return array con [scientifiche, commerciali, altre]
     */
    public int[] contaMissioniPerTipo() {
        int scientifiche = 0;
        int commerciali = 0;
        int altre = 0;
        
        for (MissioneSpaziale missione : missioni) {
            if (missione instanceof MissioneScientifica) {
                scientifiche++;
            } else if (missione instanceof MissioneCommerciale) {
                commerciali++;
            } else {
                altre++;
            }
        }
        
        return new int[]{scientifiche, commerciali, altre};
    }
    
    /**
     * Stampa un report completo di tutte le missioni.
     */
    public void stampaReport() {
        System.out.println("=== REPORT MISSIONI SPAZIALI ===");
        System.out.println("Numero totale missioni gestite: " + missioni.size());
        
        int[] conteggi = contaMissioniPerTipo();
        System.out.println("- Missioni Scientifiche: " + conteggi[0]);
        System.out.println("- Missioni Commerciali: " + conteggi[1]);
        System.out.println("- Altre Missioni: " + conteggi[2]);
        System.out.println();
        
        if (!missioni.isEmpty()) {
            System.out.println("DETTAGLI MISSIONI:");
            for (MissioneSpaziale missione : missioni) {
                missione.stampaDettagli();
                System.out.println();
            }
        }
    }
    
    /**
     * Calcola il costo totale stimato per tutte le missioni commerciali.
     * @param costoBaseMissione il costo base per missione
     * @return il costo totale stimato
     */
    public double calcolaCostoTotaleCommerciali(double costoBaseMissione) {
        double costoTotale = 0;
        for (MissioneCommerciale missione : getMissioniCommerciali()) {
            costoTotale += missione.calcolaCostoStimato(costoBaseMissione);
        }
        return costoTotale;
    }
    
    /**
     * Ottiene la lista di tutte le missioni.
     * @return copia della lista delle missioni
     */
    public List<MissioneSpaziale> getMissioni() {
        return new ArrayList<>(missioni); // Restituisce una copia per sicurezza
    }
    
    /**
     * Verifica se il gestore contiene missioni.
     * @return true se ci sono missioni, false altrimenti
     */
    public boolean hasMissioni() {
        return !missioni.isEmpty();
    }
    
    /**
     * Pulisce tutte le missioni dal gestore.
     */
    public void pulisciMissioni() {
        missioni.clear();
    }
}