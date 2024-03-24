import java.util.Scanner;

public class Cinco {
    public static void main(String[] args) {
        float a, b, taxa1, taxa2;
        int anos = 0;
        boolean repetir = true;
        
        Scanner scanner = new Scanner(System.in);

        while (repetir) {
            

            do {
                System.out.print("Digite o número de habitantes da pupulação A: ");
                a = scanner.nextFloat();

                if (a <= 0) {
                    System.out.println("O número de habitantes deve ser maior que 0.");
                }
            }
            while (a <= 0);

            do {
                System.out.print("Digite a taxa de crescimento anual da pupulação A: ");
                taxa1 = scanner.nextFloat();

                if(taxa1 <= 0) {
                    System.out.println("A taxa de crescimento deve ser maior que 0.");
                }
            }
            while (taxa1 <= 0);

            do{
                System.out.print("Digite o número de habitantes da pupulação B: ");
                b = scanner.nextFloat();

                if (b <= 0){
                    System.out.println("O número de habitantes deve ser maior que 0.");
                }
            }
            while (b <= 0);

            do {
                System.out.print("Digite a taxa de crescimento anual da população B: ");
                taxa2 = scanner.nextFloat();

                if (taxa2 <= 0) {
                    System.out.println("A taxa de crescimento deve ser maior que 0.");
                }
            }
            while (taxa2 <=0);

            if (taxa1 > taxa2 && a < b){
                do {
                    a = a + a * (taxa1 / 100);
                    b = b + b * (taxa2 / 100);
                    anos ++;
                }
                while (a < b);

                System.out.println("Levaria "+ anos + " anos para a polulação A superar a população B.");
            } 
            else if (taxa1 < taxa2 && a > b) {
                do {
                    a = a + a * (taxa1 / 100);
                    b = b + b * (taxa2 / 100);
                    anos ++;
                }
                while (a < b);

                System.out.println("Levaria "+ anos +" anos para a pupulação B superar a população A.");
            }
            else if (taxa1 > taxa2 && b < a) {
                System.out.println("A população B nunca vai superar a população A.");
            }
            else if (taxa1 < taxa2 && b > a){
                System.out.println("A população A nunca vai superar a população B.");
            } else {
                System.out.println("As populações não vão se superar.");
            }

            System.out.println("\n1 - Repetir a operação");
            System.out.println("2 - Encerrar programa");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    
                    break;
                case 2:
                    repetir = false;
                    System.out.print("Programa encerrado.");
                    break;
                default:
                    System.out.print("Opção inválida, encerrado o programa.");
                    repetir = false;
                    break;
            }
        }
        
        

        scanner.close();
    }
}