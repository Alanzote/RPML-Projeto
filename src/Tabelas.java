// Classe Tabelas, onde temos todas as funções.
public class Tabelas {

    // Imprime a tabela verdade do Case 1.
    public static void Case1(char Var) {
        // Header.
        System.out.println("+---+");
        System.out.println("| " + Var + " |");
        System.out.println("+---+");

        // Loop para cada Linha da Tabela.
        for (int i = 0; i < 2; i++) {
            // Pegar Valor da Varíavel.
            boolean ValVar1 = Helper.GetValue(1, i);

            // Imprimir Linha.
            System.out.println("| " + Helper.printBit(ValVar1) + " |");
        }

        // Terminar Tabela Verdade.
        System.out.println("+---+");
    }

    // Imprime a tabela verdade do Case 2.
    public static void Case2(char Var) {
        // Header.
        System.out.println("+-----+");
        System.out.println("| ~" + Var + "  |");
        System.out.println("+-----+");

        // Loop para cada Linha da Tabela.
        for (int i = 0; i < 2; i++) {
            // Pegar Valor da Varíavel.
            boolean ValVar1 = !Helper.GetValue(1, i);

            // Imprimir Linha.
            System.out.println("|  " + Helper.printBit(ValVar1) + "  |");
        }

        // Terminar Tabela Verdade.
        System.out.println("+-----+");
    }

    // Imprime a tabela verdade do Case 3.
    public static void Case3(char Var1, char Var2, char Op) {
        // Header.
        System.out.println("+---+---+-------+");
        System.out.println("| " + Var1 + " | " + Var2 + " | " + Var1 + " " + Op + " " + Var2 + " |");
        System.out.println("+---+---+-------+");

        // Loop para cada Linha da Tabela.
        for (int i = 0; i < 4; i++) {
            // Pegar Valor da Variável 1 e 2.
            boolean ValVar1 = Helper.GetValue(1, i);
            boolean ValVar2 = Helper.GetValue(2, i);

            // Valor Operação.
            boolean ValOp1 = Helper.GetOpValue(Op, ValVar1, ValVar2);

            // Imprimir Linha.
            System.out.println("| " + Helper.printBit(ValVar1) + " | " + Helper.printBit(ValVar2) + " |   " + Helper.printBit(ValOp1) + "   |");
        }

        // Terminar Tabela Verdade.
        System.out.println("+---+---+-------+");
    }

    // Imprime a tabela verdade do Case 4.
    public static void Case4(char Var1, char Var2, char Op) {
        // Header.
        System.out.println("+-----+---+---------+");
        System.out.println("| ~" + Var1 + "  | " + Var2 + " | ~" + Var1 + " " + Op + " " + Var2 + "  |");
        System.out.println("+-----+---+---------+");

        // Loop para cada Linha da Tabela.
        for (int i = 0; i < 4; i++) {
            // Pegar Valor da Variável 1 e 2.
            boolean ValVar1 = !Helper.GetValue(1, i);
            boolean ValVar2 = Helper.GetValue(2, i);

            // Valor Operação.
            boolean ValOp1 = Helper.GetOpValue(Op, ValVar1, ValVar2);

            // Imprimir Linha.
            System.out.println("|  " + Helper.printBit(ValVar1) + "  | " + Helper.printBit(ValVar2) + " |    " + Helper.printBit(ValOp1) + "    |");
        }

        // Terminar Tabela Verdade.
        System.out.println("+-----+---+---------+");
    }

    // Imprime a tabela verdade do Case 5.
    public static void Case5(char Var1, char Var2, char Op) {
        // Header.
        System.out.println("+---+-----+--------+");
        System.out.println("| " + Var1 + " | ~" + Var2 + "  | " + Var1 + " " + Op + " ~" + Var2 + " |");
        System.out.println("+---+-----+--------+");

        // Loop para cada Linha da Tabela.
        for (int i = 0; i < 4; i++) {
            // Pegar Valor da Variável 1 e 2.
            boolean ValVar1 = Helper.GetValue(1, i);
            boolean ValVar2 = !Helper.GetValue(2, i);

            // Valor Operação.
            boolean ValOp1 = Helper.GetOpValue(Op, ValVar1, ValVar2);

            // Imprimir Linha.
            System.out.println("| " + Helper.printBit(ValVar1) + " |  " + Helper.printBit(ValVar2) + "  |   " + Helper.printBit(ValOp1) + "    |");
        }

        // Terminar Tabela Verdade.
        System.out.println("+---+-----+--------+");
    }

    // Imprime a tabela verdade do Case 6.
    public static void Case6(char Var1, char Var2, char Op) {
        // Header.
        System.out.println("+-----+-----+---------+");
        System.out.println("| ~" + Var1 + "  | ~" + Var2 + "  | ~" + Var1 + " " + Op + " ~" + Var2 + " |");
        System.out.println("+-----+-----+---------+");

        // Loop para cada Linha da Tabela.
        for (int i = 0; i < 4; i++) {
            // Pegar Valor da Variável 1 e 2.
            boolean ValVar1 = !Helper.GetValue(1, i);
            boolean ValVar2 = !Helper.GetValue(2, i);

            // Valor Operação.
            boolean ValOp1 = Helper.GetOpValue(Op, ValVar1, ValVar2);

            // Imprimir Linha.
            System.out.println("|  " + Helper.printBit(ValVar1) + "  |  " + Helper.printBit(ValVar2) + "  |    " + Helper.printBit(ValOp1) + "    |");
        }

        // Terminar Tabela Verdade.
        System.out.println("+-----+-----+---------+");
    }

    // Imprime a tabela verdade do Case 7.
    public static void Case7(char Var1, char Var2, char Var3, char Op1, char Op2) {
        // Header.
        System.out.println("+---+---+---+-----------+");
        System.out.println("| " + Var1 + " | " + Var2 + " | " + Var3 + " | " + Var1 + " " + Op1 + " " + Var2 + " " + Op2 + " " + Var3 + " |");
        System.out.println("+---+---+---+-----------+");

        // Loop para cada Linha da Tabela.
        for (int i = 0; i < 8; i++) {
            // Pegar Valor da Variável 1 e 2.
            boolean ValVar1 = Helper.GetValue(1, i);
            boolean ValVar2 = Helper.GetValue(2, i);
            boolean ValVar3 = Helper.GetValue(3, i);

            // Valor Operação.
            boolean ValOp1 = Helper.GetOpValue(Op1, ValVar1, ValVar2);
            boolean ValOp2 = Helper.GetOpValue(Op2, ValOp1, ValVar3);

            // Imprimir Linha.
            System.out.println("| " + Helper.printBit(ValVar1) + " | " + Helper.printBit(ValVar2) + " | " + Helper.printBit(ValVar3) + " |     " + Helper.printBit(ValOp2) + "     |");
        }

        // Terminar Tabela Verdade.
        System.out.println("+---+---+---+-----------+");
    }

    // Imprime a tabela verdade do Case 8.
    public static void Case8(char Var1, char Var2, char Var3, char Op1, char Op2) {
        // Header.
        System.out.println("+-----+---+---+-------------+");
        System.out.println("| ~" + Var1 + "  | " + Var2 + " | " + Var3 + " | ~" + Var1 + " " + Op1 + " " + Var2 + " " + Op2 + " " + Var3 + "  |");
        System.out.println("+-----+---+---+-------------+");

        // Loop para cada Linha da Tabela.
        for (int i = 0; i < 8; i++) {
            // Pegar Valor da Variável 1 e 2.
            boolean ValVar1 = !Helper.GetValue(1, i);
            boolean ValVar2 = Helper.GetValue(2, i);
            boolean ValVar3 = Helper.GetValue(3, i);

            // Valor Operação.
            boolean ValOp1 = Helper.GetOpValue(Op1, ValVar1, ValVar2);
            boolean ValOp2 = Helper.GetOpValue(Op2, ValOp1, ValVar3);

            // Imprimir Linha.
            System.out.println("|  " + Helper.printBit(ValVar1) + "  | " + Helper.printBit(ValVar2) + " | " + Helper.printBit(ValVar3) + " |      " + Helper.printBit(ValOp2) + "      |");
        }

        // Terminar Tabela Verdade.
        System.out.println("+-----+---+---+-------------+");
    }

    // Imprime a tabela verdade do Case 9.
    public static void Case9(char Var1, char Var2, char Var3, char Op1, char Op2) {
        // Header.
        System.out.println("+---+-----+---+-------------+");
        System.out.println("| " + Var1 + " | ~" + Var2 + "  | " + Var3 + " | " + Var1 + " " + Op1 + " ~" + Var2 + " " + Op2 + " " + Var3 + "  |");
        System.out.println("+---+-----+---+-------------+");

        // Loop para cada Linha da Tabela.
        for (int i = 0; i < 8; i++) {
            // Pegar Valor da Variável 1 e 2.
            boolean ValVar1 = Helper.GetValue(1, i);
            boolean ValVar2 = !Helper.GetValue(2, i);
            boolean ValVar3 = Helper.GetValue(3, i);

            // Valor Operação.
            boolean ValOp1 = Helper.GetOpValue(Op1, ValVar1, ValVar2);
            boolean ValOp2 = Helper.GetOpValue(Op2, ValOp1, ValVar3);

            // Imprimir Linha.
            System.out.println("| " + Helper.printBit(ValVar1) + " |  " + Helper.printBit(ValVar2) + "  | " + Helper.printBit(ValVar3) + " |      " + Helper.printBit(ValOp2) + "      |");
        }

        // Terminar Tabela Verdade.
        System.out.println("+---+-----+---+-------------+");
    }

    // Imprime a tabela verdade do Case 10.
    public static void Case10(char Var1, char Var2, char Var3, char Op1, char Op2) {
        // Header.
        System.out.println("+---+---+-----+-------------+");
        System.out.println("| " + Var1 + " | " + Var2 + " | ~" + Var3 + "  | " + Var1 + " " + Op1 + " " + Var2 + " " + Op2 + " ~" + Var3 + "  |");
        System.out.println("+---+---+-----+-------------+");

        // Loop para cada Linha da Tabela.
        for (int i = 0; i < 8; i++) {
            // Pegar Valor da Variável 1 e 2.
            boolean ValVar1 = Helper.GetValue(1, i);
            boolean ValVar2 = Helper.GetValue(2, i);
            boolean ValVar3 = !Helper.GetValue(3, i);

            // Valor Operação.
            boolean ValOp1 = Helper.GetOpValue(Op1, ValVar1, ValVar2);
            boolean ValOp2 = Helper.GetOpValue(Op2, ValOp1, ValVar3);

            // Imprimir Linha.
            System.out.println("| " + Helper.printBit(ValVar1) + " | " + Helper.printBit(ValVar2) + " |  " + Helper.printBit(ValVar3) + "  |      " + Helper.printBit(ValOp2) + "      |");
        }

        // Terminar Tabela Verdade.
        System.out.println("+---+---+-----+-------------+");
    }

    // Imprime a tabela verdade do Case 11.
    public static void Case11(char Var1, char Var2, char Var3, char Op1, char Op2) {
        // Header.
        System.out.println("+-----+-----+---+-------------+");
        System.out.println("| ~" + Var1 + "  | ~" + Var2 + "  | " + Var3 + " | ~" + Var1 + " " + Op1 + " ~" + Var2 + " " + Op2 + " " + Var3 + " |");
        System.out.println("+-----+-----+---+-------------+");

        // Loop para cada Linha da Tabela.
        for (int i = 0; i < 8; i++) {
            // Pegar Valor da Variável 1 e 2.
            boolean ValVar1 = !Helper.GetValue(1, i);
            boolean ValVar2 = !Helper.GetValue(2, i);
            boolean ValVar3 = Helper.GetValue(3, i);

            // Valor Operação.
            boolean ValOp1 = Helper.GetOpValue(Op1, ValVar1, ValVar2);
            boolean ValOp2 = Helper.GetOpValue(Op2, ValOp1, ValVar3);

            // Imprimir Linha.
            System.out.println("|  " + Helper.printBit(ValVar1) + "  |  " + Helper.printBit(ValVar2) + "  | " + Helper.printBit(ValVar3) + " |      " + Helper.printBit(ValOp2) + "      |");
        }

        // Terminar Tabela Verdade.
        System.out.println("+-----+-----+---+-------------+");
    }

    // Imprime a tabela verdade do Case 12.
    public static void Case12(char Var1, char Var2, char Var3, char Op1, char Op2) {
        // Header.
        System.out.println("+-----+---+-----+-------------+");
        System.out.println("| ~" + Var1 + "  | " + Var2 + " | ~" + Var3 + "  | ~" + Var1 + " " + Op1 + " " + Var2 + " " + Op2 + " ~" + Var3 + " |");
        System.out.println("+-----+---+-----+-------------+");

        // Loop para cada Linha da Tabela.
        for (int i = 0; i < 8; i++) {
            // Pegar Valor da Variável 1 e 2.
            boolean ValVar1 = !Helper.GetValue(1, i);
            boolean ValVar2 = Helper.GetValue(2, i);
            boolean ValVar3 = !Helper.GetValue(3, i);

            // Valor Operação.
            boolean ValOp1 = Helper.GetOpValue(Op1, ValVar1, ValVar2);
            boolean ValOp2 = Helper.GetOpValue(Op2, ValOp1, ValVar3);

            // Imprimir Linha.
            System.out.println("|  " + Helper.printBit(ValVar1) + "  | " + Helper.printBit(ValVar2) + " |  " + Helper.printBit(ValVar3) + "  |      " + Helper.printBit(ValOp2) + "      |");
        }

        // Terminar Tabela Verdade.
        System.out.println("+-----+---+-----+-------------+");
    }

    // Imprime a tabela verdade do Case 13.
    public static void Case13(char Var1, char Var2, char Var3, char Op1, char Op2) {
        // Header.
        System.out.println("+---+-----+-----+-------------+");
        System.out.println("| " + Var1 + " | ~" + Var2 + "  | ~" + Var3 + "  | " + Var1 + " " + Op1 + " ~" + Var2 + " " + Op2 + " ~" + Var3 + " |");
        System.out.println("+---+-----+-----+-------------+");

        // Loop para cada Linha da Tabela.
        for (int i = 0; i < 8; i++) {
            // Pegar Valor da Variável 1 e 2.
            boolean ValVar1 = Helper.GetValue(1, i);
            boolean ValVar2 = !Helper.GetValue(2, i);
            boolean ValVar3 = !Helper.GetValue(3, i);

            // Valor Operação.
            boolean ValOp1 = Helper.GetOpValue(Op1, ValVar1, ValVar2);
            boolean ValOp2 = Helper.GetOpValue(Op2, ValOp1, ValVar3);

            // Imprimir Linha.
            System.out.println("| " + Helper.printBit(ValVar1) + " |  " + Helper.printBit(ValVar2) + "  |  " + Helper.printBit(ValVar3) + "  |      " + Helper.printBit(ValOp2) + "      |");
        }

        // Terminar Tabela Verdade.
        System.out.println("+---+-----+-----+-------------+");
    }

    // Imprime a tabela verdade do Case 14.
    public static void Case14(char Var1, char Var2, char Var3, char Op1, char Op2) {
        // Header.
        System.out.println("+-----+-----+-----+--------------+");
        System.out.println("| ~" + Var1 + "  | ~" + Var2 + "  | ~" + Var3 + "  | ~" + Var1 + " " + Op1 + " ~" + Var2 + " " + Op2 + " ~" + Var3 + " |");
        System.out.println("+-----+-----+-----+--------------+");

        // Loop para cada Linha da Tabela.
        for (int i = 0; i < 8; i++) {
            // Pegar Valor da Variável 1 e 2.
            boolean ValVar1 = !Helper.GetValue(1, i);
            boolean ValVar2 = !Helper.GetValue(2, i);
            boolean ValVar3 = !Helper.GetValue(3, i);

            // Valor Operação.
            boolean ValOp1 = Helper.GetOpValue(Op1, ValVar1, ValVar2);
            boolean ValOp2 = Helper.GetOpValue(Op2, ValOp1, ValVar3);

            // Imprimir Linha.
            System.out.println("|  " + Helper.printBit(ValVar1) + "  |  " + Helper.printBit(ValVar2) + "  |  " + Helper.printBit(ValVar3) + "  |       " + Helper.printBit(ValOp2) + "      |");
        }

        // Terminar Tabela Verdade.
        System.out.println("+-----+-----+-----+--------------+");
    }
}
