/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import view.ApplicationView;
import model.Model;
/**
 *
 * @author Eva Mateos Francisco
 */
public class Controller {
    
    Model model;
    ApplicationView view;
    

    public Controller(Model model, ApplicationView view) {
        this.model = model;
        this.view = view;
        view.setController(this);
    }
    
    
    //INICIALIZACION DE LA APLICACION
    public void initApplication(){
        
        //INICIALIZACION DE LA APLICACION
        if(model.loadStateApplication()){
            view.showApplicationStart("Cargado estado anterior con exito");
        }else{
            view.showApplicationStart("No se encontró fichero para carga del programa");
        }
        
        //MOSTRAR MENU PRINCIPAL
        view.showMainMenu();
        
        
        //FINALIZACION DE LA APLICACION
        if(model.saveApplicationState()){
            view.showApplicationEnd("Guardado el estado de la aplicación.\nSaliendo...");
        }else{
            view.showApplicationEnd("No se pudo guardar el estado de la aplicación.\nSaliendo...");
        }
        
    }
    
    
    
  
    //COMUNICACION ENTRE LA VISTA Y EL MODELO
    
    
    

    
    
    
    
    
}


