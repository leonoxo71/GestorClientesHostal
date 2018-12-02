/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.usm.GestoClientesHostalApp.dao;

import cl.usm.GestorClientesHostalApp.dto.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Singleton;

/**
 *
 * @author Alexsander
 */
@Singleton
public class UsuariosModel implements UsuariosModelLocal {
    
    private final List<Usuario> usuarios = new ArrayList<>();
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public List<Usuario> getUsuario() {
        return usuarios;
    }
    
    
}
