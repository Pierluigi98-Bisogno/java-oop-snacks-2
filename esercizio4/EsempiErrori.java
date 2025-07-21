package esercizio4;

/**
 * Questo file contiene esempi di codice che genererebbe errori di compilazione.
 * Gli esempi sono commentati per permettere la compilazione del progetto.
 * 
 * Per testare gli errori, decommentare uno degli esempi alla volta e provare a compilare.
 */

// ESEMPIO 1: Tentativo di estendere una classe final
// Questo genererebbe l'errore: "Cannot inherit from final 'esercizio4.FiguraFinal'"
/*
public class TentativoEstensioneFinal extends FiguraFinal {
    public TentativoEstensioneFinal(String tipo, double area) {
        super(tipo, area);
    }
}
*/

// ESEMPIO 2: Tentativo di sovrascrivere un metodo final
// Questo genererebbe l'errore: "'calcolaPerimetro()' cannot override 'calcolaPerimetro()' in 'esercizio4.Rettangolo'; overridden method is final"
/*
public class TentativoSovrascrittura extends Rettangolo {
    public TentativoSovrascrittura(double base, double altezza) {
        super(base, altezza);
    }
    
    @Override
    public double calcolaPerimetro() {
        return 0; // Questo non compilerà!
    }
}
*/

// ESEMPIO 3: Tentativo di modificare una costante final
// Questo genererebbe l'errore: "Cannot assign a value to final variable 'PI_GRECO'"
/*
public class TentativoModificaCostante {
    public void modificaCostante() {
        Figura.PI_GRECO = 3.14159; // Questo non compilerà!
    }
}
*/

public class EsempiErrori {
    public static void main(String[] args) {
        System.out.println("=== ESEMPI DI ERRORI CON IL MODIFICATORE FINAL ===");
        System.out.println();
        
        System.out.println("Questo file contiene esempi commentati di codice che genererebbe errori:");
        System.out.println("1. Tentativo di estendere una classe final (FiguraFinal)");
        System.out.println("2. Tentativo di sovrascrivere un metodo final (calcolaPerimetro)");
        System.out.println("3. Tentativo di modificare una costante final (PI_GRECO)");
        System.out.println();
        
        System.out.println("Per testare gli errori:");
        System.out.println("- Decommentare uno degli esempi nel file EsempiErrori.java");
        System.out.println("- Provare a compilare con: javac esercizio4/*.java");
        System.out.println("- Osservare l'errore di compilazione");
        System.out.println("- Ricommentare il codice per ripristinare la compilazione");
    }
}