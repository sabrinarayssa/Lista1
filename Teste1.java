import java.util.Scanner;

public class Teste1{

    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

       System.out.print("Qual o tamanho do Quadrado? ");
       int tamanho = scanner.nextInt();

       if(tamanho <= 0 || tamanho > 20){
        System.out.print("Tamanho invalido!!!");

       }else{
        for(int i = 1; i <= tamanho; i++){
            for(int j = 1; j <= tamanho; j++){
            System.out.print("* ");
            
            }
       
        System.out.println();
        
       }
        }
        System.out.print("Programa Finalizado.");
        scanner.close();
    }
}