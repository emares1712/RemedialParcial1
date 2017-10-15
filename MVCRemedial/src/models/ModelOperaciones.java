/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author ninte
 */
public class ModelOperaciones {
    private int n1 = 1;
    private int n2 = 2;
    private int r = 3;
    public int getN1(){
        return n1;
    }
    public void setN1(int n1){
        this.n1 = n1;
    }
    public int getN2(){
        return n1;
    }
    public void setN2(int n2){
        this.n2 = n2;
    }
    public int getR(){
        return r;
    }
    public void setR(int r){
        this.r = r;
    }
    public void suma(){
        r = n1 + n2;
    }
    public void resta(){
        r = n1 - n2;
    }
    public void mul(){
        r = n1 * n2;
    }
    public void div(){
        r = n1 / n2;
    }
}
