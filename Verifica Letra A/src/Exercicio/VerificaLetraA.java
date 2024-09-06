package Exercicio;

import java.util.Scanner;

public class VerificaLetraA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma string: ");
        String texto = scanner.nextLine();
        
        // Converter toda a string para minúsculas para facilitar a comparação
        texto = texto.toLowerCase();
        
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == 'a') {
                contador++;
            }
        }
        
        if (contador > 0) {
            System.out.println("A letra 'a' aparece " + contador + " vezes na string.");
        } else {
            System.out.println("A letra 'a' não foi encontrada na string.");
        }
        scanner.close();
    }
}
