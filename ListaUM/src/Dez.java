import java.util.Scanner;

public class Dez {
    public static void main(String[] args) {
        int num1, num2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextInt();

        if (num1 < num2) {
            for (num1 += 1; num1 < num2; num1++){
            System.out.print(num1 + " ");
            }
        } else if (num1 > num2) {
            for (num2 += 1; num2 < num1; num2++){
            System.out.print(num2 + " ");
            }
        } else {
            System.out.print("Não existe intervalos entre os números");
        }
        scanner.close();
    }
}
