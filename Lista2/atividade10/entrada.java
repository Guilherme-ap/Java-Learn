package Lista2.atividade10;
import java.util.Scanner;
public class entrada {
  
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        double juros, inv, x = 1,soma = 0;
        String op;
        System.out.println("Digite o valor de investimento");
        inv = entrada.nextDouble();
        System.out.println("Digite o juros");
        juros = entrada.nextDouble();
        while(x > 0){
        soma = (soma + (inv + (inv * (juros / 100))));
        x++;
        if(x > 0){
            System.out.printf("R$:%.2f\n", soma);
            if(x == 12){
            System.out.println("Deseja Processar mais um ano? (S/N)");
            entrada.nextLine();
            op = entrada.nextLine();
            switch(op){
                case "S":
                x = 1;
                break;
                case "N":
                x = -1;
                break;
                default:
                x = -1;
            }
        }
    }
        
        }
        entrada.close();
        
}
}
// 10. Calcule o	retorno	de	um	investimento	financeiro fazendo	as	contas	mês	a	mês,	sem	usar	a	
// fórmula	 de	 juros	 compostos.	 O	 usuário	 deve	 informar	 quanto	 será	 investido	 por	 mês	 e	
// qual	será	a	taxa	de	juros	mensal.	O	programa	deve	informar	o	saldo	do	investimento	após	
// um	ano	(soma	das	aplicações	mês	a	mês considerando	os juros	compostos),	e	perguntar	ao	
// usuário	 se	 ele	 deseja	 que	 seja	 calculado	 o	 ano	 seguinte,	 sucessivamente.	 Por	 exemplo,	
// caso	o	usuário	deseje	investir	R$	100,00	por	mês,	e	tenha	uma	taxa	de	juros	de	1%	ao	mês,	
// o	programa	forneceria	a	seguinte	saída:
// Saldo do investimento após 1 ano: 1280.9328043328942
// Deseja processar mais um ano? (S/N)