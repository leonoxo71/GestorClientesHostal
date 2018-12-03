/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.usm.GestorClientesHostalApp.controllers;

import cl.usm.GestoClientesHostalApp.dao.PaisFacadeLocal;
import cl.usm.GestorClientesHostalApp.dto.Pais;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

/**
 *
 * @author Alexsander
 */
@Named(value = "paisManagedBean")
@ViewScoped
public class PaisManagedBean implements Serializable {

    @EJB
    private PaisFacadeLocal paisFacade;        
    
    private List<Pais> paises;
    private String nombreTxt;
    private int codigoTxt;

    public int getCodigoTxt() {
        return codigoTxt;
    }
    
        @Inject
    private EditarPaisManagedBean editarPaisManagedBean;

    private Pais paisEditado;

    /**
     * Creates a new instance of ClientesManagedBean
     */
    public PaisManagedBean() {
    }
    
    @PostConstruct
    public void init(){
        this.paises = paisFacade.findAll();
    }
    
    public void eliminarPais(Pais pais){
        this.paisFacade.remove(pais);
        this.paises = paisFacade.findAll();
        FacesContext.getCurrentInstance()
                .addMessage(null, new FacesMessage("Pais eliminado"));
    }
    
    public void editarPais(Pais pais) {
        this.paisEditado = pais;
        this.editarPaisManagedBean.setPaisEditado(pais);
        try {
            //redirigir
            FacesContext.getCurrentInstance()
                    .getExternalContext().redirect("editar_pais.xhtml");
        } catch (Exception ex) {

        }
    }
    
    public void agregarPais(ActionEvent ev){
        Pais pais = new Pais();
        pais.setNombre(nombreTxt);
        this.paisFacade.create(pais);
        FacesContext.getCurrentInstance()
                .addMessage(null, new FacesMessage("Pais Ingresado"));

    }
    
    public List<Pais> getPaises() {
        return paises;
    }

    public void setPaises(List<Pais> paises) {
        this.paises = paises;
    }

    public String getNombreTxt() {
        return nombreTxt;
    }

    public void setNombreTxt(String nombreTxt) {
        this.nombreTxt = nombreTxt;
    }
    
}
