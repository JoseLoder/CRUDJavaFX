package vista.controladores;

import controlador.Controlador;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import modelo.Persona;

import java.util.ArrayList;

public class ControladorEscenarioPrincipal {

    // Declaramos el controlador
    private Controlador controladorMVC;

    // Constructor
    public ControladorEscenarioPrincipal(Controlador controlador) {
        setControladorMVC(controlador);

    }
    // Setter para el controlador que nos va a pasar la vista
    public void setControladorMVC(Controlador controlador) {
        this.controladorMVC = controlador;
    }

}
