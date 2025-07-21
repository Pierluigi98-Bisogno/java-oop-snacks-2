package esercizio4;

/**
 * Classe Main per testare le funzionalità dell'esercizio 4.
 * Dimostra l'uso di classi astratte, metodi astratti, costanti e il modificatore final.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== ESERCIZIO 4: Classi Astratte e Modificatore Final ===");
        System.out.println();
        
        // Test della costante PI_GRECO
        System.out.println("1. Test della costante PI_GRECO:");
        System.out.println("Valore di PI_GRECO: " + Figura.PI_GRECO);
        System.out.println();
        
        // Test delle classi concrete
        System.out.println("2. Test delle classi concrete:");
        
        // Creazione di un cerchio
        Cerchio cerchio = new Cerchio(5.0);
        System.out.println(cerchio.getDescrizione());
        System.out.println("Area del cerchio: " + cerchio.calcolaArea());
        System.out.println();
        
        // Creazione di un rettangolo
        Rettangolo rettangolo = new Rettangolo(4.0, 6.0);
        System.out.println(rettangolo.getDescrizione());
        System.out.println("Area del rettangolo: " + rettangolo.calcolaArea());
        System.out.println("Perimetro del rettangolo: " + rettangolo.calcolaPerimetro());
        System.out.println();
        
        // Test del polimorfismo
        System.out.println("3. Test del polimorfismo:");
        Figura[] figure = {cerchio, rettangolo};
        
        for (Figura figura : figure) {
            System.out.println(figura.getDescrizione() + " - Area: " + figura.calcolaArea());
        }
        System.out.println();
        
        // Test della classe TestFinal
        System.out.println("4. Test della classe TestFinal (estende Rettangolo):");
        TestFinal testFinal = new TestFinal(3.0, 4.0);
        System.out.println(testFinal.getDescrizioneEstesa());
        System.out.println();
        
        // Test della classe FiguraFinal
        System.out.println("5. Test della classe FiguraFinal:");
        FiguraFinal figuraFinal = new FiguraFinal("Triangolo", 15.5);
        System.out.println(figuraFinal.getDescrizione());
        System.out.println();
        
        // Test della classe TestFiguraFinal (composizione invece di ereditarietà)
        System.out.println("6. Test della classe TestFiguraFinal (composizione):");
        TestFiguraFinal testFiguraFinal = new TestFiguraFinal("Pentagono", 25.0);
        System.out.println(testFiguraFinal.getDescrizioneFigura());
        System.out.println();
        
        // Spiegazioni sui modificatori final
        System.out.println("=== SPIEGAZIONI SUL MODIFICATORE FINAL ===");
        System.out.println();
        
        System.out.println("1. COSTANTI (final su variabili):");
        System.out.println("   - PI_GRECO è dichiarata come 'public static final double'");
        System.out.println("   - Non può essere modificata dopo l'inizializzazione");
        System.out.println("   - È accessibile da tutte le classi senza creare un'istanza");
        System.out.println();
        
        System.out.println("2. METODI FINAL:");
        System.out.println("   - Il metodo calcolaPerimetro() in Rettangolo è dichiarato final");
        System.out.println("   - Non può essere sovrascritto nelle sottoclassi");
        System.out.println("   - Se si tenta di sovrascriverlo in TestFinal, si ottiene un errore di compilazione");
        System.out.println();
        
        System.out.println("3. CLASSI FINAL:");
        System.out.println("   - FiguraFinal è dichiarata come 'public final class'");
        System.out.println("   - Non può essere estesa da altre classi");
        System.out.println("   - Se si tenta di estenderla, si ottiene un errore di compilazione");
        System.out.println("   - Soluzione: usare la composizione invece dell'ereditarietà");
        System.out.println();
        
        System.out.println("4. ESEMPI DI ERRORI (commentati nel codice):");
        System.out.println("   [ERRORE] Tentativo di sovrascrivere metodo final in TestFinal.java");
        System.out.println("   [ERRORE] Tentativo di estendere classe final in TestFiguraFinal.java");
        System.out.println();
        
        System.out.println("=== CONCETTI DIMOSTRATI ===");
        System.out.println("- Classi astratte con metodi astratti");
        System.out.println("- Implementazione di metodi astratti nelle sottoclassi");
        System.out.println("- Uso di costanti (public static final)");
        System.out.println("- Polimorfismo con classi astratte");
        System.out.println("- Effetti del modificatore final su metodi e classi");
        System.out.println("- Composizione come alternativa all'ereditarietà");
    }
}