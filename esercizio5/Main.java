package esercizio5;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe Main per testare le funzionalità dell'esercizio 5.
 * Dimostra l'uso di ereditarietà, polimorfismo, campi final e contatori statici.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== ESERCIZIO 5: Sistema di Gestione Missioni Spaziali ===");
        System.out.println();
        
        // Creazione di una lista mista di missioni
        List<MissioneSpaziale> missioni = new ArrayList<>();
        
        // Aggiunta di missioni scientifiche
        missioni.add(new MissioneScientifica("Mars Rover 2024", "Ricerca di vita microbica su Marte"));
        missioni.add(new MissioneScientifica("Europa Explorer", "Studio dell'oceano sotto la superficie di Europa"));
        missioni.add(new MissioneScientifica("Solar Wind Study", "Analisi del vento solare e magnetosfera"));
        
        // Aggiunta di missioni commerciali
        missioni.add(new MissioneCommerciale("Satellite Deploy Alpha", "SpaceX"));
        missioni.add(new MissioneCommerciale("ISS Cargo Mission", "Blue Origin"));
        missioni.add(new MissioneCommerciale("Lunar Mining Prep", "Virgin Galactic"));
        
        // Aggiunta di una missione base (per dimostrare la classe padre)
        missioni.add(new MissioneSpaziale("Emergency Rescue Mission"));
        
        System.out.println("1. LISTA COMPLETA DELLE MISSIONI:");
        System.out.println("=" .repeat(50));
        
        // Stampa di tutte le missioni usando il polimorfismo
        for (int i = 0; i < missioni.size(); i++) {
            System.out.println("[" + (i + 1) + "]:");
            missioni.get(i).stampaDettagli(); // Polimorfismo: chiama il metodo appropriato
            System.out.println();
        }
        
        // Mostra il numero totale di missioni create
        System.out.println("2. STATISTICHE:");
        System.out.println("=" .repeat(30));
        System.out.println("Numero totale di missioni create: " + MissioneSpaziale.getNumeroTotaleMissioni());
        System.out.println();
        
        // Dimostra l'accesso ai metodi specifici delle sottoclassi
        System.out.println("3. DETTAGLI SPECIFICI PER TIPO:");
        System.out.println("=" .repeat(40));
        
        System.out.println("MISSIONI SCIENTIFICHE:");
        for (MissioneSpaziale missione : missioni) {
            if (missione instanceof MissioneScientifica) {
                MissioneScientifica missioneScientifica = (MissioneScientifica) missione;
                System.out.println("- " + missioneScientifica.getDescrizioneCompleta());
            }
        }
        
        System.out.println();
        System.out.println("MISSIONI COMMERCIALI:");
        for (MissioneSpaziale missione : missioni) {
            if (missione instanceof MissioneCommerciale) {
                MissioneCommerciale missioneCommerciale = (MissioneCommerciale) missione;
                System.out.println("- " + missioneCommerciale.getDescrizioneCompleta());
                
                // Dimostra il calcolo del costo per missioni commerciali
                double costoBase = 50000000; // 50 milioni
                double costoTotale = missioneCommerciale.calcolaCostoStimato(costoBase);
                System.out.println("  Costo stimato: $" + String.format("%.2f", costoTotale) + " (markup 20%)");
            }
        }
        
        System.out.println();
        
        // Dimostra la creazione di nuove missioni e l'incremento automatico dell'ID
        System.out.println("4. CREAZIONE DI NUOVE MISSIONI:");
        System.out.println("=" .repeat(40));
        
        MissioneScientifica nuovaMissione1 = new MissioneScientifica("Asteroid Belt Survey", "Mappatura degli asteroidi");
        MissioneCommerciale nuovaMissione2 = new MissioneCommerciale("Starlink Expansion", "Tesla Space Division");
        
        System.out.println("Nuove missioni create:");
        nuovaMissione1.stampaDettagli();
        System.out.println();
        nuovaMissione2.stampaDettagli();
        System.out.println();
        
        System.out.println("Numero totale aggiornato: " + MissioneSpaziale.getNumeroTotaleMissioni());
        System.out.println();
        
        // Dimostra i concetti OOP implementati
        System.out.println("=== CONCETTI OOP DIMOSTRATI ===");
        System.out.println("- EREDITARIETÀ: MissioneScientifica e MissioneCommerciale estendono MissioneSpaziale");
        System.out.println("- POLIMORFISMO: Lista di MissioneSpaziale contiene oggetti di sottoclassi diverse");
        System.out.println("- OVERRIDE: Ogni sottoclasse sovrascrive stampaDettagli() con comportamento specifico");
        System.out.println("- CAMPI FINAL: idMissione è final e non può essere modificato dopo l'inizializzazione");
        System.out.println("- MEMBRI STATICI: Contatore condiviso per generare ID univoci");
        System.out.println("- INCAPSULAMENTO: Campi privati con getter/setter pubblici");
        System.out.println("- INSTANCEOF: Controllo del tipo runtime per accedere a metodi specifici");
        System.out.println("- CASTING: Conversione sicura da superclasse a sottoclasse");
        
        System.out.println();
        System.out.println("=== CARATTERISTICHE TECNICHE ===");
        System.out.println("- ID auto-generati: Ogni missione riceve un ID univoco incrementale");
        System.out.println("- Contatore statico: Condiviso tra tutte le istanze per garantire unicità");
        System.out.println("- Metodi specifici: Ogni sottoclasse aggiunge funzionalità proprie");
        System.out.println("- Gestione memoria: Lista dinamica per contenere missioni di tipi diversi");
    }
}