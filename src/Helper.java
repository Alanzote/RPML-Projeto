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

    // Calcula o Valor de uma Variável, dependendo de seu índice e o número do loop.
    public static boolean GetValue(int idx, int loop) {
        return ((loop >> (idx - 1)) & 1) == 1;
    }

    // Dependendo da operação em um char, calcular o valor entre duas variáveis.
    public static boolean GetOpValue(char Op, boolean Val1, boolean Val2) {
        // Realizar Switch na Operação.
        switch (Op) {
            case 'v': return Val1 || Val2;
            case '^': return Val1 && Val2;
            default: return false;
        }
    }
}
