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
 * @author dam2
 */
public class ArrayImagen {

    private ArrayList<Imagen> imagenes;
    private int currentIndexImagen;

    public ArrayImagen() {
        imagenes = new ArrayList<>();
        currentIndexImagen = 0;
    }

    public ArrayList<Imagen> getImagenes() {
        return imagenes;
    }

    public void setImagenes(ArrayList<Imagen> imagenes) {
        this.imagenes = imagenes;
    }

    public void setCurrentIndexImagen(int currentIndexImagen) {
        this.currentIndexImagen = currentIndexImagen;
    }

    public void addImagen(Imagen imagen) {
        imagenes.add(imagen);
    }

    public int getTamaño() {
        return imagenes.size();
    }

    public Imagen getImage(int index) {
        return imagenes.get(index);
    }

    public int getCurrentIndexImagen() {
        return currentIndexImagen;
    }

    public int getNextIndexImagen() {
        return (currentIndexImagen + 1) % imagenes.size();
    }

    public int getBackIndexImagen() {
        return (currentIndexImagen + 2) % imagenes.size();
    }

    public void pasarImagen() {
        this.currentIndexImagen++;
        this.currentIndexImagen %= imagenes.size();
    }

    public void volverImagen() {
        this.currentIndexImagen--;
        if(currentIndexImagen<0){
            this.currentIndexImagen=imagenes.size()-1;
        } else {
        } 
    }
}
