import java.util.Scanner;
public class entrada {
  
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        String nome;
        double preco;
        int quantidade;
        System.out.println("Digite o nome do produto:");
        nome = entrada.nextLine();
        System.out.println("Digite o preço:");
        preco = entrada.nextDouble();
        System.out.println("Digite a quantidade:");
        quantidade = entrada.nextInt();
        entrada.close();
        if(quantidade <= 10){
            System.out.println("R$:" + (quantidade * preco));
        }else if( quantidade > 10 && quantidade <= 20){
            System.out.println("R$:" + ((quantidade * preco) - quantidade * preco * 0.10));
        }else if(quantidade > 20 && quantidade <= 50){
            System.out.println("R$:" + ((quantidade * preco) - quantidade * preco * 0.20));
        }else{
            System.out.println("R$:" + ((quantidade * preco) - quantidade * preco * 0.25));
        }
        System.out.println("O produto é: " + nome);
}
}
// 4. Para	 cada	 produto	 informado	 (nome,	 preço	 e	 quantidade),	 escreva	 o	 nome	 do	 produto	
// comprado	 e	 o	 valor	 total	 a	 ser	 pago,	 considerando	 que	 são	 oferecidos	 descontos	 pelo	
// número	de	unidades	compradas,	segundo	a	tabela	abaixo:	
// a. Até	10	unidades: valor	total
// b. de	11 a	20	unidades: 10%	de	desconto
// c. de	21	a	50	unidades: 20%	de	desconto
// d. acima	de	50	unidades: 25%	de	desconto