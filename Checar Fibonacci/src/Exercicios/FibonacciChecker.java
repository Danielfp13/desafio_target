package Exercicios;

import java.util.Scanner;

public class FibonacciChecker {

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

    // Método para verificar se um número pertence à sequência de Fibonacci
    public static boolean isFibonacci(int n) {
        if (n == 0 || n == 1) {
            return true; // 0 e 1 pertencem à sequência de Fibonacci
        }
        
        int a = 0;
        int b = 1;
        int soma = a + b;
        
        while (soma <= n) {
            if (soma == n) {
                return true;
            }
            a = b;
            b = soma;
            soma = a + b;
        }
        
        return false;
    }
}

