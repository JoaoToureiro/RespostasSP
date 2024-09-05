package questoes;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        if (isFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }

    public static boolean isFibonacci(int n) {
        if (n == 0 || n == 1) {
            return true;
        }

        int a = 0;
        int b = 1;
        int c = a + b;

        while (c < n) {
            a = b;
            b = c;
            c = a + b;
        }

        return c == n;
    }
}
