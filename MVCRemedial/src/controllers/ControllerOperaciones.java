/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import views.ViewOperaciones;
import models.ModelOperaciones;
/**
 *
 * @author ninte
 */
public class ControllerOperaciones {
    ViewOperaciones viewOperaciones;
    ModelOperaciones modelOperaciones;
    public ControllerOperaciones(ViewOperaciones viewOperaciones, ModelOperaciones modelOperaciones){
        this.viewOperaciones = viewOperaciones;
        this.modelOperaciones = modelOperaciones;
        viewOperaciones.jbtnsuma.addActionListener(e->jbtnsuma_click());
        viewOperaciones.jbtnresta.addActionListener(e->jbtnresta_click());
        viewOperaciones.jbtnmul.addActionListener(e->jbtnmul_click());
        viewOperaciones.jbtndiv.addActionListener(e->jbtndiv_click());
        initView();
    }
    public void initView(){
        viewOperaciones.jtf_n1.setText(String.valueOf(modelOperaciones.getN1()));
        viewOperaciones.jtf_n2.setText(String.valueOf(modelOperaciones.getN2()));
        viewOperaciones.jtf_r.setText(String.valueOf(modelOperaciones.getR()));
        viewOperaciones.setVisible(true);
    }
    public void jbtnsuma_click(){
        modelOperaciones.setN1(Integer.parseInt(viewOperaciones.jtf_n1.getText()));
        modelOperaciones.setN2(Integer.parseInt(viewOperaciones.jtf_n2.getText()));
        modelOperaciones.suma();
        viewOperaciones.jtf_r.setText(String.valueOf(modelOperaciones.getR()));
    }
    public void jbtnresta_click(){
        modelOperaciones.setN1(Integer.parseInt(viewOperaciones.jtf_n1.getText()));
        modelOperaciones.setN2(Integer.parseInt(viewOperaciones.jtf_n2.getText()));
        modelOperaciones.resta();
        viewOperaciones.jtf_r.setText(String.valueOf(modelOperaciones.getR()));
    }
    public void jbtnmul_click(){
        modelOperaciones.setN1(Integer.parseInt(viewOperaciones.jtf_n1.getText()));
        modelOperaciones.setN2(Integer.parseInt(viewOperaciones.jtf_n2.getText()));
        modelOperaciones.mul();
        viewOperaciones.jtf_r.setText(String.valueOf(modelOperaciones.getR()));
    }
    public void jbtndiv_click(){
        modelOperaciones.setN1(Integer.parseInt(viewOperaciones.jtf_n1.getText()));
        modelOperaciones.setN2(Integer.parseInt(viewOperaciones.jtf_n2.getText()));
        modelOperaciones.div();
        viewOperaciones.jtf_r.setText(String.valueOf(modelOperaciones.getR()));
    }
}
