package Lista.atividade11;
import java.util.Scanner;
public class entrada {
    /**
     * @param args
     */
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
            System.out.print("Digite o valor de A ");
            int a ,b;
            a = entrada.nextInt();
            System.out.print("Digite o valor de B: ");
            b = entrada.nextInt();
        
            if(a % b == 0){
                System.out.println("A é multiplo de B");
            }else if ( b % a == 0 ){
                System.out.println("B é multiplo de A");
            }else{
                System.out.println("Não são multiplos");
            }
            
             
           entrada.close();
        }
       
}


  
    


// 11. Escreva um programa que leia dois números inteiros A e B quaisquer indicando se A é múltiplo de B ou se B é múltiplo
// de A.
