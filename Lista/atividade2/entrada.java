package Lista.atividade2;
import java.util.Scanner;
public class entrada {
    /**
     * @param args
     */
    public static void main(String[] args){
       Scanner entrada = new Scanner (System.in);
            System.out.print("Digite um numero real para ser impresso ");
            double valor;
            valor = entrada.nextDouble();
            System.out.println("o valor digitado foi " + valor);
        entrada.close();
}

}
  


// 2. Escreva um programa que leia um número real fornecido pelo usuário, armazenando-o numa variável apropriada.
// Imprima o valor lido. 