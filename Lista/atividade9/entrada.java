package Lista.atividade9;
import java.util.Scanner;
public class entrada {
    /**
     * 
     */
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
            System.out.print("Digite o valor de A ");
            int a;
            int b;
            int c;
            a = entrada.nextInt();
            System.out.print("Digite o valor de B: ");
            b = entrada.nextInt();
            System.out.print("Digite o valor de C: ");
            c = entrada.nextInt();
            if(a > b && a > c){
                System.out.print("O maior numero digitado foi:  " + a);
            }else if(b > a && b > c){
                System.out.print("O maior numero digitado foi:  " + b);
            }else{
                System.out.print("O maior numero digitado foi:  " + c);

            }
           entrada.close();
        }
       
}


// 8. Leia três números inteiros fornecidos pelo usuário. Descubra qual deles é o maior de todos, imprimindo seu valor