package Lista.atividade10;
import java.util.Scanner;
import java.util.Arrays;

public class entrada {
   
    public static void main(String[] args){
       Scanner entrada = new Scanner(System.in);
            long[] valor= new long[3]; 

            System.out.println("Digite um número inteiro:");
            valor[0]=entrada.nextLong();
            System.out.println("Digite mais um número inteiro:");
            valor[1]=entrada.nextLong();
            System.out.println("Digite outro número inteiro:");
            valor[2]=entrada.nextLong();
           
            entrada.close(); // Libera recursos de System.in
    
           boolean flag;
            do {
                
                flag = false; 
                for(int i=0; i < valor.length - 1; i++) {
                  if (valor[i] > valor[i + 1]) {
                      long aux = valor[i]; 
                      valor[i] = valor[i + 1];
                      valor[i + 1] = aux;
    
                      flag = true;
                  }
                }
            } while (flag); 
    
            System.out.println("Os números digitados na ordem crescente são: " + Arrays.toString(valor));
    entrada.close();
    } 
   
   
       
}

  
    


// 11. Escreva um programa que leia dois números inteiros A e B quaisquer indicando se A é múltiplo de B ou se B é múltiplo
// de A.
