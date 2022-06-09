/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Modelo.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus
 */
public class ClienteServicio implements IClienteServicio {
    private final List<Cliente> clienteList = new ArrayList<>();
    
    public Cliente crear(Cliente cliente) {
        this.clienteList.add(cliente);
        return cliente;
    }

    public List<Cliente> listar() {
        return this.clienteList;
    }
    
   
}
