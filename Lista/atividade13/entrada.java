package Lista.atividade13;
import java.util.Scanner;
public class entrada {
   
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
            System.out.print("Digite a medida de A ");
            double a ,b, c;
            a = entrada.nextInt();
            System.out.print("Digite a medida de B: ");
            b = entrada.nextInt();
            System.out.print("Digite a medida de c: ");
            c = entrada.nextInt();
            if(a <  b + c && b < a + c && c < a + b){
                if(a == b  && b == c){
                    System.out.println("O triangulo é equilatero");
                }else if(a == b || a == c || b == c){
                    System.out.println("O triangulo é isoceles");
                }else{
                    System.out.println("O triangulo é escaleno");
                }
            }else{
                System.out.println("Com estas medidas não é possivel montar um triangulo");
            }
            
    
             
           entrada.close();
        }
       
}


// 13. Dados 3 valores reais representando os lados de um possível triângulo, verifique se os mesmos formam um triângulo (a
// medida de qualquer um de seus lados deve ser menor que a soma das medidas dos lados restantes). Caso seja formado um
// triângulo, descubra também se este triângulo é escaleno (três lados diferentes), isósceles (dois lados iguais) ou eqüilátero
// (três lados iguais). 