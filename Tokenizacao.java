import java.util.Scanner;

public class Tokenizacao {

    public static void main(String[] args) {

        String texto = "soma = 10 + 20 ;";

        String[] partes = texto.split(" ");

        for (String token : partes) {

            if(token.equals("=")){
                System.out.println(token + " -> Atribuição");

            }else if(token.equals("+")){
                System.out.println(token + " -> Operador");

            }else if(token.equals(";")){
                System.out.println(token + " -> Fim de intrução");

            }else if(token.matches("\\d+")){
                System.out.println(token + " -> Número");
                
            }else{
                System.out.println(token + " -> Identicador");
            }
            
        }

    }
}