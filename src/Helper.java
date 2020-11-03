import java.util.ArrayList;
import java.util.Arrays;

// Classe de Ajuda, contendo funções estáticas.
public class Helper {

    // Retorna o caractére associado ao bit.
    public static char printBit(boolean b) {
        return b ? 'V' : 'F';
    }

    // Todos os operadores aceitos.
    public static final ArrayList<Character> Operadores = new ArrayList<Character>(Arrays.asList('v', '^', '~'));

    // Todos os operadores com exceção do NÃO.
    public static final ArrayList<Character> OperadoresFiltrados = new ArrayList<Character>(Arrays.asList('v', '^'));
}
