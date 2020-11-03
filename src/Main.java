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

            // Switch no tamanho da fórmula.
            switch (Formula.length()) {
                case 1: {
                    // Checar por Operadores.
                    if (Helper.Operadores.contains(Chars[0]))
                        throw new Exception("Índice 0 é um operador, esperáva-se uma variável.");

                    // Chamar Case 1.
                    Tabelas.Case1(Chars[0]);
                } break;
                case 2: {
                    // Verificar Condições.
                    if (Chars[0] != '~')
                        throw new Exception("Índice 0 não é um ~ ou uma variável.");
                    else if (Helper.Operadores.contains(Chars[1]))
                        throw new Exception("Índice 1 é um operador, esperáva-se uma variável.");

                    // Chamar Case 2.
                    Tabelas.Case2(Chars[1]);
                } break;
                case 3: {
                    // Verificar Condições.
                    if (Helper.Operadores.contains(Chars[0]))
                        throw new Exception("Índice 0 é um operador, esperáva-se uma variável.");
                    else if (!Helper.OperadoresFiltrados.contains(Chars[1]))
                        throw new Exception("Índice 1 é uma variável ou ~, esperáva-se um operador.");
                    else if (Helper.Operadores.contains(Chars[2]))
                        throw new Exception("Índice 2 é um operador, esperáva-se uma variável.");
                    else if (Chars[0] == Chars[2])
                        throw new Exception("Índice 2 é igual ao índice 0, esperáva-se variáveis diferentes.");

                    // Chamar Case 3.
                    Tabelas.Case3(Chars[0], Chars[2], Chars[1]);
                } break;
                case 4: {
                    // Verificar Condições.
                    if (Chars[0] == '~') { // Case 4.
                        // Verificar Condições.
                        if (Helper.Operadores.contains(Chars[1]))
                            throw new Exception("Índice 1 é um operador, esperáva-se uma variável.");
                        else if (!Helper.OperadoresFiltrados.contains(Chars[2]))
                            throw new Exception("Índice 2 é uma variável ou ~, esperáva-se um operador.");
                        else if (Helper.Operadores.contains(Chars[3]))
                            throw new Exception("Índice 3 é um operador, esperáva-se uma variável.");
                        else if (Chars[1] == Chars[3])
                            throw new Exception("Índice 1 é igual ao índice 3, esperáva-se variáveis diferentes.");

                        // Chamar Case 4.
                        Tabelas.Case4(Chars[1], Chars[3], Chars[2]);
                    } else if (Helper.OperadoresFiltrados.contains(Chars[0])) {
                        throw new Exception("Índice 0 não é ~ ou uma variável.");
                    } else { // Case 5.
                        // Verificar Condições.
                        if (Helper.Operadores.contains(Chars[0]))
                            throw new Exception("Índice 0 é um operador, esperáva-se uma variável.");
                        else if (!Helper.OperadoresFiltrados.contains(Chars[1]))
                            throw new Exception("Índice 1 é uma variável ou ~, esperáva-se um operador.");
                        else if (Helper.Operadores.contains(Chars[2]))
                            throw new Exception("Índice 3 é um operador, esperáva-se uma variável.");
                        else if (Chars[0] == Chars[2])
                            throw new Exception("Índice 0 é igual ao índice 2, esperáva-se variáveis diferentes.");

                        // Chamar Case 5.
                        Tabelas.Case5(Chars[0], Chars[2], Chars[1]);
                    }
                } break;
                case 5: {
                    // Verificar Condições.
                    if (Chars[0] == '~') { // Case 6
                        // Verificar Condições.
                        if (Helper.Operadores.contains(Chars[1]))
                            throw new Exception("Índice 1 é um operador, esperáva-se uma variável.");
                        else if (!Helper.OperadoresFiltrados.contains(Chars[2]))
                            throw new Exception("Índice 2 é uma variável ou ~, esperáva-se um operador.");
                        else if (Chars[3] != '~')
                            throw new Exception("Índice 3 não é um operador ~.");
                        else if (Helper.Operadores.contains(Chars[4]))
                            throw new Exception("Índice 4 é um operador, esperáva-se uma variável.");
                        else if (Chars[1] == Chars[4])
                            throw new Exception("Índice 1 é igual ao índice 4, esperáva-se variáveis diferentes.");

                        // Chamar Case 6.
                        Tabelas.Case6(Chars[1], Chars[4], Chars[2]);
                    } else if (Helper.OperadoresFiltrados.contains(Chars[0])) {
                        throw new Exception("Índice 0 não é ~ ou uma variável.");
                    } else { // Case 7
                        // Verificar Condições.
                        if (Helper.Operadores.contains(Chars[0]))
                            throw new Exception("Índice 0 é um operador, esperáva-se uma variável.");
                        else if (!Helper.OperadoresFiltrados.contains(Chars[1]))
                            throw new Exception("Índice 1 é uma variável ou ~, esperáva-se um operador.");
                        else if (Helper.Operadores.contains(Chars[2]))
                            throw new Exception("Índice 2 é um operador, esperáva-se uma variável.");
                        else if (!Helper.OperadoresFiltrados.contains(Chars[3]))
                            throw new Exception("Índice 3 é uma variável ou ~, esperáva-se um operador");
                        else if (Helper.Operadores.contains(Chars[4]))
                            throw new Exception("Índice 4 é um operador, esperáva-se uma variável.");
                        else if (Chars[0] == Chars[2])
                            throw new Exception("Índice 0 é igual ao índice 2, esperáva-se variáveis diferentes.");
                        else if (Chars[2] == Chars[4])
                            throw new Exception("Índice 2 é igual ao índice 4, esperáva-se variáveis diferentes.");
                        else if (Chars[0] == Chars[4])
                            throw new Exception("Índice 0 é igual ao índice 4, esperáva-se variáveis diferentes.");

                        // Chamar Case 7.
                        Tabelas.Case7(Chars[0], Chars[2], Chars[4], Chars[1], Chars[3]);
                    }
                }
                case 6: {
                    // Verificar Condições.
                    if (Chars[0] == '~') { // Case 8.
                        // Verificar Condições.
                        if (Helper.Operadores.contains(Chars[1]))
                            throw new Exception("Índice 1 é um operador, esperáva-se uma variável.");
                        else if (!Helper.OperadoresFiltrados.contains(Chars[2]))
                            throw new Exception("Índice 2 é uma variável ou ~, esperáva-se um operador");
                        else if (Helper.Operadores.contains(Chars[3]))
                            throw new Exception("Índice 3 é um operador, esperáva-se uma variável.");
                        else if (!Helper.OperadoresFiltrados.contains(Chars[4]))
                            throw new Exception("Índice 4 é uma variável ou ~, esperáva-se um operador.");
                        else if (Helper.Operadores.contains(Chars[5]))
                            throw new Exception("Índice 5 é um operador, esperáva-se uma variável.");
                        else if (Chars[1] == Chars[3])
                            throw new Exception("Índice 1 é igual ao índice 3, esperáva-se variáveis diferentes.");
                        else if (Chars[3] == Chars[5])
                            throw new Exception("Índice 3 é igual ao índice 5, esperáva-se variáveis diferentes.");
                        else if (Chars[1] == Chars[5])
                            throw new Exception("Índice 1 é igual ao índice 5, esperáva-se variáveis diferentes.");

                        // Chamar Case 8.
                        Tabelas.Case8(Chars[1], Chars[3], Chars[5], Chars[2], Chars[4]);
                    } else if (Helper.OperadoresFiltrados.contains(Chars[0])) {
                        throw new Exception("Índice 0 não é ~ ou uma variável.");
                    } else {
                        // Verificar Condições.
                        if (Chars[2] == '~') { // Case 9.
                            // Verificar Condições.
                            if (Helper.Operadores.contains(Chars[0]))
                                throw new Exception("Índice 0 é um operador, esperáva-se uma variável.");
                            else if (!Helper.OperadoresFiltrados.contains(Chars[1]))
                                throw new Exception("Índice 1 é uma variável ou ~, esperáva-se um operador.");
                            else if (Helper.Operadores.contains(Chars[3]))
                                throw new Exception("Índice 3 é um operador, esperáva-se uma variável.");
                            else if (!Helper.OperadoresFiltrados.contains(Chars[4]))
                                throw new Exception("Índice 4 é uma variável ou ~, esperáva-se um operador.");
                            else if (Helper.Operadores.contains(Chars[5]))
                                throw new Exception("Índice 5 é um operador, esperáva-se uma variável.");
                            else if (Chars[0] == Chars[3])
                                throw new Exception("Índice 0 é igual ao índice 3, esperáva-se variáveis diferentes.");
                            else if (Chars[3] == Chars[5])
                                throw new Exception("Índice 3 é igual ao índice 5, esperáva-se variáveis diferentes.");
                            else if (Chars[0] == Chars[5])
                                throw new Exception("Índice 0 é igual ao índice 5, esperáva-se variáveis diferentes.");

                            // Chamar Case 9.
                            Tabelas.Case9(Chars[0], Chars[3], Chars[5], Chars[1], Chars[4]);
                        } else { // Case 10.
                            // Verificar Condições.
                            if (Helper.Operadores.contains(Chars[0]))
                                throw new Exception("Índice 0 é um operador, esperáva-se uma variável.");
                            else if (!Helper.OperadoresFiltrados.contains(Chars[1]))
                                throw new Exception("Índice 1 é uma variável ou ~, esperáva-se um operador.");
                            else if (Helper.Operadores.contains(Chars[2]))
                                throw new Exception("Índice 2 é um operador, esperáva-se uma variável.");
                            else if (!Helper.OperadoresFiltrados.contains(Chars[3]))
                                throw new Exception("Índice 3 é uma variável ou ~, esperáva-se um operador.");
                            else if (Chars[4] != '~')
                                throw new Exception("Índice 4 é um operador ou variável, esperáva-se ~.");
                            else if (Helper.Operadores.contains(Chars[5]))
                                throw new Exception("Índice 5 é um operador, esperáva-se uma variável.");
                            else if (Chars[0] == Chars[2])
                                throw new Exception("Índice 0 é igual ao índice 3, esperáva-se variáveis diferentes.");
                            else if (Chars[2] == Chars[5])
                                throw new Exception("Índice 3 é igual ao índice 5, esperáva-se variáveis diferentes.");
                            else if (Chars[0] == Chars[5])
                                throw new Exception("Índice 0 é igual ao índice 5, esperáva-se variáveis diferentes.");

                            // Chamar Case 10.
                            Tabelas.Case10(Chars[0], Chars[3], Chars[5], Chars[1], Chars[3]);
                        }
                    }
                } break;
                case 7: {
                    if (Chars[0] == '~') {
                        if (Chars[3] == '~') { // Case 11.

                        } else { // Case 12.

                        }
                    } else if (Helper.OperadoresFiltrados.contains(Chars[0])) {
                        throw new Exception("Índice 0 não é ~ ou uma variável.");
                    } else { // Case 13.
                        // Verificar Condições.
                        if (Helper.Operadores.contains(Chars[0]))
                            throw new Exception("Índice 0 é um operador, esperáva-se uma variável.");
                        else if (!Helper.OperadoresFiltrados.contains(Chars[1]))
                            throw new Exception("Índice 1 é uma variável ou ~, esperáva-se um operador.");
                        else if (Chars[2] != '~')
                            throw new Exception("Índice 2 é um operador ou variável, esperáva-se ~.");
                        else if (Helper.Operadores.contains(Chars[3]))
                            throw new Exception("Índice 3 é um operador, esperáva-se uma variável.");
                        else if (!Helper.OperadoresFiltrados.contains(Chars[4]))
                            throw new Exception("Índice 4 é uma variável ou ~, esperáva-se um operador.");
                        else if (Chars[5] != '~')
                            throw new Exception("Índice 5 é um operador ou variável, esperáva-se ~.");
                        else if (Helper.Operadores.contains(Chars[6]))
                            throw new Exception("Índice 6 é um operador, esperáva-se uma variável.");
                        else if (Chars[0] == Chars[3])
                            throw new Exception("Índice 0 é igual ao índice 3, esperáva-se variáveis diferentes.");
                        else if (Chars[3] == Chars[6])
                            throw new Exception("Índice 3 é igual ao índice 6, esperáva-se variáveis diferentes.");
                        else if (Chars[0] == Chars[6])
                            throw new Exception("Índice 0 é igual ao índice 6, esperáva-se variáveis diferentes.");

                        // Chamar Case 13.
                        Tabelas.Case13(Chars[0], Chars[3], Chars[6], Chars[1], Chars[4]);
                    }
                } break;
                case 8: {
                    // Verificar Condições.
                    if (Chars[0] != '~')
                        throw new Exception("Índice 0 não é um operador ~.");
                    else if (Helper.Operadores.contains(Chars[1]))
                        throw new Exception("Índice 1 é um operador, esperáva-se uma variável.");
                    else if (!Helper.OperadoresFiltrados.contains(Chars[2]))
                        throw new Exception("Índice 2 é uma variável ou ~, esperáva-se um operador.");
                    else if (Chars[3] != '~')
                        throw new Exception("Índice 3 não é um operador ~.");
                    else if (Helper.Operadores.contains(Chars[4]))
                        throw new Exception("Índice 4 é um operador, esperáva-se uma variável.");
                    else if (!Helper.OperadoresFiltrados.contains(Chars[5]))
                        throw new Exception("Índice 5 é uma variável ou ~, esperáva-se um operador.");
                    else if (Chars[6] != '~')
                        throw new Exception("Índice 6 não é um operador ~.");
                    else if (Helper.Operadores.contains(Chars[7]))
                        throw new Exception("Índice 7 é um operador, esperáva-se uma variável.");
                    else if (Chars[1] == Chars[4])
                        throw new Exception("Índice 1 é igual ao índice 4, esperáva-se variáveis diferentes.");
                    else if (Chars[4] == Chars[7])
                        throw new Exception("Índice 4 é igual ao índice 7, esperáva-se variáveis diferentes.");
                    else if (Chars[1] == Chars[7])
                        throw new Exception("Índice 1 é igual ao índice 7, esperáva-se variáveis diferentes.");

                    // Chamar Case 14.
                    Tabelas.Case14(Chars[1], Chars[4], Chars[7], Chars[2], Chars[5]);
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
