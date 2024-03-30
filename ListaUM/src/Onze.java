import java.util.Scanner;

public class Onze {
    public static void main(String[] args) {
        int num1, num2, total = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextInt();
        
        scanner.close();

        if (num1 < num2) {
            for (num1 += 1; num1 < num2; num1++){
                total += num1;
                System.out.print(num1 + " ");

                if (num1 == num2 - 1) {
                    System.out.print("= " + total);

                }
            }
        } else if (num1 > num2) {
            for (num2 += 1; num2 < num1; num2++){
                total += num2;
                System.out.print(num2 + " ");

                if (num2 == num1 - 1){
                    System.out.print("= " + total);
                }
            }
        } else {
            System.out.print("Não existe intervalos entre os números");
        }

        
    }
}
