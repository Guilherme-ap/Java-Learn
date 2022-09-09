package Lista.atividade15;
import java.util.Scanner;
public class entrada {

    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
            System.out.print("Digite um numero: ");
            double x,y;
            x = entrada.nextInt();
            System.out.print("Digite outro numero: ");
            y = entrada.nextInt();
            
            System.out.println("O primeiro valor x= " + x);
            System.out.println("O primeiro valor y= " + y);
            System.out.println("A soma X + Y= " + (x+y));
            System.out.println("O produto X * Y= " + (x*y));
           
            if(x > y){
                System.out.println("X > Y");
            }else if(x == y){
                System.out.println("X = Y");
            }else if( x < y){
                System.out.println("X < Y");
            }
    
        entrada.close();
}
}
// 15. Escreva um programa que realize as seguintes tarefas:
// a) Efetue a leitura de dois valores inteiros, os quais serão denominados x e y;
// b) Realize a soma dos valores x e y, exibindo seu resultado;
// c) Realize o produto dos valores x e y exibindo seu resultado;
// d) Compare os valores x e y, indicando se "X > Y", "X = Y" e "X < Y" para os casos correspondentes. 