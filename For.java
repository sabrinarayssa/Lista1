public class For {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("imprimir I: " + i);
            for (int j = 1; j <= 5; j++) {
                System.out.println("imprimir J: " + j);
                for (int p = 1; p <= 5; p++) {
                    System.out.println("imprimir P: " + p);
                }
            }
        }

    }

}
