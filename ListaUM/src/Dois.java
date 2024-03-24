import java.util.Scanner;

public class Dois {
    public static void main(String[] args) throws Exception {
        String senha;
        String usuario;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Digite o usuário: ");
            usuario = scanner.nextLine();

            System.out.print("Digite a senha: ");
            senha = scanner.nextLine();

            if (senha.equals(usuario)) {
                System.out.print("A senha não pode ser igual ao nome de usuário. \n");
            }
        }
        while (senha.equals(usuario));

        scanner.close();
    }
}
