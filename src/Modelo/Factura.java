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
public class Factura {
    private int numFactura;
    private Cliente unCliente;
    private String direccion;
    private Producto unProducto;
    private Date fecha;
    private int total;
    private int cantidad;

    public Factura(int numFactura, Cliente unCliente, String direccion, Producto unProducto, Date fecha, int total, int cantidad) {
        this.numFactura = numFactura;
        this.unCliente = unCliente;
        this.direccion = direccion;
        this.unProducto = unProducto;
        this.fecha = fecha;
        this.total = total;
        this.cantidad = cantidad;
    }

    public int getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(int numFactura) {
        this.numFactura = numFactura;
    }

    public Cliente getUnCliente() {
        return unCliente;
    }

    public void setUnCliente(Cliente unCliente) {
        this.unCliente = unCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Producto getUnProducto() {
        return unProducto;
    }

    public void setUnProducto(Producto unProducto) {
        this.unProducto = unProducto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Factura{" + "numFactura=" + numFactura + ", unCliente=" + unCliente + ", direccion=" + direccion + ", unProducto=" + unProducto + ", fecha=" + fecha + ", total=" + total + ", cantidad=" + cantidad + '}';
    }
    

    
    
}
