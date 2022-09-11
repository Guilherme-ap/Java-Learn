package Lista.atividade27;
import java.util.Scanner;
public class entrada {

    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
          
          int n = 0, nota = 0, soma = 0, x = 1;
          while(x > 0) {
          System.out.println("Digite nota: ");
          nota = entrada.nextInt();
          soma = nota + soma;
          n++;
          System.out.println("Para parar o programa digite um valor negativo");
          if( nota <= -1  ){
            System.out.println("A media das notas é :" + (soma/n) );
            x = -1;
          }
        }
        
    
         
        entrada.close();
}
}
// 27. Calcule a média de Notas de alunos. O programa deve parar de ler valores quando for fornecido um valor negativo como
// nota