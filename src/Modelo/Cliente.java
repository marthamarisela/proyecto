/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Asus
 */
public class Cliente {
     private long numCedula;
    private String nombreCliente;
    private String apellidoCliente;
    private String direccion;
    private Date yearNacimiento;
    private long telefono;
    private String correo;

    public Cliente(long numCedula, String nombreCliente, String apellidoCliente, String direccion, Date yearNacimiento, long telefono, String correo) {
        this.numCedula = numCedula;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.direccion = direccion;
        this.yearNacimiento = yearNacimiento;
        this.telefono = telefono;
        this.correo = correo;
    }

    public long getNumCedula() {
        return numCedula;
    }

    public void setNumCedula(long numCedula) {
        this.numCedula = numCedula;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getYearNacimiento() {
        return yearNacimiento;
    }

    public void setYearNacimiento(Date yearNacimiento) {
        this.yearNacimiento = yearNacimiento;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "numCedula=" + numCedula + ", nombreCliente=" + nombreCliente + ", apellidoCliente=" + apellidoCliente + ", direccion=" + direccion + ", yearNacimiento=" + yearNacimiento + ", telefono=" + telefono + ", correo=" + correo + '}';
    }

   
}