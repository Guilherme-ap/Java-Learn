package Lista2.atividade14;
import java.util.Random;
import java.util.Arrays;
public class entrada {
    
    public static void main(String[] args){
        int []vetor1 = gerar(50);
        int []vetor2 = gerar(50);
        
        int []c = concatenar(vetor1, vetor2);
        
        System.out.println(c + " ");
        Arrays.sort(c);
        System.out.println(c + " ");
  
    }

private static int[] gerar(int tam){
    int []vetor = new int[tam];
    Random gerar = new Random();

    for(int  i = 0; i < vetor.length; i++){
        vetor[i] = gerar.nextInt(100);
    }

    return vetor;
}
private static int[] concatenar(int[] a, int[] b){
    int []c = new int[a.length + b.length];
    int k = 0;

    for(int i = 0; i < a.length; i++){
        c[k++] = a[i];
    
    }

    for(int i = 0; i < b.length; i++){
        c[k++] = b[i];
    
    }
    return c;
}
}
// 14. Crie	 dois	 vetores	 de	 50	 posições	 com	 valores	 inteiros	 aleatórios,	 ordene	 cada	 vetor	
// individualmente,	e	 combine	 os	 dois	vetores	gerando	 um	 novo	vetor	 de	 100	 posições,	 de	
// forma	que	esse	novo	vetor	já	seja	criado	ordenado.	