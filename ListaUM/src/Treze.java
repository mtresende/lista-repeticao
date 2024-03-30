import java.util.Scanner;

public class Treze {
    public static void main(String[] args) {
        int base, expoente, resultado = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base: ");
        base = scanner.nextInt();

        resultado = base;

        System.out.print("Digite o expoente: ");
        expoente = scanner.nextInt();

        for (int i = 1; i < expoente; i++) {
            resultado *= base;
        }

        System.out.print("Resultado: " + resultado);

        scanner.close();
    }
}