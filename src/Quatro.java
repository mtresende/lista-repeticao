import java.util.Scanner;

public class Quatro {
    public static void main(String[] args) {
        float a = 80000f, b = 200000f;
        int anos = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            a = a + a * 0.03f;
            b = b + b * 0.015f;
            anos ++;
        }
        while (a < b);

        System.out.print("Levaria "+ anos + " anos para a polulação A superar a população B.");

        scanner.close();
    }
}
