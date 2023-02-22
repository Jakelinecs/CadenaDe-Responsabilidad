/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comportamiento.CadenaDeResponsabilidad;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Jefe implements IHandler{

    IHandler siguiente = null;
    
    @Override
    public double calcularPrecioFinal(int cantidad, double precio) {
        JOptionPane.showMessageDialog(null, "Hola soy el Jefe");
        double total = cantidad * precio;
        
        if (cantidad > 100) {
        JOptionPane.showMessageDialog(null, "Basados en tu compra te voy a pasar con el  Propietario");
            total = siguiente.calcularPrecioFinal(cantidad, precio);
        } else {
            //descuento del 10%
                double sin =total;
                total = total * 0.9;
                JOptionPane.showMessageDialog(null, "Te puedo ofreser un descuento hasta del 10% asiendo un total de "+total+"de los"+sin);
            
        }
        return total;
    }

    @Override
    public void setHandler(IHandler pSiguiente) {
        siguiente=pSiguiente;
    }



    
}
