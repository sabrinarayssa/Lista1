import java.util.Scanner;

public class DesafioFigura2 {

    public static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura (máximo 20): ");
        int altura = scanner.nextInt();

        System.out.print("Digite a largura (máximo 20): ");
        int largura = scanner.nextInt();

        // Validação
        if (altura <= 0 || altura > 20 || largura <= 0 || largura > 20) {
            System.out.println("Valores inválidos! Digite números entre 1 e 20.");
        } else {

            System.out.println("\nRetângulo completo:");

            for (int i = 1; i <= altura; i++) {
                for (int j = 1; j <= largura; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            System.out.println("\nDiagonal superior direita:");

            for (int i = 1; i <= altura; i++) {

                for (int j = 1; j <= largura; j++) {

                    if (j == largura - i + 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }

                System.out.println();
            }
        }

        System.out.println("\nPrograma finalizado.");
        scanner.close();
    }
}