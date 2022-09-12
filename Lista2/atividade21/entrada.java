package Lista2.atividade21;
public class entrada {
    
    public static void main(String[] args){
    Pessoa a;
    a = new Pessoa ("flavio","1191707070","Flavio@gmail.com");
    System.out.println(a);
    Emprestimo b;
    b = new Emprestimo("1 mes","500");
    System.out.println(b);
    Livro c;
    c = new Livro(2001,"harry", "harrypotter");
    System.out.println(c);
}
}
// 21. Faça	 um	 programa	 para	 controle	 de	 empréstimo	 de	 livros,	 com	 as	 classes Emprestimo,	
// Livro e	Pessoa.