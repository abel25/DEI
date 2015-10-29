/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.ImagenDAO;
import Modelo.Imagen;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author ABEL
 */
public class ImagenControl {

    ArrayImagen carreteImagenes;

    public ImagenControl() {
        carreteImagenes = new ArrayImagen();
    }

    public int getTamaño() {
        return carreteImagenes.getTamaño();
    }

    public void addImagen(Imagen imagen) {
        carreteImagenes.addImagen(imagen);
    }

    public void siguienteImagen() {
        carreteImagenes.pasarImagen();
    }

    public void atrasImagen() {
        carreteImagenes.volverImagen();
    }

    public Imagen getCurrentImagen() {
        Imagen imagen = carreteImagenes.getImage(carreteImagenes.getCurrentIndexImagen());
        return imagen;
    }

    public Imagen getNextCurrentImagen() {
        Imagen imagen = carreteImagenes.getImage(carreteImagenes.getNextIndexImagen());
        return imagen;
    }

    public Imagen getBackCurrentImagen() {
        Imagen imagen = carreteImagenes.getImage(carreteImagenes.getBackIndexImagen());
        return imagen;
    }

    public void salvar() {
        ImagenDAO imagenDAO = new ImagenDAO();
        imagenDAO.save(carreteImagenes.getImagenes());
    }

    public void cargar() {
        ImagenDAO imagenDAO = new ImagenDAO();
        carreteImagenes.setImagenes(imagenDAO.load());
    }

}
