/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oper;

/**
 *
 * @author Docente
 */
public class ReceivedState implements OrderState {
    @Override
    public void next(Order order) {
        System.out.println("Order is now in preparation.");
        order.setState(new PreparingState());
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Order has been cancelled.");
        order.setState(new CancelledState());
    }

    @Override
    public String getStatus() {
        return "Received";
    }
}
