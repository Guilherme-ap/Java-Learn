package Lista.atividade26;
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
          if( num == 0){
            System.out.println("A soma dos valores é :" + soma);
          }
        }
        
    
         
        entrada.close();
}
}
// 26. Escreva um programa que calcule a soma de N números quaisquer fornecidos pelo usuário. O programa deve parar de ler
// e, portanto somar os valores quando for introduzido o número 0 (zero). 