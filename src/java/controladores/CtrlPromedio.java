/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author ANIPROXTOART
 */
@Named(value = "ctrlPromedio")
@RequestScoped
public class CtrlPromedio {

    private double matematicas;
    private double ingles;
    private double historia;
    private double geografia;
    private double espaniol;

    public double getMatematicas() {
        return matematicas;
    }

    public void setMatematicas(double matematicas) {
        this.matematicas = matematicas;
    }

    public double getIngles() {
        return ingles;
    }

    public void setIngles(double ingles) {
        this.ingles = ingles;
    }

    public double getHistoria() {
        return historia;
    }

    public void setHistoria(double historia) {
        this.historia = historia;
    }

    public double getGeografia() {
        return geografia;
    }

    public void setGeografia(double geografia) {
        this.geografia = geografia;
    }

    public double getEspaniol() {
        return espaniol;
    }

    public void setEspaniol(double espaniol) {
        this.espaniol = espaniol;
    }

    public void calculaPromedio() {
        double promedio = 0.0;
        promedio = (matematicas + ingles + historia + geografia + espaniol) / 5;
        FacesContext.getCurrentInstance()
                .addMessage(null, new FacesMessage("Su promedio es: " + promedio));
    }

}
