package merge.sort;

import java.util.Random;
import java.util.Scanner;

public class Do_sort {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int f;
        
        System.out.println("quantos valores quer digitar");
        f = in.nextInt();
        
        System.out.println("");
        
        Integer[] vetor = new Integer[f];
        
        for (int j = 0; j < f; j++) {
            
            float num;
            
            System.out.println("Digite um número");
            num = in.nextFloat();
            
            vetor[j] = (int) num;
//            vetor[j] = new Random().nextInt(1000);
        }

        for (int j = 0; j < f; j++) {
            
            System.out.println(vetor[j]);
        }
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        WikiMerge wikimerge = new WikiMerge();
        
        wikimerge.ordena(vetor, 0, vetor.length - 1);
        
        for (Integer vetor1 : vetor) {
            
            System.out.println(vetor1);
        }

    }

}
