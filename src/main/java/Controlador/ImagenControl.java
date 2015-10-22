/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Imagen;
import java.util.ArrayList;

/**
 *
 * @author ABEL
 */
public class ImagenControl {
    
    ArrayImagen imagenes;

    public ImagenControl() {
            imagenes = new ArrayImagen();
    }
    
    public int getTamaño(){
        return imagenes.getTamaño();
    }
 
    public void addImagen(Imagen imagen){
        imagenes.addImagen(imagen);
    }
    
    public void siguienteImagen(){
        imagenes.pasarImagen();
    }
    
    public Imagen getCurrentImagen(){
        Imagen imagen = imagenes.getImage(imagenes.getCurrentIndexImagen());
        return imagen;
    }
    
    public Imagen getNextCurrentImagen(){
        Imagen imagen = imagenes.getImage(imagenes.getNextIndexImagen());
        return imagen;
    }
    
    public Imagen getBackCurrentImagen(){
        Imagen imagen = imagenes.getImage(imagenes.getBackIndexImagen());
        return imagen;
    }
}

