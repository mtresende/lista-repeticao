import java.util.Scanner;

public class Doze {
    public static void main(String[] args) {
        int tabuada;
        int resultado = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nGerador de tabuada\n\nDigite o número entre 0 e 10: ");

        do {
            tabuada = scanner.nextInt();

            if (tabuada > 10 || tabuada <= 0) {
                System.out.print("Número inválido, digite número entre 1 e 10: ");
            }
        } while (tabuada > 10 || tabuada <= 0);
        
        System.out.println("\nTabuada de " + tabuada + ":");

        for (int i = 1; i < 11; i++) {
            resultado = tabuada * i;
            
            System.out.println(tabuada + " x " + i + " = " + resultado);
        }

        scanner.close();
    }
}
