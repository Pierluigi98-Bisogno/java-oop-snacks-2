package esercizio2;

/**
 * Sottoclasse ContoRisparmio che estende ContoBancario
 * Aggiunge un tasso di interesse e il metodo per applicare gli interessi
 */
public class ContoRisparmio extends ContoBancario {
    private double tassoInteresse; // Tasso di interesse annuale (es. 0.02 = 2%)
    
    // Costruttore
    public ContoRisparmio(String numeroConto, double saldoIniziale, double tassoInteresse) {
        super(numeroConto, saldoIniziale); // Chiama il costruttore della classe padre
        this.tassoInteresse = tassoInteresse >= 0 ? tassoInteresse : 0; // Validazione: tasso non negativo
    }
    
    // Metodo per applicare gli interessi al saldo
    public void applicaInteressi() {
        double interessi = getSaldo() * tassoInteresse;
        deposita(interessi);
        System.out.println("Applicati interessi del " + (tassoInteresse * 100) + "%: €" + interessi);
    }
    
    // Getter per il tasso di interesse
    public double getTassoInteresse() {
        return tassoInteresse;
    }
    
    // Setter per il tasso di interesse
    public void setTassoInteresse(double tassoInteresse) {
        if (tassoInteresse >= 0) {
            this.tassoInteresse = tassoInteresse;
        } else {
            System.out.println("Errore: Il tasso di interesse non può essere negativo.");
        }
    }
    
    // Override del metodo stampaInfo per includere il tasso di interesse
    @Override
    public void stampaInfo() {
        System.out.println("Conto Risparmio: " + getNumeroConto() + 
                          ", Saldo: €" + getSaldo() + 
                          ", Tasso Interesse: " + (tassoInteresse * 100) + "%");
    }
}