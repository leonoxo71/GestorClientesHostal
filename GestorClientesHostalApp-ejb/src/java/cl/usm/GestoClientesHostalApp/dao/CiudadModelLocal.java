/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.usm.GestoClientesHostalApp.dao;

import cl.usm.GestorClientesHostalApp.dto.Ciudad;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Alexsander
 */
@Local
public interface CiudadModelLocal {

    List<Ciudad> getCiudad();
    
}