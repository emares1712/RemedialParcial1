/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import javax.swing.*;
/**
 *
 * @author ninte
 */
public class ModelOrdenar {
    private DefaultListModel modelo;
    private double numero1 = 1.0;
    private double numero2 = 1.0;
    
    public double getNumero1(){
        return numero1;    
    }
    public void setNumero1(double numero1){
        this.numero1 = numero1;
    }
    public double getNumero2(){
        return numero2;
    }
    public void setNumero2(double numero2){
        this.numero2 = numero2;
    }
    public DefaultListModel getModelo(){
        return modelo;
    }
    public void modeloLista(){
        modelo = new DefaultListModel();
    }
    public void Agregar(){
        modelo.addElement(numero1);
    }
    public void OrdenarAscendente(){
        double array = modelo.getSize();
        int parseo;
        double val;
        for(int i = 0; i < array; i++){
            for(int j = 0; j < array - 1; j++){
                parseo = j + 1;
                if(Double.parseDouble(modelo.getElementAt(j).toString()) > Double.parseDouble(modelo.getElementAt(parseo).toString())){
                val = Double.parseDouble(modelo.getElementAt(parseo).toString());
                modelo.setElementAt(modelo.getElementAt(j), parseo);
                modelo.setElementAt(val, j);
                }
            }
                
        }
    }
    public void Promedio(){
        double array = modelo.getSize();
        int parseo;
        double prom = 0;
        for(int k = 0; k < array; k++){
            prom += Double.parseDouble(modelo.getElementAt(k).toString());
        }
        numero2 = prom / array;
    }
}
