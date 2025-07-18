package esercizio1;

/**
 * Classe Main per testare le funzionalità di Veicolo e Auto
 */
public class Main {
    public static void main(String[] args) {
        // Creazione di un oggetto Veicolo
        Veicolo veicolo = new Veicolo("Toyota", 2020);
        System.out.println("=== Test Veicolo ===");
        veicolo.stampaInfo();
        
        // Test dei metodi get
        System.out.println("Marca: " + veicolo.getMarca());
        System.out.println("Anno: " + veicolo.getAnno());
        
        // Test dei metodi set
        veicolo.setMarca("Honda");
        veicolo.setAnno(2021);
        System.out.println("\nDopo la modifica:");
        veicolo.stampaInfo();
        
        System.out.println("\n=== Test Auto ===");
        // Creazione di un oggetto Auto
        Auto auto = new Auto("BMW", 2022, 4);
        auto.stampaInfo();
        
        // Test dei metodi get
        System.out.println("Marca: " + auto.getMarca());
        System.out.println("Anno: " + auto.getAnno());
        System.out.println("Numero Porte: " + auto.getNumeroPorte());
        
        // Test dei metodi set
        auto.setMarca("Audi");
        auto.setAnno(2023);
        auto.setNumeroPorte(5);
        System.out.println("\nDopo la modifica:");
        auto.stampaInfo();
    }
}