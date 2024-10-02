public class Calc {
    public static void main(String[] args) {

        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        if (args[0].equals("somar")) {
            som(x, y);
        } else if (args[0].equals("subtrair")) {
            sub(x, y);
        } else if (args[0].equals("multiplicar")) {
            mul(x, y);
        } else if (args[0].equals("dividir")) {
            div(x, y);
        } else {
            System.out.println("Digite somar, subtrair, multiplicar ou dividir.");
        }
    }

    static void som(int x, int y) {
        System.out.println(x + y);
    }

    static void sub(int x, int y) {
        System.out.println(x - y);
    }

    static void mul(int x, int y) {
        System.out.println(x * y);
    }

    static void div(int x, int y) {
        if (y != 0) {
            System.out.println(x / y);
        } else {
            System.out.println("Divisão por zero não é permitida.");
        }
    }
}
