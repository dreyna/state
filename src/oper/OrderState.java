/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package oper;

/**
 *
 * @author Docente
 */
public interface OrderState {
    void next(Order order);
    void cancel(Order order);
    String getStatus();
}
