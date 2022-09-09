package Lista.atividade19;
import java.util.Scanner;
public class entrada {

    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        System.out.print("Digite um numero decimal: ");
        double valor ;
        valor = entrada.nextDouble();
        System.out.println( new Extenso(valor).toString() );
         
            
         
    
    entrada.close();
}
}
// 18. Escreva um programa que leia um número inteiro entre 0 e 100 e o exiba por extenso, por exemplos: 16 -> "dezesseis",
// 34 -> "trinta e quatro", etc.. 