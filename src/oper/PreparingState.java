/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oper;

/**
 *
 * @author Docente
 */
public class PreparingState implements OrderState{
    @Override
    public void next(Order order) {
        System.out.println("Order is now ready for delivery.");
        order.setState(new ReadyState());
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Order has been cancelled.");
        order.setState(new CancelledState());
    }

    @Override
    public String getStatus() {
        return "In Preparation";
    }
}
