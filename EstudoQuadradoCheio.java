import java.util.Scanner;

public class EstudoQuadradoCheio{

    public static void main(String[]ags){
    
        Scanner scanner = new Scanner(System.in);

         System.out.print("Qual o tamanho do Quadrado? ");
         int tamanho = scanner.nextInt();

         if(tamanho <= 0 || tamanho > 20){
           System.out.print("Tamanho Inválido,Digite um número de 1 a 20:");
         }
           else{
            for(int i = 1; i <= tamanho; i++){
               for(int j = 1; j <= tamanho; j++){
               System.out.print("* ");
           }
            System.out.println("");
    }
}

System.out.println("Programa Finalizado!");
   scanner.close();
    }
}