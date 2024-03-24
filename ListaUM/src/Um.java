import java.util.Scanner;

public class Um {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int nota;

        do {
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = scanner.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida. Por favor digite novamente.");
            }
        }
        while (nota < 0 || nota > 10);

        scanner.close();
        
    }
}
