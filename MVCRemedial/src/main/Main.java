/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import views.*;
import models.*;
import controllers.*;
/**
 *
 * @author ninte
 */
public class Main {
    private static ViewOperaciones viewOperaciones;
    private static ModelOperaciones modelOperaciones;
    private static ControllerOperaciones controllerOperaciones;
    private static ViewMayor viewMayor;
    private static ModelMayor modelMayor;
    private static ControllerMayor controllerMayor;
    private static ViewOrdenar viewOrdenar;
    private static ModelOrdenar modelOrdenar;
    private static ControllerOrdenar controllerOrdenar;
    private static ViewEditorTexto viewEditorTexto;
    private static ModelEditorTexto modelEditorTexto;
    private static ControllerEditorTexto controllerEditorTexto;
    private static ViewPrincipal viewPrincipal;
    private static ModelPrincipal modelPrincipal;
    private static ControllerPrincipal controllerPrincipal;
    
    public static void main(String[]er){
        viewOperaciones = new ViewOperaciones();
        modelOperaciones = new ModelOperaciones();
        controllerOperaciones = new ControllerOperaciones (viewOperaciones, modelOperaciones);
        viewMayor = new ViewMayor();
        modelMayor = new ModelMayor();
        controllerMayor = new ControllerMayor (viewMayor, modelMayor);
        viewOrdenar = new ViewOrdenar();
        modelOrdenar = new ModelOrdenar();
        controllerOrdenar = new ControllerOrdenar(viewOrdenar, modelOrdenar);
        viewEditorTexto = new ViewEditorTexto();
        modelEditorTexto = new ModelEditorTexto();
        controllerEditorTexto = new ControllerEditorTexto (viewEditorTexto, modelEditorTexto);
        modelPrincipal = new ModelPrincipal();
        viewPrincipal = new ViewPrincipal();
        controllerPrincipal = new ControllerPrincipal(viewPrincipal, viewMayor, viewOperaciones, viewOrdenar, viewEditorTexto, modelPrincipal);
    }
}
