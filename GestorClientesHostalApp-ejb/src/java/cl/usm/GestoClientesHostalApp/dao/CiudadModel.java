/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.usm.GestoClientesHostalApp.dao;

import cl.usm.GestorClientesHostalApp.dto.Ciudad;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Singleton;

/**
 *
 * @author Alexsander
 */
@Singleton
public class CiudadModel implements CiudadModelLocal {
    
    private final List<Ciudad> ciudades = new ArrayList<>();
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public List<Ciudad> getCiudad() {
        return ciudades;
    }
    
    
}
