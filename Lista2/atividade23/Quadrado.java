package Lista2.atividade23;

public class Quadrado extends Area {
	
    public Quadrado(double base){
           super(base);
       }
       
       @Override
       public void imprimir(){
           System.out.print("A area do quadrado mede "+this.getArea()+" cm2\n");
       }

}