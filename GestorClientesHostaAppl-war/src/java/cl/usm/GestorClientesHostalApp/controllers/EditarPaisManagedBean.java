/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.usm.GestorClientesHostalApp.controllers;

import cl.usm.GestoClientesHostalApp.dao.PaisFacadeLocal;
import cl.usm.GestorClientesHostalApp.dto.Pais;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Alexsander
 */
@Named(value = "editarPaisManagedBean")
@SessionScoped
public class EditarPaisManagedBean implements Serializable {

    /**
     * Creates a new instance of EditarPaisManagedBean
     */
    @EJB
    private PaisFacadeLocal paisFacede;

    
    private Pais paisEditado;
    /**
     * Creates a new instance of EditarPokemonManagedBean
     */
    public EditarPaisManagedBean() {
    }

    public void actualizarPais(){
        //Los campos ya estan actualizados, en el objeto, Binding
        this.paisFacede.edit(paisEditado);
        FacesContext.getCurrentInstance()
                .addMessage(null, new FacesMessage("Pokemon Actualizado"));
    }
    
    public Pais getPisEditado() {
        return paisEditado;
    }

    public void setPaisEditado(Pais paisEditado) {
        this.paisEditado = paisEditado;
    }
    
}
