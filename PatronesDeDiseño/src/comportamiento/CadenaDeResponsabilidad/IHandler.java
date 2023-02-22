/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package comportamiento.CadenaDeResponsabilidad;

/**
 *
 * @author HP
 */
public interface IHandler {
    
    
    public void setHandler(IHandler pSiguiente);
    public double calcularPrecioFinal(int cantidad, double precio);
}
