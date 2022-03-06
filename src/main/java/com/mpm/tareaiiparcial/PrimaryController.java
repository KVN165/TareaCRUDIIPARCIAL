package com.mpm.tareaiiparcial;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.scene.control.cell.PropertyValueFactory;

import com.pmp.dap.Cliente;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class PrimaryController {

    @FXML
    private Button primaryButton;
    @FXML
    private TableView<?> tblClientes;
    @FXML
    private TableColumn<?, ?> clmNombres;
    @FXML
    private TableColumn<?, ?> clmApellidos;
    @FXML
    private TableColumn<?, ?> clmEmail;
    @FXML
    private TableColumn<?, ?> clmTelefono;
    @FXML
    private TableColumn<?, ?> clmEstado;

    @FXML
    private void switchToSecondary() throws IOException {
        try{
            FXMLLoader win = App.getFXMLLoader("ClienteForm");
            Parent winObject = win.load();
            ClienteFormController clientesWin = (ClienteFormController) win.getController();
            
            Cliente cliente = new Cliente();
            cliente.setNombres("Kevin");
            cliente.setApellidos("Calix");
            cliente.setDireccion("Tegucigalpa");
            cliente.setEmail("kevincalix007@gmail.com");
            cliente.setGenero("M");
            cliente.setEstadocivil("V");
            cliente.setOcupacion("Doctor");
            cliente.setTelefono("12345678");
            
            clientesWin.setClienteObject(cliente);
            App.loadFXMLModal(winObject);
            cliente = clientesWin.getClienteObject();
            System.out.println(cliente.getString());
   
            //App.loadFXML(winObject);
        }catch (IOException ex){
            System.err.println(ex);
        }
        
    }
}
