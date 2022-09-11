package Lista.atividade22;
import java.util.Scanner;
public class entrada {

    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
            System.out.println("Digite a velocidade do objeto");
          double pf,p0=0,v,t,a=0;
            v = entrada.nextDouble();
            System.out.println("Digite o tempo decorrido: ");
            t = entrada.nextDouble();
           

            pf = p0 + v * t + ((a * t) * ( a * t) /2);

            System.out.println("Posição Final: "+ pf);
            
            
        entrada.close();
}
}
// 22. Considerando um objeto móvel em movimento uniformemente variado, escreva um programa que receba as seguintes
// informações: um valor real indicando posição inicial do móvel P0, um valor real que corresponde a velocidade do móvel
// V, um outro valor real A correspondente a aceleração do móvel e um número inteiro correspondente ao tempo decorrido
// T. O programa deve calcular a posição final PF do móvel, dado pela relação abaixo:
// PF = P0 + V * T + (A * T2
// ) / 2
