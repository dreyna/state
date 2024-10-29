/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import oper.Order;

/**
 *
 * @author Docente
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Order order = new Order();
        
        System.out.println("Initial Order Status: " + order.getStatus());
        
        // Cambiando el estado del pedido
        order.next(); // Cambia a "En Preparación"
        System.out.println("Current Order Status: " + order.getStatus());

        order.next(); // Cambia a "Listo"
        System.out.println("Current Order Status: " + order.getStatus());

        order.cancel(); // Intenta cancelar, no se puede porque está "Listo"
        
        // Cancela el pedido antes de ser preparado
        Order newOrder = new Order();
        newOrder.cancel(); // Cancela el pedido
        System.out.println("New Order Status: " + newOrder.getStatus());
    }
    
}
