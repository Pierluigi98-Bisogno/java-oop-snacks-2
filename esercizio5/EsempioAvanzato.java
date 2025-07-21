package esercizio5;

import java.util.List;

/**
 * Esempio avanzato che dimostra l'uso del GestoreMissioni
 * e funzionalità più complesse del sistema di gestione missioni.
 */
public class EsempioAvanzato {
    
    public static void main(String[] args) {
        System.out.println("=== ESEMPIO AVANZATO - GESTORE MISSIONI ===");
        System.out.println();
        
        // Creo un gestore di missioni
        GestoreMissioni gestore = new GestoreMissioni();
        
        // Aggiungo diverse missioni
        System.out.println("1. CREAZIONE E AGGIUNTA MISSIONI:");
        
        MissioneScientifica mars2024 = new MissioneScientifica("Mars Explorer 2024", "Studio della geologia marziana");
        MissioneCommerciale starlink = new MissioneCommerciale("Starlink Deployment", "SpaceX");
        MissioneScientifica hubble = new MissioneScientifica("Hubble Maintenance", "Manutenzione telescopio spaziale");
        MissioneCommerciale tourism = new MissioneCommerciale("Space Tourism Alpha", "Blue Origin");
        
        gestore.aggiungiMissione(mars2024);
        gestore.aggiungiMissione(starlink);
        gestore.aggiungiMissione(hubble);
        gestore.aggiungiMissione(tourism);
        
        System.out.println("Missioni aggiunte al gestore: " + gestore.getMissioni().size());
        System.out.println();
        
        // Stampo report completo
        System.out.println("2. REPORT COMPLETO:");
        gestore.stampaReport();
        
        // Filtro per tipo
        System.out.println("3. FILTRI PER TIPO:");
        
        List<MissioneScientifica> scientifiche = gestore.getMissioniScientifiche();
        System.out.println("Missioni Scientifiche trovate: " + scientifiche.size());
        for (MissioneScientifica missione : scientifiche) {
            System.out.println("  - " + missione.getNomeMissione() + " (Obiettivo: " + missione.getObiettivo() + ")");
        }
        System.out.println();
        
        List<MissioneCommerciale> commerciali = gestore.getMissioniCommerciali();
        System.out.println("Missioni Commerciali trovate: " + commerciali.size());
        for (MissioneCommerciale missione : commerciali) {
            System.out.println("  - " + missione.getNomeMissione() + " (Partner: " + missione.getAziendaPartner() + ")");
        }
        System.out.println();
        
        // Calcolo costi
        System.out.println("4. CALCOLO COSTI:");
        double costoBase = 50000000.0; // 50 milioni
        double costoTotale = gestore.calcolaCostoTotaleCommerciali(costoBase);
        System.out.println("Costo base per missione: €" + String.format("%.2f", costoBase));
        System.out.println("Costo totale missioni commerciali: €" + String.format("%.2f", costoTotale));
        System.out.println();
        
        // Ricerca per ID
        System.out.println("5. RICERCA PER ID:");
        int idDaCercare = starlink.getIdMissione();
        MissioneSpaziale trovata = gestore.trovaMissione(idDaCercare);
        if (trovata != null) {
            System.out.println("Missione trovata con ID " + idDaCercare + ":");
            trovata.stampaDettagli();
        } else {
            System.out.println("Nessuna missione trovata con ID " + idDaCercare);
        }
        System.out.println();
        
        // Rimozione missione
        System.out.println("6. RIMOZIONE MISSIONE:");
        int idDaRimuovere = hubble.getIdMissione();
        boolean rimossa = gestore.rimuoviMissione(idDaRimuovere);
        System.out.println("Rimozione missione ID " + idDaRimuovere + ": " + (rimossa ? "SUCCESSO" : "FALLITA"));
        System.out.println("Missioni rimanenti: " + gestore.getMissioni().size());
        System.out.println();
        
        // Conteggio finale
        System.out.println("7. STATISTICHE FINALI:");
        int[] conteggi = gestore.contaMissioniPerTipo();
        System.out.println("Distribuzione finale:");
        System.out.println("  - Scientifiche: " + conteggi[0]);
        System.out.println("  - Commerciali: " + conteggi[1]);
        System.out.println("  - Altre: " + conteggi[2]);
        System.out.println();
        
        // Dimostrazione polimorfismo avanzato
        System.out.println("8. POLIMORFISMO AVANZATO:");
        System.out.println("Iterazione polimorfica su tutte le missioni:");
        for (MissioneSpaziale missione : gestore.getMissioni()) {
            System.out.print("[" + missione.getClass().getSimpleName() + "] ");
            
            // Uso instanceof per accedere a metodi specifici
            if (missione instanceof MissioneScientifica) {
                MissioneScientifica ms = (MissioneScientifica) missione;
                System.out.println(ms.getDescrizioneCompleta());
            } else if (missione instanceof MissioneCommerciale) {
                MissioneCommerciale mc = (MissioneCommerciale) missione;
                System.out.println(mc.getDescrizioneCompleta());
            } else {
                System.out.println(missione.getNomeMissione());
            }
        }
        System.out.println();
        
        // Informazioni globali
        System.out.println("9. INFORMAZIONI GLOBALI:");
        System.out.println("Numero totale di missioni create nel sistema: " + MissioneSpaziale.getNumeroTotaleMissioni());
        System.out.println("Missioni attualmente gestite: " + gestore.getMissioni().size());
        
        System.out.println();
        System.out.println("=== FINE ESEMPIO AVANZATO ===");
    }
}