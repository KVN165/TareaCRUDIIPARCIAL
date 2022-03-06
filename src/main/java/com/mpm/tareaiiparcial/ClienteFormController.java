/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mpm.tareaiiparcial;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

import com.pmp.dap.Cliente;
/**
 * FXML Controller class
 *
 * @author KVN
 */
public class ClienteFormController implements Initializable {


    @FXML
    private TextField txtnombres;
    @FXML
    private TextField txtapellidos;
    @FXML
    private TextField txtemail;
    @FXML
    private TextField txttelefono;
    @FXML
    private TextField txtdireccion;
    @FXML
    private TextField txtocupacion;
    @FXML
    private RadioButton rdbgeneromasculino;
    @FXML
    private ToggleGroup genero;
    @FXML
    private RadioButton rdbgenerofemenino;
    @FXML
    private ToggleGroup estado_civil;
    @FXML
    private ToggleGroup estado_civil1;
    @FXML
    private ComboBox<?> cmbestado;
    @FXML
    private Button btnconfirmar;
    @FXML
    private Button btncancelar;
    @FXML
    private RadioButton rdbsoltero;
    @FXML
    private RadioButton rdbcasado;
    @FXML
    private RadioButton rdbviudo;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void btnconfirmar_click(ActionEvent event) {
    }

    @FXML
    private void btncancelar_click(ActionEvent event) {
        App.closeModal(event);
    }
    
    private Cliente _cliente;
    
    public void setClienteObject( Cliente cliente){
        _cliente = cliente;
        refreshUX();
    }
    
    private void refreshUX(){
        txtnombres.setText(_cliente.getNombres());
        txtapellidos.setText(_cliente.getApellidos());
        txtemail.setText(_cliente.getEmail());
        txttelefono.setText(_cliente.getTelefono());
        txtdireccion.setText(_cliente.getDireccion());
        txtocupacion.setText(_cliente.getOcupacion());
        
        rdbgeneromasculino.setSelected(_cliente.getGenero() == "M");
        rdbgenerofemenino.setSelected(_cliente.getGenero() == "F");
        /*
        if(_cliente.getGenero() == "M"){
            rdbgeneromasculino.setSelected(true);
            rdbgenerofemenino.setSelected(false);
        } else{
            rdbgeneromasculino.setSelected(false);
            rdbgenerofemenino.setSelected(true);
        }
        */
        
        rdbsoltero.setSelected(_cliente.getEstadocivil() == "S");
        rdbcasado.setSelected(_cliente.getEstadocivil() == "C");
        rdbviudo.setSelected(_cliente.getEstadocivil() == "V");
    }
    
    public Cliente getClienteObject(){
        refreshObjFromUX();
        return _cliente;
    }
    
    private void refreshObjFromUX(){
        _cliente.setNombres(txtnombres.getText());
        _cliente.setApellidos(txtapellidos.getText());
        _cliente.setEmail(txtemail.getText());
        _cliente.setTelefono(txttelefono.getText());
        _cliente.setDireccion(txtdireccion.getText());
        _cliente.setOcupacion(txtocupacion.getText());
        
        _cliente.setGenero(rdbgeneromasculino.isSelected()?"M":"F");
        _cliente.setEstadocivil(rdbsoltero.isSelected()?"S":rdbcasado.isSelected()?"C":"V");

    }
}
