/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenasuministr_quiz2;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class DistributionCenter extends Eslabon {
    
    ArrayList<Producto> productos;
    
    public DistributionCenter(String nombre, String descripcion, String direccion) {
        super(nombre, descripcion, direccion);
        productos = new ArrayList<>();
    }
    
    public boolean addProducto (Producto productoM){
        return productos.add(productoM);
    }
    
}
