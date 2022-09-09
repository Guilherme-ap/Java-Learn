package Lista.atividade14;
import java.util.Scanner;
public class entrada {
  
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
            System.out.print("Digite a primeira nota ");
            double n1,n2,n3;
            n1 = entrada.nextInt();
            System.out.print("Digite a segunda nota ");
            n2 = entrada.nextInt();
            System.out.print("Digite a terceira nota ");
            n3 = entrada.nextInt();
            
            System.out.printf("\nMédia: %.2f \n", (n1+n2+n3)/3);
             
            if((n1+n2+n3)/3 >= 7){
                System.out.println("Aprovado");
            }else if((n1+n2+n3)/3 < 3){
                System.out.println("Reprovado");
        }else{
            System.out.println("Exame");
        }
        entrada.close();
}
}
// 14. Escreva um programa que leia 3 notas (valores reais), calculando e exibindo sua média aritmética. Imprima também
// "Aprovado" se a média for maior que 7, "Reprovado" se for menor que 3 e "Exame" se estiver entre 3 e 7. 