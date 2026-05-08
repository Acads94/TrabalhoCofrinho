package uninter;

//Classe Real herda de Moeda (extends).
public class Real extends Moeda {

    public Real(double valor) {
        super(valor);
    }

    //Escreve na tela que é Real.
    @Override
    public void info() {
        System.out.println("Real - " + valor);
    }

 // Como o Real, vale ele mesmo, só retorna o valor.
    @Override
    public double converter() {
        return valor;
    }
    
    @Override
    public String toString() {
        return "Real [valor=" + valor + "]";
    }
}

