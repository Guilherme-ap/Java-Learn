package Lista.atividade17;
import java.util.Scanner;
public class entrada {

    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
            System.out.print("Digite os segundos para ser convertidos em horas: ");
          int seg,hora;
          
            seg = entrada.nextInt();
            if(seg < 0){
                System.out.println("Impossivel calcular");
            }else {
                hora = seg/3600;
                System.out.println("hr:" + hora);
            }
            
            
         
            
         
    
        entrada.close();
}
}
// 17. Escreva um programa que leia um valor inteiro correspondente a uma quantidade de segundos, convertendo o valor dado
// em horas corridas sabendo que 3600 segundos equivalem a 1 hora, exibindo os valores dado e convertido. Caso o
// usuário forneça um valor negativo, deve ser exibida uma mensagem e a operação de conversão não deve ser efetuada. 