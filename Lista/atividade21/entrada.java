package Lista.atividade21;
import java.util.Scanner;
import java.lang.Math;
public class entrada {

    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
            System.out.print("Digite o valor de A,B e C para calcular a equação de segundo grau: ");
          int a,b,c,delta;
          double d,raiz1,raiz2;
          
            a = entrada.nextInt();
            b = entrada.nextInt();
            c = entrada.nextInt();
            
            delta = (b * b) - 4 * a * c;
            if(delta > 0){
            System.out.printf("O delta é: %.2f\n", Math.sqrt(delta));
            }else{
                System.out.println("Delta é negativo.");
            }
            d = Math.sqrt(delta);
            raiz1 =(- b - d) / a * 2;
            raiz2 =(- b + d) / a * 2;

            System.out.println("raiz 1:" + raiz1);
            System.out.println("raiz 2:" + raiz2);
            
        entrada.close();
}
}
// 21. Faça um algoritmo que, lendo 3 números correspondentes aos coeficientes a, b, e c de uma equação do 2º grau, calcule
// seu DELTA e também as raízes desta equação, imprimindo seus valores. 