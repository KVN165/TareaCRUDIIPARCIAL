/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mpm.tareaiiparcial;

import com.pmp.dap.Cliente;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author KVN
 */
public class ClienteAdapter {

    public String getEstado() {
        return _estado.get();
    }

    public void setEstado(String _estado) {
        this._estado.set(_estado);
    }

    public String getNombres() {
        return _nombres.get();
    }

    public void setNombres(String _nombres) {
        this._nombres.set(_nombres);
    }

    public String getApellidos() {
        return _apellidos.get();
    }

    public void setApellidos(String _apellidos) {
        this._apellidos.set(_apellidos);
    }

    public String getEmail() {
        return _email.get();
    }

    public void setEmail(String _email) {
        this._email.set(_email);
    }

    public String getTelefono() {
        return _telefono.get();
    }

    public void setTelefono(String _telefono) {
        this._telefono.set(_telefono);
    }

    public String getDireccion() {
        return _direccion.get();
    }

    public void setDireccion(String _direccion) {
        this._direccion.set(_direccion);
    }

    public String getOcupacion() {
        return _ocupacion.get();
    }

    public void setOcupacion(String _ocupacion) {
        this._ocupacion.set(_ocupacion);
    }

    public String getGenero() {
        return _genero.get();
    }

    public void setGenero(String _genero) {
        this._genero.set(_genero);
    }

    public String getEstadocivil() {
        return _estadocivil.get();
    }

    public void setEstadocivil(String _estadocivil) {
        this._estadocivil.set(_estadocivil);
    }
    private Cliente _cliente;
    
    public Cliente getCliente(){
        _cliente.setNombres(_nombres.get());
        _cliente.setApellidos(_apellidos.get());
        _cliente.setDireccion(_direccion.get());
        _cliente.setEmail(_email.get());
        _cliente.setEstado(_estado.get());
        _cliente.setEstadocivil(_estadocivil.get());
        _cliente.setGenero(_genero.get());
        _cliente.setOcupacion(_ocupacion.get());
        _cliente.setTelefono(_telefono.get());
        return this._cliente;
    }
    
    public ClienteAdapter(Cliente _cliente){
        this._cliente = _cliente;
        
        _nombres.set(_cliente.getNombres());
        _apellidos.set(_cliente.getApellidos());
        _email.set(_cliente.getEmail());
        _telefono.set(_cliente.getTelefono());
        _direccion.set(_cliente.getDireccion());
        _ocupacion.set(_cliente.getOcupacion());
        _genero.set(_cliente.getGenero());
        _estadocivil.set(_cliente.getEstadocivil());
        _estado.set(_cliente.getEstado());
    }
    
    private SimpleStringProperty _nombres;
    private SimpleStringProperty _apellidos;
    private SimpleStringProperty _email;
    private SimpleStringProperty _telefono;
    private SimpleStringProperty _direccion;
    private SimpleStringProperty _ocupacion;
    private SimpleStringProperty _genero;
    private SimpleStringProperty _estadocivil;
    private SimpleStringProperty _estado;
    
    
    
    
    
    
    
}
