package esercizio2;

/**
 * Classe ContoBancario con campi privati saldo e numeroConto
 * Dimostra l'importanza dell'incapsulamento per proteggere i dati sensibili
 */
public class ContoBancario {
    private double saldo;
    private String numeroConto;
    
    // Costruttore
    public ContoBancario(String numeroConto, double saldoIniziale) {
        this.numeroConto = numeroConto;
        this.saldo = saldoIniziale >= 0 ? saldoIniziale : 0; // Validazione: saldo non può essere negativo
    }
    
    // Metodo per depositare denaro
    public void deposita(double importo) {
        if (importo > 0) {
            saldo += importo;
            System.out.println("Depositati €" + importo + ". Nuovo saldo: €" + saldo);
        } else {
            System.out.println("Errore: L'importo da depositare deve essere positivo.");
        }
    }
    
    // Metodo per prelevare denaro
    public boolean preleva(double importo) {
        if (importo > 0 && importo <= saldo) {
            saldo -= importo;
            System.out.println("Prelevati €" + importo + ". Nuovo saldo: €" + saldo);
            return true;
        } else if (importo > saldo) {
            System.out.println("Errore: Saldo insufficiente. Saldo attuale: €" + saldo);
            return false;
        } else {
            System.out.println("Errore: L'importo da prelevare deve essere positivo.");
            return false;
        }
    }
    
    // Metodo per ottenere il saldo (getter)
    public double getSaldo() {
        return saldo;
    }
    
    // Getter per il numero di conto
    public String getNumeroConto() {
        return numeroConto;
    }
    
    // Metodo per stampare le informazioni del conto
    public void stampaInfo() {
        System.out.println("Conto: " + numeroConto + ", Saldo: €" + saldo);
    }
}