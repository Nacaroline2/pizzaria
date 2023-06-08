package aplicacao;

import Model.Pizza;

public class App {
    public static void main(String[] args) {
        Pizza p = new Pizza("Frango", 30.0, 'p');

        System.out.println("Pedido realizado!!");
        System.out.println(p.pedidoIfood());

        Pizza p2 = new Pizza("camarao", 50.0, 'G');

        System.out.println("Pedido Criado!!");
        System.out.println(p2.pedidoIfood());
    }
    
}
