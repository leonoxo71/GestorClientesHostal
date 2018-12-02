/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.usm.GestorClientesHostalApp.controllers;


import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.event.ActionEvent;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Alexsander
 */
@Named(value = "clientesManagedBean")
@ViewScoped
public class ClientesManagedBean implements Serializable{


        

    
    private String nombreTxt;
    private String ap_paternoTxt;
    private String ap_maternoTxt;
    private String rutTxt;
    private String direccionTxt;
    private String telefonoTxt;
    private String mailTxt;
    private int ciudadTxt;
    private int paisTxt;

    /**
     * Creates a new instance of ClientesManagedBean
     */
    public ClientesManagedBean() {
    }
    
    public void agregarProducto(ActionEvent ev){
        
    }

    public String getNombreTxt() {
        return nombreTxt;
    }

    public void setNombreTxt(String nombreTxt) {
        this.nombreTxt = nombreTxt;
    }

    public String getAp_paternoTxt() {
        return ap_paternoTxt;
    }

    public void setAp_paternoTxt(String ap_paternoTxt) {
        this.ap_paternoTxt = ap_paternoTxt;
    }

    public String getAp_maternoTxt() {
        return ap_maternoTxt;
    }

    public void setAp_maternoTxt(String ap_maternoTxt) {
        this.ap_maternoTxt = ap_maternoTxt;
    }

    public String getRutTxt() {
        return rutTxt;
    }

    public void setRutTxt(String rutTxt) {
        this.rutTxt = rutTxt;
    }

    public String getDireccionTxt() {
        return direccionTxt;
    }

    public void setDireccionTxt(String direccionTxt) {
        this.direccionTxt = direccionTxt;
    }

    public String getTelefonoTxt() {
        return telefonoTxt;
    }

    public void setTelefonoTxt(String telefonoTxt) {
        this.telefonoTxt = telefonoTxt;
    }

    public String getMailTxt() {
        return mailTxt;
    }

    public void setMailTxt(String mailTxt) {
        this.mailTxt = mailTxt;
    }

    public int getCiudadTxt() {
        return ciudadTxt;
    }

    public void setCiudadTxt(int ciudadTxt) {
        this.ciudadTxt = ciudadTxt;
    }

    public int getPaisTxt() {
        return paisTxt;
    }

    public void setPaisTxt(int paisTxt) {
        this.paisTxt = paisTxt;
    }

   
    
    
}
