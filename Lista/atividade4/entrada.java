package Lista.atividade4;
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
            if( valor > 100){
                System.out.println("O valor é maior que 100");
            }else if ( valor <= 100){
                System.out.println("O valor é menor ou igual a 100");
            }
            entrada.close();
        }
       
}

  


//4. Leia um número qualquer fornecido pelo usuário. Determine se o número é maior do que 100, imprimindo uma
//mensagem indicando que o "valor é maior que 100" ou uma mensagem indicando que o "valor é menor ou igual a 100". 