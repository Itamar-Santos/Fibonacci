import java.util.Scanner;

public class FibonacciChecker {

    public static boolean pertenceFibonacci(int n) {
        if (n == 0 || n == 1) {
            return true;
        }

        int anterior = 0;
        int atual = 1;

        while (atual < n) {
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }

        return atual == n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (pertenceFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci!");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }
}