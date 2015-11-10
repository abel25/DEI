package Modelo;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ABEL
 */
public class Imagen {
    
    private String pathImagen;
    private String pathBlur;
    private String pathGrey;
    private String pathPintar;
    private String tipo;
    private int heightIcono;
    private int widthIcono;
    private int heightGrande;
    private int widthGrande;
    private final int iconoMax=20;
    private final int grandeMax=199;

    public Imagen() {
        tipo=null;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getPathPintar() {
        return pathPintar;
    }

    public void setPathPintar(String pathPintar) {
        this.pathPintar = pathPintar;
    }

    public String getpathGrey() {
        return pathGrey;
    }

    public void setpathGrey(String pathGrey) {
        this.pathGrey = pathGrey;
    }
    
    public String getpathBlur() {
        return pathBlur;
    }

    public void setpathBlur(String pathBlur) {
        this.pathBlur = pathBlur;
    }

    public String getPathImagen() {
        return pathImagen;
    }

    public void setPathImagen(String pathImagen) {
        this.pathImagen = pathImagen;
    }

    public Imagen(String pathImagen) {
        this.pathImagen = pathImagen;
    }
    
    public void dimensionar(){
        try {
            BufferedImage image=ImageIO.read(new File(pathImagen));
            int widthOriginal=image.getWidth();
            int heightOriginal=image.getHeight();
            if(widthOriginal<heightOriginal){
                heightIcono=iconoMax;
                widthIcono=iconoMax*widthOriginal/heightOriginal;
                heightGrande=grandeMax;
                widthGrande=grandeMax*widthOriginal/heightOriginal;
            }else{
                heightIcono=iconoMax*heightOriginal/widthOriginal;
                widthIcono=iconoMax;
                heightGrande=grandeMax*heightOriginal/widthOriginal;
                widthGrande=grandeMax;
            }
        } catch (IOException ex) {
            Logger.getLogger(Imagen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getHeightIcono() {
        return heightIcono;
    }

    public int getWidthIcono() {
        return widthIcono;
    }

    public int getHeightGrande() {
        return heightGrande;
    }

    public int getWidthGrande() {
        return widthGrande;
    }
    
}
