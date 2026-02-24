import java.util.ArrayList;

public class Conjuntos{

    public static void main(String[]args){

        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();

        A.add(1);   
        A.add(2);
        A.add(3);

        B.add(2);
        B.add(3);
        B.add(4);

        //Fazendo a União
        ArrayList<Integer> uniao = new ArrayList<>();

        for(Integer num : A){
            if(!uniao.contains(num)){
                uniao.add(num);
            }
        }

          for(Integer num : B){
            if(!uniao.contains(num)){
                uniao.add(num);
            }
        }

        //Fazendo a Interseção

        ArrayList<Integer> intersecao = new ArrayList<>();

        for(Integer num :A){
            if(B.contains(num)){
                intersecao.add(num);
            }
        }

        System.out.println("União: " + uniao);
        System.out.println("Interseção: " + intersecao);
    }
}