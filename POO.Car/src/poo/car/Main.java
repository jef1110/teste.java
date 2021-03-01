
package poo.car;


public class Main {

    
    public static void main(String[] args) {
        Carro v1 = new Carro();
        v1.cor = "Preto";
        v1.marca = "Chevrolet";
        v1.portas = 4;
        v1.ligado = true;
        
        v1.status();
        v1.acelerando();
    }
    
}
