/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import models.ModelOrdenar;
import views.ViewOrdenar;

/**
 *
 * @author ninte
 */
public class ControllerOrdenar {
    ModelOrdenar modelOrdenar;
    ViewOrdenar viewOrdenar;
    public ControllerOrdenar(ViewOrdenar viewOrdenar, ModelOrdenar modelOrdenar){
        this.modelOrdenar = modelOrdenar;
        this.viewOrdenar = viewOrdenar;
        initView();
    }
    public void initView(){
        viewOrdenar.jtf_agregar.setText(""+modelOrdenar.getNumero1());
        viewOrdenar.jbtn_agregar.addActionListener(e->jbtn_agregar_click());
        viewOrdenar.jbtn_asc.addActionListener(e->jbtn_asc_click());
        viewOrdenar.jbtn_prom.addActionListener(e->jbtn_prom_click());
        modelOrdenar.modeloLista();
        viewOrdenar.jli_numeros.setModel(modelOrdenar.getModelo());
    }
    public void jbtn_agregar_click(){
        modelOrdenar.setNumero1(Double.parseDouble(viewOrdenar.jtf_agregar.getText()));
        modelOrdenar.Agregar();
    }
    public void jbtn_asc_click(){
        modelOrdenar.OrdenarAscendente();
        viewOrdenar.jli_numeros.setModel(modelOrdenar.getModelo());
    }
    public void jbtn_prom_click(){
        modelOrdenar.Promedio();
        viewOrdenar.jtf_prom.setText(""+modelOrdenar.getNumero2());
    }
}
