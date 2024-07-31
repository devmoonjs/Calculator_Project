package calculator;

public class IntroImage {
    private static int lineLength = 7;
    private static String[] W = {
            "*     * ",
            "*     * ",
            "*  *  * ",
            "*  *  * ",
            "*  *  * ",
            "*  *  * ",
            " ** **  "
    };

    private static String[] E = {
            "******* ",
            "*       ",
            "*       ",
            "******* ",
            "*       ",
            "*       ",
            "******* "
    };

    private static String[] L = {
            "*       ",
            "*       ",
            "*       ",
            "*       ",
            "*       ",
            "*       ",
            "******* "
    };

    private static String[] C = {
            "  ***** ",
            " *      ",
            "*       ",
            "*       ",
            "*       ",
            " *      ",
            "  ***** "
    };

    private static String[] O = {
            "  ***   ",
            " *   *  ",
            "*     * ",
            "*     * ",
            "*     * ",
            " *   *  ",
            "  ***   "
    };

    private static String[] M = {
            "*     * ",
            "**   ** ",
            "* * * * ",
            "*  *  * ",
            "*     * ",
            "*     * ",
            "*     * "
    };

    private String[] N = {
            "*     * ",
            "**    * ",
            "* *   * ",
            "*  *  * ",
            "*   * * ",
            "*    ** ",
            "*     * "
    };

    private static String[] calculator = {
            "          *******************",
            "          *    Calculator   *",
            "          *  _____________  *",
            "          * | 0 0 0 0 0 0 | *",
            "          * |_____________| *",
            "          * | 7 | 8 | 9 | /|*",
            "          * |--------------| *",
            "          * | 4 | 5 | 6 | *| *",
            "          * |--------------| *",
            "          * | 1 | 2 | 3 | -| *",
            "          * |--------------| *",
            "          * | 0 | . | = | +| *",
            "          * **************** *"
    };

    public static void introPrint() {
        for (int i = 0; i < lineLength; i++) {
            System.out.print(W[i] + "  "); // W
            System.out.print(E[i] + "  "); // E
            System.out.print(L[i] + "  "); // L
            System.out.print(C[i] + "  "); // C
            System.out.print(O[i] + "  "); // O
            System.out.print(M[i] + "  "); // M
            System.out.println(E[i]);      // E
        }
        System.out.println();
    }

    public static void calculatorPrint() {
        for (String line : calculator) {
            System.out.println(line);
        }
    }
}
