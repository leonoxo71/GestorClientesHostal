/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.usm.GestoClientesHostalApp.dao;

import cl.usm.GestorClientesHostalApp.dto.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Singleton;

/**
 *
 * @author Alexsander
 */
@Singleton
public class ClientesModel implements ClientesModelLocal {
    
    private final List<Cliente> clientes = new ArrayList<>();
    
    @Override
    public void AgregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public List<Cliente> getClientes() {
        return clientes;
    }
    
}
