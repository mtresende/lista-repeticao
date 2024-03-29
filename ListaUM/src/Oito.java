import java.util.Scanner;

public class Oito {
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

        int soma = (num1 + num2 + num3 + num4 + num5);
        int media = soma / 5;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

        scanner.close();
    }
}