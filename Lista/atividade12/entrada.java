package Lista.atividade12;
import java.util.Scanner;
public class entrada {
   
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        System.out.println("O copo custa 0,05 até 100 unidades de 101 a 500 o copo custa 0,04 se maior que 500 custa 0.035");
            System.out.print("A quantidade de copos que deseja ");
            double copo = 0.05, qtd; 
            qtd = entrada.nextInt();

            if(qtd > 100){
                copo -= 0.01;
                System.out.printf("O valor é R$:" + " %.2f", copo * qtd);
            }else if(qtd > 500){
                copo -= 0.005;
                System.out.printf("O valor é R$:" + " %.2f", copo * qtd);
            }else{
                System.out.printf("O valor é R$:" + " %.2f", copo * qtd);
            }


           entrada.close();
        }
       
}

// 12. Escreva um programa capaz de calcular o preço total a ser pago por uma compra de copos plásticos. O usuário deve
// fornecer o número de copos a serem comprados e o programa deve calcular o preço total a ser cobrado, exibindo-o.
// Observe que: se o número de copo é inferior ou igual a 100, o preço por copo é R$0.05; se o número de copos está entre
// 101 e 500, o preço por copo é R$0.04; finalmente se o número de copos é superior a 500 o preço por copo é R$0.035. 