/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oper;

/**
 *
 * @author Docente
 */
public class ReadyState implements OrderState{
    @Override
    public void next(Order order) {
        System.out.println("Order is already ready.");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Order cannot be cancelled. It is already ready.");
    }

    @Override
    public String getStatus() {
        return "Ready";
    }
}
