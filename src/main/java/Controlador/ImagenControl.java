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
    
    private ArrayList<Imagen> imagenes;

    public ImagenControl() {
        imagenes = new ArrayList();
    }
    
    public void addImagen(Imagen im){
        imagenes.add(im);
    }
    
    public int tamanoArrayImg(){
        return imagenes.size();
    }
    
}
