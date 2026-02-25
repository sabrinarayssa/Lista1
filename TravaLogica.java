public class TravaLogica {
    public static void main(String[] args) {

        String senha = "1-2-3";
        int estado = 0;

        for (int i = 0; i < senha.length(); i++) {

            char c = senha.charAt(i);

            if (c == '-') {
                continue;
            }

            switch (estado) {
                case 0:
                    if (c == '1') {
                        estado = 1;
                    } else {
                        estado = 0;
                    }
                    break;

                case 1:
                    if (c == '2') {
                        estado = 2;
                    } else {
                        estado = 0;
                    }
                    break;

                case 2:
                    if (c == '3') {
                        estado = 3;
                    } else {
                        estado = 0;
                    }
                    break;
            }
        }

        if (estado == 3) {
            System.out.println("Acesso concedido!");
        } else {
            System.out.println("Senha incorreta!");
        }

    }
}
