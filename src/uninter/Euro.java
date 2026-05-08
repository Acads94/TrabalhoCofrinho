package uninter;

//Euro herda de Moeda.
public class Euro extends Moeda {

    public Euro(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.println("Euro - " + valor);
    }

 // Converte multiplicando por 6.
    @Override
    public double converter() {
        return valor * 6.0; // Cotação Fictícia.
    }
    
    @Override
    public String toString() {
        return "Euro [valor=" + valor + "]";
    }
}
