package uninter;

import java.util.Objects;

//Classe Mãe abstrata. Criei ela para servir de base para as moedas (Dolar, Euro, Real).
//É abstrata porque não existe uma moeda "genérica".
public abstract class Moeda {
    
    double valor;

    public Moeda(double valor) {
        super(); 
        this.valor = valor;
    }

    public abstract void info();
    public abstract double converter();

    
    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }

 // Esse método ensina o ArrayList a comparar se uma moeda é igual a outra baseada no valor e no tipo.
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        
        Moeda other = (Moeda) obj;
     // Usada para comparar os valores double.
        return Double.compare(other.valor, valor) == 0; 
    }
}
