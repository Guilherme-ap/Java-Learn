package Lista.atividade25;
import java.util.Scanner;
public class entrada {

    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
            System.out.println("digite quantos numeros deseja somar: ");
          int n,num,soma = 0;
          n = entrada.nextInt();
        for(int i = 1 ; i <= n; i++){
          System.out.println("Digite o numero: ");
          num = entrada.nextInt();
          soma = num + soma;
          if( i == n){
            System.out.println("A soma dos valores é :" + soma);
          }
        }
        
    
         
        entrada.close();
}
}
// 25. Faça um programa que calcule a soma de N números quaisquer fornecidos pelo usuário.  