
package poo.car;


public class Carro {
    
    String cor;
    String marca ;
    int portas ;
    boolean ligado;
    
    
        public Carro(){
  }
    void status(){
        System.out.println("Cor " + this.cor);
        System.out.println("Marca " + this.marca);
        System.out.println("Portas " + this.portas );
        System.out.println("Ligado " + this.ligado);
    }   
    
    
    void acelerando(){
        if(this.ligado){
            System.out.println("vrumm! vrumm! vrum!");
        }else{
            System.out.println("ERRO! Veículo desligado!");
        }
  }
    void motorLigado(){
        this.ligado = true;
  }
    void motorDesligado(){
        this.ligado = false;
  }
    
}
