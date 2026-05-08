package uninter;

//Dolar herda de Moeda
public class Dolar extends Moeda {

    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.println("Dolar - " + valor);
    }

 // Converte multiplicando por 5.
    @Override
    public double converter() {
        return valor * 5.0; // Cotação Fictícia
    }
    
    @Override
    public String toString() {
        return "Dolar [valor=" + valor + "]";
    }
}

