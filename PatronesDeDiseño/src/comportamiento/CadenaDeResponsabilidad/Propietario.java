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

public class Propietario implements IHandler{

    IHandler siguiente = null;
    
    @Override
    public void setHandler(IHandler pSiguiente) {
        siguiente=pSiguiente;
    }

    @Override
    public double calcularPrecioFinal(int cantidad, double precio) {
        JOptionPane.showMessageDialog(null, "Hola soy el dendedor");
        double total = cantidad * precio;        
        double sin =total;
            total = total * 0.85;
        JOptionPane.showMessageDialog(null, "Te puedo ofreser un descuento hasta del 15% asiendo un total de "+total+"de los"+sin);
        return total;
    }



    
}
