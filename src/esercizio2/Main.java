package esercizio2;

/**
 * Classe Main per testare ContoBancario e ContoRisparmio
 * Dimostra l'importanza dell'incapsulamento nella programmazione OOP
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== TEST CONTO BANCARIO ===");
        
        // Creazione di un conto bancario
        ContoBancario conto1 = new ContoBancario("IT001234567890", 1000.0);
        conto1.stampaInfo();
        
        // Test operazioni di deposito
        System.out.println("\n--- Test Deposito ---");
        conto1.deposita(500.0);
        conto1.deposita(-100.0); // Test validazione: importo negativo
        
        // Test operazioni di prelievo
        System.out.println("\n--- Test Prelievo ---");
        conto1.preleva(200.0);
        conto1.preleva(2000.0); // Test validazione: saldo insufficiente
        conto1.preleva(-50.0);  // Test validazione: importo negativo
        
        // Test getter
        System.out.println("\n--- Test Getter ---");
        System.out.println("Saldo attuale: €" + conto1.getSaldo());
        System.out.println("Numero conto: " + conto1.getNumeroConto());
        
        System.out.println("\n\n=== TEST CONTO RISPARMIO ===");
        
        // Creazione di un conto risparmio
        ContoRisparmio contoRisparmio = new ContoRisparmio("IT009876543210", 2000.0, 0.03); // 3% di interesse
        contoRisparmio.stampaInfo();
        
        // Test operazioni ereditate
        System.out.println("\n--- Test Operazioni Ereditate ---");
        contoRisparmio.deposita(1000.0);
        contoRisparmio.preleva(500.0);
        
        // Test applicazione interessi
        System.out.println("\n--- Test Applicazione Interessi ---");
        System.out.println("Saldo prima degli interessi: €" + contoRisparmio.getSaldo());
        contoRisparmio.applicaInteressi();
        System.out.println("Saldo dopo gli interessi: €" + contoRisparmio.getSaldo());
        
        // Test modifica tasso di interesse
        System.out.println("\n--- Test Modifica Tasso ---");
        contoRisparmio.setTassoInteresse(0.05); // Cambia al 5%
        contoRisparmio.stampaInfo();
        contoRisparmio.applicaInteressi();
        
        // Test validazione tasso negativo
        contoRisparmio.setTassoInteresse(-0.01); // Test validazione
        
        System.out.println("\n\n=== SPIEGAZIONE INCAPSULAMENTO ===");
        spiegaIncapsulamento();
    }
    
    /**
     * Metodo che spiega l'importanza dell'incapsulamento
     */
    private static void spiegaIncapsulamento() {
        System.out.println("\n🔒 PERCHÉ SERVE L'INCAPSULAMENTO?");
        System.out.println("\n1. PROTEZIONE DEI DATI:");
        System.out.println("   - I campi 'saldo' e 'numeroConto' sono privati");
        System.out.println("   - Non possono essere modificati direttamente dall'esterno");
        System.out.println("   - Questo previene modifiche accidentali o malevole");
        
        System.out.println("\n2. CONTROLLO DELL'ACCESSO:");
        System.out.println("   - I metodi pubblici (deposita, preleva) controllano le operazioni");
        System.out.println("   - Validano gli input (importi positivi, saldo sufficiente)");
        System.out.println("   - Garantiscono che il saldo non diventi mai negativo");
        
        System.out.println("\n3. MANUTENIBILITÀ:");
        System.out.println("   - Possiamo cambiare l'implementazione interna senza affecting il codice esterno");
        System.out.println("   - L'interfaccia pubblica rimane stabile");
        
        System.out.println("\n4. SICUREZZA:");
        System.out.println("   - In un'applicazione bancaria reale, questo previene:");
        System.out.println("     * Modifiche non autorizzate al saldo");
        System.out.println("     * Prelievi superiori al saldo disponibile");
        System.out.println("     * Operazioni con importi negativi");
        
        System.out.println("\n5. ESEMPIO PRATICO:");
        System.out.println("   - SENZA incapsulamento: conto.saldo = -1000000; // DISASTRO!");
        System.out.println("   - CON incapsulamento: conto.preleva(1000000); // Controllato e sicuro");
        
        System.out.println("\n✅ L'incapsulamento è fondamentale per creare software robusto e sicuro!");
    }
}