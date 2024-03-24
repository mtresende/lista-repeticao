import java.util.Scanner;

public class Tres {
    public static void main(String[] args) throws Exception {
        String nome, sexo, estcivil;
        int idade;
        float salario;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Digite seu nome: ");
            nome = scanner.nextLine();

            if (nome.length() < 4) {
                System.out.println("O nome deve ter mais que 3 letras.");
            }
        }
        while(nome.length() < 4);

        do {
            System.out.print("Digite a sua idade: ");
            idade = scanner.nextInt();

            if (idade < 0 || idade > 150){
                System.out.println("A idade deve ser entre 0 e 150.");
            }
        }
        while(idade < 0 || idade > 150);

        do{
            System.out.print("Digite seu salário: ");
            salario = scanner.nextFloat();

            if (salario <= 0) {
                System.out.println("O salário deve ser maior que 0.");
            }
        }
        while(salario <= 0);

        do {
            System.out.print("Digite seu sexo: ");
            sexo = scanner.next();

            if (!(sexo.equals("m") || sexo.equals("f"))) {
                System.out.println("Digite apenas 'f' para feminino ou 'm' para masculino.");
            }
        } 
        while (!(sexo.equals("m") || sexo.equals("f")));

        do {
            System.out.print("Digite seu estado civil: ");
            estcivil = scanner.next();

            if(!(estcivil.equals("s") || estcivil.equals("c") || estcivil.equals("v") || estcivil.equals("d"))) {
                System.out.println("Digite 's' para solteiro, 'c' para casado, 'v' para viúvo e 'd' para divorciado.");
            }
        }
        while(!(estcivil.equals("s") || estcivil.equals("c") || estcivil.equals("v") || estcivil.equals("d")));

        scanner.close();
    }
}