/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import views.*;
import models.*;
/**
 *
 * @author ninte
 */
public class ControllerPrincipal {
    ViewPrincipal viewPrincipal;
    ViewMayor viewMayor;
    ViewOperaciones viewOperaciones;
    ViewEditorTexto viewEditorTexto;
    ViewOrdenar viewOrdenar;
    ModelPrincipal modelPrincipal;
    public ControllerPrincipal(ViewPrincipal viewPrincipal, ViewMayor viewMayor, ViewOperaciones viewOperaciones, ViewOrdenar viewOrdenar, ViewEditorTexto viewEditorTexto, ModelPrincipal modelPrincipal){
        this.viewPrincipal = viewPrincipal;
        this.viewMayor = viewMayor;
        this.viewOperaciones = viewOperaciones;
        this.viewEditorTexto = viewEditorTexto;
        this.viewOrdenar = viewOrdenar;
        this.modelPrincipal = modelPrincipal;
        this.viewPrincipal.jmi_mayor.addActionListener(e->jmi_mayor_click());
        this.viewPrincipal.jmi_operaciones.addActionListener(e->jmi_operaciones_click());
        this.viewPrincipal.jmi_ordenar.addActionListener(e->jmi_ordenar_click());
        this.viewPrincipal.jmi_bloc.addActionListener(e->jmi_bloc_click());
        initView();
    }
    public void jmi_mayor_click(){
        this.viewPrincipal.setContentPane(viewMayor);
        this.viewPrincipal.revalidate();
        this.viewPrincipal.repaint();
    }
    public void jmi_operaciones_click(){
        this.viewPrincipal.setContentPane(viewOperaciones);
        this.viewPrincipal.revalidate();
        this.viewPrincipal.repaint();
    }
    public void jmi_ordenar_click(){
        this.viewPrincipal.setContentPane(viewOrdenar);
        this.viewPrincipal.revalidate();
        this.viewPrincipal.repaint();
    }
    public void jmi_bloc_click(){
        this.viewPrincipal.setContentPane(viewEditorTexto);
        this.viewPrincipal.revalidate();
        this.viewPrincipal.repaint();
    }
    private void initView(){
        this.viewPrincipal.setTitle("Remedial (1° Parcial)");
        this.viewPrincipal.setLocationRelativeTo(null);
        this.viewPrincipal.setVisible(true);
    }
}
