package Lista.atividade3;
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
            if( valor > 50){
                System.out.println("O numero digitado é maior que 50 ");
            }
            entrada.close();
        }
       
}

  


// 3. Leia um número qualquer fornecido pelo usuário. Determine se o número é maior do que 50, imprimindo uma mensagem
// indicando tal fato. 