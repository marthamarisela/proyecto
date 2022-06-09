/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Asus
 */
public class Producto {
  private String nombreProducto;
  private String tipoProducto;
   private int cantidadProducto;
   private int codigoProducto;
   private int precioProducto;
   private int stok;
   private Factura unaFactura;

    public Producto(String nombreProducto, String tipoProducto, int cantidadProducto, int codigoProducto, int precioProducto, int stok, Factura unaFactura) {
        this.nombreProducto = nombreProducto;
        this.tipoProducto = tipoProducto;
        this.cantidadProducto = cantidadProducto;
        this.codigoProducto = codigoProducto;
        this.precioProducto = precioProducto;
        this.stok = stok;
        this.unaFactura = unaFactura;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public int getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public Factura getUnaFactura() {
        return unaFactura;
    }

    public void setUnaFactura(Factura unaFactura) {
        this.unaFactura = unaFactura;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombreProducto=" + nombreProducto + ", tipoProducto=" + tipoProducto + ", cantidadProducto=" + cantidadProducto + ", codigoProducto=" + codigoProducto + ", precioProducto=" + precioProducto + ", stok=" + stok + ", unaFactura=" + unaFactura + '}';
    }
   
}
