package Lista2.atividade22;
public class entrada {
    
    public class Main {

   
        public static void main(String[] args) {
            
           Pessoa p1 = new Pessoa ("Osias", 20);
           Pessoa p2 = new Pessoa ("Joel", 30);
           Pessoa p3 = new Pessoa ("Marcia", 20);
           
          
           
            System.out.println("Nome: " + p1.getNome());
            System.out.println("Idade: " + p1.getIdade());
            System.out.println("Pai: " + p3.getNome());
            System.out.println("Mae: " + p2.getNome());
            
           
            
        }
        
    }
}
// 22. Faça	 uma	 programa	 para	 representar	a	árvore	genealógica	 de	 uma	 família.	 Para	 tal,	 crie	
// uma	classe	Pessoa	que	permita	indicar,	além	de	nome	e	idade,	o	pai	e	a	mãe.	Tenha	em	
// mente	que	pai	e	mãe	também	são	do	tipo	Pessoa.