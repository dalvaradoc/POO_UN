/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc_ejemplo_060319;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author Estudiante
 */
public class ControladorVentana2 {
    private Ventana2 ventana;
    private Modelo modelo;

    public ControladorVentana2(Modelo modelo) {
        this.modelo = modelo;
        this.ventana = new Ventana2();
        //Adicionar eventos 
        this.ventana.getBoton().setOnAction(new EventoBoton());
    }
    
    public void mostrarVista () {
        Singleton singleton = Singleton.getSingleton();
        this.ventana.mostrar(singleton.getStage());
    }
    
    
    class EventoBoton implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            ControladorVentana1 controlador = new ControladorVentana1(modelo);
            controlador.mostrarVista();
        }
    }
}
