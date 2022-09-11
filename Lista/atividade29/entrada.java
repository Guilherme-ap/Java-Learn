package Lista.atividade29;

public class entrada {

    public static void main(String[] args){

          int a=0,b=0,c=0, x = 1;
          while(x > 0) {
            System.out.println("A || B || C");
            if(a == 0){
              System.out.println("V \t F \t V \t F \t F \t F");
            }
            if(b == 0){
              System.out.println("V \t F \t V \t V \t V \t F");
            }
            if(c == 0){
              System.out.println("V \t F \t F \t V \t F \t V");
            }
          
          x++;
          if(x > 1){
            x = -1;
          }
          }
        }

}

// 29. Faça um programa que exiba a tabela verdade da operação OU-Lógico para todas as combinações de três variáveis
// lógicas A, B e C. Os resultados da tabela devem ser exibidos como F ou V.