package Lista.atividade21;
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
// 21. Faça um algoritmo que, lendo 3 números correspondentes aos coeficientes a, b, e c de uma equação do 2º grau, calcule
// seu DELTA e também as raízes desta equação, imprimindo seus valores. 