package uninter;

import java.util.ArrayList;

public class Cofrinho {
    
	// Lista privada para guardar as moedas (encapsulamento).
    private ArrayList<Moeda> listaMoedas;

    public Cofrinho() {
        super();
     // Inicializa a lista vazia
        this.listaMoedas = new ArrayList<Moeda>(); 
    }

    public void adicionar(Moeda moeda) {
        this.listaMoedas.add(moeda);
    }

    public void remover(Moeda moeda) {
        this.listaMoedas.remove(moeda);
    }

    public void listagemMoedas() {
        if (this.listaMoedas.isEmpty()) {
            System.out.println("O cofrinho está vazio!");
            return;
        }
        
        for (Moeda m : this.listaMoedas) {
            m.info();
        }
    }

 // Soma o valor total convertido de todas as moedas.
    public double totalConvertido() {
        if (this.listaMoedas.isEmpty()) {
            return 0;
        }
        
        double total = 0;
        for (Moeda m : this.listaMoedas) {
            total += m.converter(); // Soma o valor já convertido pra Real.
        }
        return total;
    }
}

