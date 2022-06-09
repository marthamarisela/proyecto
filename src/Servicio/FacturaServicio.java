/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

/**
 *
 * @author Asus
 */
public class FacturaServicio implemenets IFacturaServicio {
    
    private final List<Factura> facturaList = new ArrayList<>();
    
    public Cliente crear(Cliente cliente) {
        this.capitanList.add(cliente);
        return cliente;
    }

    public List<Cliente> listar() {
        return this.capitanList;
}
