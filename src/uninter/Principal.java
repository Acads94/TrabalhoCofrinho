package uninter;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();
        
     // Variáveis que usei no menu.  
        int opcao;
        int tipoMoeda;
        double valor;
        Moeda moeda;
        
        System.out.println("COFRINHO:");
        System.out.println("1-Adicionar Moeda");
        System.out.println("2-Remover Moeda");
        System.out.println("3-Listar Moedas");
        System.out.println("4-Calcular total convertido para Real");
        System.out.println("0-Encerrar");
        
        opcao = teclado.nextInt();
        
        while (opcao != 0) {
            
            switch (opcao) {
            
            case 1: 
                tipoMoeda = 0;
             // Usada para garantir que o usuário escolherá uma moeda válida (1, 2 ou 3).
                while (tipoMoeda > 3 || tipoMoeda <= 0) {
                    System.out.println("Escolha Moeda:");
                    System.out.println("1-Real:");
                    System.out.println("2-Dolar:");
                    System.out.println("3-Euro:");
                    tipoMoeda = teclado.nextInt();
                }
                
                System.out.println("Digite o valor:");
                valor = teclado.nextDouble();
                
             // Usada para criar a moeda certa dependendo da escolha.
                moeda = null;
                if (tipoMoeda == 1) {
                    moeda = new Real(valor);
                } else if (tipoMoeda == 2) {
                    moeda = new Dolar(valor);
                } else if (tipoMoeda == 3) {
                    moeda = new Euro(valor);
                }
                
                cofrinho.adicionar(moeda);
                System.out.println("Moeda adicionada!");
                break;
                
            case 2: 
                tipoMoeda = 0;
                while (tipoMoeda > 3 || tipoMoeda <= 0) {
                    System.out.println("Escolha Moeda para remover:");
                    System.out.println("1-Real:");
                    System.out.println("2-Dolar:");
                    System.out.println("3-Euro:");
                    tipoMoeda = teclado.nextInt();
                }
                
                System.out.println("Digite o valor:");
                valor = teclado.nextDouble(); 
                
                moeda = null;
                if (tipoMoeda == 1) {
                    moeda = new Real(valor);
                } else if (tipoMoeda == 2) {
                    moeda = new Dolar(valor);
                } else if (tipoMoeda == 3) {
                    moeda = new Euro(valor);
                }
                
                
                cofrinho.remover(moeda);
                System.out.println("Moeda removida (se existia)!");
                break;
                
            case 3: 
                cofrinho.listagemMoedas();
                break;
                
            case 4: 
                double total = cofrinho.totalConvertido();
                
                System.out.println("Total convertido para Real: " + total);
                System.out.println("(Cotações fictícias: Dolar=5, Euro=6)");
                break;
                
            default:
                System.out.println("Opção inválida!");
                break;
            }
            
         // Mostra o menu de novo.
            System.out.println("\nCOFRINHO:");
            System.out.println("1-Adicionar Moeda");
            System.out.println("2-Remover Moeda");
            System.out.println("3-Listar Moedas");
            System.out.println("4-Calcular total convertido para Real");
            System.out.println("0-Encerrar");
            opcao = teclado.nextInt();
        }
        
        System.out.println("Sistema encerrado.");
        teclado.close();
    }
}
