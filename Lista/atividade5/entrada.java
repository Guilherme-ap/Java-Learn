package Lista.atividade5;
import java.util.Scanner;
public class entrada {
    /**
     * @param args
     */
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
            System.out.print("Digite um numero: ");
            int valor;
            valor = entrada.nextInt();
            System.out.println("o valor digitado foi " + valor);
            if( valor % 2 == 0){
                System.out.println("o numero é par");
            }else {
                System.out.println("O numero é impar");
            }
            entrada.close();
        }
       
}

  


// 5. Dado um número inteiro qualquer, fornecido pelo usuário, descobrir se o mesmo é par ou ímpar