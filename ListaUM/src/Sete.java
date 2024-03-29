import java.util.Scanner;

public class Sete {
    public static void main(String[] args) {
        int num1, num2, num3, num4, num5;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        num3 = scanner.nextInt();

        System.out.print("Digite o quarto número: ");
        num4 = scanner.nextInt();

        System.out.print("Digite o quinto número: ");
        num5 = scanner.nextInt();

        int valor1 = Math.max(num1, num2);
        int valor2 = Math.max(num3, num4);

        int valor3 = Math.max(valor1, valor2);

        System.out.print("O maior valor é: " + Math.max(valor3, num5));
        
        scanner.close();
    }
}
