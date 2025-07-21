package esercizio3;

/**
 * Classe Main per testare la classe Utente e dimostrare
 * l'uso di attributi e metodi statici
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== TEST CLASSE UTENTE CON ATTRIBUTI STATICI ===");
        
        // Mostra il numero iniziale di utenti (dovrebbe essere 0)
        System.out.println("\nNumero iniziale di utenti: " + Utente.getNumeroUtenti());
        
        System.out.println("\n--- Creazione di 3 utenti ---");
        
        // Creazione del primo utente
        Utente utente1 = new Utente("Mario Rossi");
        System.out.println("Dopo la creazione di " + utente1.getNome() + ": " + Utente.getNumeroUtenti() + " utenti");
        
        // Creazione del secondo utente
        Utente utente2 = new Utente("Giulia Bianchi");
        System.out.println("Dopo la creazione di " + utente2.getNome() + ": " + Utente.getNumeroUtenti() + " utenti");
        
        // Creazione del terzo utente
        Utente utente3 = new Utente("Luca Verdi");
        System.out.println("Dopo la creazione di " + utente3.getNome() + ": " + Utente.getNumeroUtenti() + " utenti");
        
        System.out.println("\n--- Riepilogo finale ---");
        
        // Stampa informazioni di tutti gli utenti
        System.out.println("\nUtenti creati:");
        utente1.stampaInfo();
        utente2.stampaInfo();
        utente3.stampaInfo();
        
        // Usa il metodo statico per ottenere il numero totale
        System.out.println("\n🔢 NUMERO TOTALE DI UTENTI: " + Utente.getNumeroUtenti());
        
        // Usa il metodo statico per stampare le statistiche
        System.out.println();
        Utente.stampaStatistiche();
        
        System.out.println("\n--- Test aggiuntivi ---");
        
        // Dimostra che il metodo statico può essere chiamato anche da un'istanza
        // (anche se non è la pratica migliore)
        System.out.println("Numero utenti chiamato da istanza: " + utente1.getNumeroUtenti());
        
        // Crea altri utenti per dimostrare che il contatore continua a funzionare
        System.out.println("\nCreazione di altri utenti...");
        Utente utente4 = new Utente("Anna Neri");
        Utente utente5 = new Utente("Paolo Gialli");
        
        System.out.println("\n🎯 NUMERO FINALE DI UTENTI: " + Utente.getNumeroUtenti());
        
        System.out.println("\n=== SPIEGAZIONE ATTRIBUTI E METODI STATICI ===");
        spiegaStatici();
    }
    
    /**
     * Metodo che spiega l'uso degli attributi e metodi statici
     */
    private static void spiegaStatici() {
        System.out.println("\n📚 COSA SONO GLI ATTRIBUTI E METODI STATICI?");
        
        System.out.println("\n1. ATTRIBUTI STATICI:");
        System.out.println("   - Appartengono alla CLASSE, non alle singole istanze");
        System.out.println("   - Condivisi tra tutte le istanze della classe");
        System.out.println("   - Esistono anche se non è stata creata nessuna istanza");
        System.out.println("   - Esempio: 'numeroUtenti' conta tutte le istanze create");
        
        System.out.println("\n2. METODI STATICI:");
        System.out.println("   - Appartengono alla CLASSE, non alle istanze");
        System.out.println("   - Possono essere chiamati senza creare un oggetto");
        System.out.println("   - Non possono accedere agli attributi di istanza");
        System.out.println("   - Esempio: 'getNumeroUtenti()' restituisce il contatore globale");
        
        System.out.println("\n3. VANTAGGI:");
        System.out.println("   ✅ Condivisione di dati tra tutte le istanze");
        System.out.println("   ✅ Accesso senza creare oggetti");
        System.out.println("   ✅ Utili per contatori, costanti, utility methods");
        System.out.println("   ✅ Risparmio di memoria (una sola copia per classe)");
        
        System.out.println("\n4. ESEMPI PRATICI:");
        System.out.println("   - Contatori di istanze (come in questo esercizio)");
        System.out.println("   - Costanti di classe (Math.PI)");
        System.out.println("   - Metodi di utilità (Math.max(), Integer.parseInt())");
        System.out.println("   - Pattern Singleton");
        
        System.out.println("\n5. SINTASSI:");
        System.out.println("   - Dichiarazione: static int numeroUtenti = 0;");
        System.out.println("   - Accesso: NomeClasse.nomeMetodoStatico()");
        System.out.println("   - Esempio: Utente.getNumeroUtenti()");
        
        System.out.println("\n🎯 Gli attributi e metodi statici sono fondamentali per");
        System.out.println("   gestire dati e comportamenti a livello di classe!");
    }
}