package Lista.atividade24;
import java.util.Scanner;
public class entrada2{

    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
            System.out.println("Digite um numero de 1 a 20 para calcular a tabuada: ");
          int n;
          n = entrada.nextInt();
       for( int i = 0; i <=20; i++){
          System.out.print( (n * i) + " ");
         
       }
    
         
        entrada.close();
}
}
// 24. Implementar três programas para exibir a tabuada de um número inteiro entre 1 e 20 dado pelo usuário.
// a) Usando enquanto (while)
// b) Usando faça-enquanto (do-while)
// c) Usando para (for)
//  Obs. Caso o valor dado seja inválido o programa deve apenas exibir uma mensagem de aviso. 