package Lista.atividade1;
import java.util.Scanner;
public class entrada {
  
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
            System.out.print("Digite um valor para ser impresso ");
            int valor;
            valor = entrada.nextInt();
            System.out.println("o valor digitado foi " + valor);
            entrada.close();
        }
        
}


// 1. Escreva um programa que leia um número inteiro fornecido pelo usuário, armazenando-o numa variável apropriada.
// Imprima o valor lido