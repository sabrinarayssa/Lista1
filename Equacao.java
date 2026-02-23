import java.util.Scanner;
import java.util.Stack;

public class Equacao {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma expressão: ");
        var expressao = scanner.nextLine();
        scanner.close();

        if (verificador(expressao)) {
            System.out.print("Expressão Correta.");
        } else {
            System.out.print("Expressão Incorreta.");
        }

    }

    public static boolean verificador(String ex) {
        Stack<Character> pilha = new Stack<>();

        for (char c : ex.toCharArray()) {

            // Se for abertura
            if (c == '(' || c == '[' || c == '{') {
                pilha.push(c);
            }

            // Se for fechamento
            if (c == ')' || c == ']' || c == '}') {

                if (pilha.isEmpty()) {
                    return false;
                }

                char topo = pilha.pop();

                if ((c == ')' && topo != '(') ||
                        (c == ']' && topo != '[') ||
                        (c == '}' && topo != '{')) {
                    return false;
                }
            }
        }

        return pilha.isEmpty();
    }

}
