package questoes;

import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        
        scanner.close();
        
        String original = scanner.nextLine();
        
        String invertida = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            invertida += original.charAt(i);
        }
        System.out.println("String invertida: " + invertida);
    }

}
