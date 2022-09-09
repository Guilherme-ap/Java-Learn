package Lista.atividade20;
import java.util.Scanner;
public class entrada {

    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
            System.out.print("Digite os metros para ser convertidos em pés: ");
          double metros,pes;
          
            metros = entrada.nextDouble();
            if(metros < 0){
                System.out.println("Impossivel calcular");
            }else {
                pes = metros * 3.315;
                System.out.println("pés:" + pes);
            }
            
            
         
            
         
    
        entrada.close();
}
}
// 20. Escreva um programa que leia um valor real correspondente a uma medida em metros, convertendo o valor dado em pés
// (1 metro = 3.315 pés), exibindo os valores dado e convertido. Caso o usuário forneça um valor negativo, deve ser exibida
// uma mensagem e a operação de conversão não deve ser efetuada. 