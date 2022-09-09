package Lista.atividade16;
import java.util.Scanner;
public class entrada {

    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
            System.out.print("digite a base do triangulo: ");
            double base,altura;
            base = entrada.nextInt();
            System.out.print("Digite a altura do triangulo: ");
            altura = entrada.nextInt();
            
            System.out.println("A area do triangulo é A=" + (altura*base)/2);
            
         
    
        entrada.close();
}
}
// 16. Preparar um programa para ler as medidas da base e da altura de um triângulo, calculando e imprimindo sua área,
// sabendo que o cálculo da área é dado por:
// area = (base*altura)/2.