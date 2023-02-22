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
public class Vendedor implements IHandler{

    IHandler siguiente = null;
        
    @Override
    public void setHandler(IHandler pSiguiente) {
        siguiente=pSiguiente;
    }

    @Override
    public double calcularPrecioFinal(int cantidad, double precio) {
        
        JOptionPane.showMessageDialog(null, "Hola soy el dendedor");
        
        double total = cantidad * precio;
        
        if ( cantidad > 12 ) {
        JOptionPane.showMessageDialog(null, "Basados en tu compra te voy a pasar con el  Jefe");
            total = siguiente.calcularPrecioFinal(cantidad, precio);
        } else {
            if (cantidad>10) {//descuento del 5%
                double sin =total;
                total = total * 0.95;
                JOptionPane.showMessageDialog(null, "Te puedo ofreser un descuento hasta del 5% asiendo un total de "+total+"de los"+sin);
            }
        }
        return total;
    }

 

    
}
