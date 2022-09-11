package Lista.atividade23;
import java.util.Scanner;
public class entrada {

    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
            System.out.println("Digite o capital inicial: ");
          double pv,j,fv;
          int n;

          pv = entrada.nextDouble();

          System.out.println("Digite a taxa de juros: ");
          j = entrada.nextDouble();

          System.out.println("Digite os períodos da aplicação: ");
          n = entrada.nextInt();

          fv = pv * (1 + j) * n;

          System.out.println("Capital futuro: " + fv);
          
         
        entrada.close();
}
}
// 23. Escreva um programa que receba as seguintes informações: um valor real indicando capital inicial PV, um valor real que
// corresponde a taxa de juros da aplicação J e um número inteiro de períodos da aplicação N. O programa deve retornar o
// capital futuro FV dado pela relação abaixo:
// FV = PV * ( 1 + J )N