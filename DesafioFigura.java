import java.util.Scanner;

public class DesafioFigura {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura da figura (máximo 20): ");
        int altura = scanner.nextInt();

        // Validação
        if (altura <= 0 || altura > 20) {
            System.out.println("Altura inválida! Digite um número entre 1 e 20.");
        } else {

            for (int i = 1; i <= altura; i++) {

                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }

                System.out.println();
            }
        }
        System.out.println("Programa finalizado.");
        scanner.close();
    }
}