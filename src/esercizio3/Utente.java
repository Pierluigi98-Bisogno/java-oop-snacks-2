package esercizio3;

/**
 * Classe Utente che dimostra l'uso di attributi e metodi statici
 * per tenere traccia del numero di istanze create
 */
public class Utente {
    // Attributo di istanza
    private String nome;
    
    // Attributo statico per contare il numero di utenti creati
    private static int numeroUtenti = 0;
    
    // Costruttore
    public Utente(String nome) {
        this.nome = nome;
        numeroUtenti++; // Incrementa il contatore ogni volta che viene creata un'istanza
        System.out.println("Utente creato: " + nome + " (Totale utenti: " + numeroUtenti + ")");
    }
    
    // Getter per il nome
    public String getNome() {
        return nome;
    }
    
    // Setter per il nome
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    // Metodo statico per ottenere il numero totale di utenti
    public static int getNumeroUtenti() {
        return numeroUtenti;
    }
    
    // Metodo per stampare le informazioni dell'utente
    public void stampaInfo() {
        System.out.println("Utente: " + nome);
    }
    
    // Metodo statico per stampare statistiche generali
    public static void stampaStatistiche() {
        System.out.println("=== STATISTICHE UTENTI ===");
        System.out.println("Numero totale di utenti creati: " + numeroUtenti);
    }
    
    // Override del metodo toString per una rappresentazione più leggibile
    @Override
    public String toString() {
        return "Utente{nome='" + nome + "'}";
    }
}