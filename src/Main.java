import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

// Classe Main.
public class Main {

    // Método Main.
    public static void main(String[] args) {
        // Criar Scanner.
        Scanner Scn = new Scanner(System.in);

        // Notificar Esperando Entrada.
        System.out.println("Esperando Entrada...");

        // Receber de Entrada a fórmula.
        String Formula = Scn.next();

        // Tentar...
        try {
            // Verificar tamanho da formula.
            if (Formula.length() <= 0)
                throw new Exception("Entrada é nula.");
            else if (Formula.length() > 8)
                throw new Exception("Entrada é maior que 8.");

            // Quebrar em Caractéres.
            char[] Chars = Formula.toCharArray();

            // Set de Operações/Variáveis.
            HashSet<Character> UniqueChars = new HashSet<Character>();

            // Adicionar ao Set.
            for (char C : Chars)
                if (!Helper.Operadores.contains(C))
                    UniqueChars.add(C);

            // Limitar Variáveis.
            if (UniqueChars.size() > 3)
                throw new Exception("Entrada tem mais do que 3 variáveis.");

            // Switch no tamanho da fórmula.
            switch (Formula.length()) {
                case 1: {
                    // Checar por Operadores.
                    if (Helper.Operadores.contains(Chars[0]))
                        throw new Exception("Índice 0 da entrada é um operador, esperáva-se uma variável.");

                    // Chamar Case 1.
                    Tabelas.Case1(Chars[0]);
                } break;
                case 2: {
                    // Verificar Condições.
                    if (Chars[0] != '~')
                        throw new Exception("Índice 0 da entrada não é um ~ ou uma variável.");
                    else if (Helper.Operadores.contains(Chars[1]))
                        throw new Exception("Índice 1 da entrada é um operador, esperáva-se uma variável.");

                    // Chamar Case 2.
                    Tabelas.Case2(Chars[1]);
                } break;
                case 3: {
                    // Verificar Condições.
                    if (Helper.Operadores.contains(Chars[0]))
                        throw new Exception("Índice 0 da entrada é um operador, esperáva-se uma variável.");
                    else if (!Helper.Operadores.contains(Chars[1]))
                        throw new Exception("Índice 1 de entrada é uma variável, esperáva-se um operador.");
                    else if (Helper.Operadores.contains(Chars[2]))
                        throw new Exception("Índice 2 de entrada é um operador, esperáva-se uma variável.");
                    else if (Chars[0] == Chars[2])
                        throw new Exception("Índice 2 de entrada é igual ao índice 0 de entrada, esperáva-se variáveis diferentes.");

                    // Chamar Case 3.
                    Tabelas.Case3(Chars[0], Chars[2], Chars[1]);
                } break;
            }
        } catch (Exception ex) {
            // Notificar Erro.
            System.out.println("Erro: " + ex.getMessage());
        } finally {
            // Fechar Scanner.
            Scn.close();
        }
    }
}
