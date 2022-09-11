package Lista.atividade30;
import java.util.Scanner;
public class entrada {

    public static void main(String[] args){
      Scanner entrada = new Scanner (System.in);
      int a,b,f;
      System.out.println("Digite o valor de A e B para calcular a f(x)= a*x + b");
      a = entrada.nextInt();
      b = entrada.nextInt();
      System.out.println("As funções com as variancias de 0 a 5 de X");
     for(int x = 0 ; x <= 5; x++){
      f= a*x + b; 
     System.out.println(f);
     }  
    
     entrada.close();
}
}
// 30. Escreva um programa que calcule o valor de y = f(x) = a*x + b num intervalo de valores de x, sendo dados pelo usuário
// os coeficientes a e b, bem como os valores do limite inferior e superior do intervalo de x bem como o valor do incremento
// de x. O programa deve exibir resultados como um tabela onde constam os valores de x e y=f(x) lado a lado. 