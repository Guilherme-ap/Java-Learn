package Lista.atividade7;
import java.util.Scanner;
public class entrada {
    /**
     * @param args
     */
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
            System.out.print("Digite o valor de A ");
            int a;
            int b;
            a = entrada.nextInt();
            System.out.print("Digite o valor de B: ");
            b = entrada.nextInt();
            if(a == 0){
                System.out.println("V");
            }else{
                System.out.println("F");
            }
            if (b < 0){
                System.out.println("V");
            }else{
                System.out.println("F");
            }
            if(a > 0 || b > 0){
                System.out.println("V");
            }else{
                System.out.println("F");
            }

          entrada.close();

        }
       
}


// 7. Escreva um programa que leia dois valores, os quais denominaremos A e B, fornecidos pelo usuário, exibindo respostas
// F ou V para as seguintes questões:
// (a) A é igual a zero?
// (b) B é menor que zero; e
// (c) A OU B são maiores do que zero?
// Use operadores lógicos para formular as expressões necessárias a avaliação dos valores.