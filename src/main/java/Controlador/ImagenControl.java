/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.ImagenDAO;
import Modelo.Imagen;
import com.swingimagenes.control.ControlImagenes;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ColorConvertOp;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public BufferedImage blurImagen(BufferedImage im) {
        BufferedImage bufferedImage = null;
        try {
            bufferedImage = im;
            Kernel kernel = new Kernel(3, 3, new float[]{1f / 9f, 1f / 9f, 1f / 9f,
                1f / 9f, 1f / 9f, 1f / 9f, 1f / 9f, 1f / 9f, 1f / 9f});
            BufferedImageOp op = new ConvolveOp(kernel);
            bufferedImage = op.filter(bufferedImage, null);
        } catch (Exception ex) {
            Logger.getLogger(ControlImagenes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bufferedImage;
    }

    public BufferedImage greyScaleImagen(BufferedImage im) {
        BufferedImage bufferedImage = null;
        try {
            bufferedImage = im;

            BufferedImageOp op = new ColorConvertOp(ColorSpace.getInstance(ColorSpace.CS_GRAY), null);

            op = new ConvolveOp(new Kernel(3, 3, new float[]{.1111f, .1111f, .1111f, .1111f, .1111f, .1111f, .1111f, .1111f, .1111f,}));

            bufferedImage = op.filter(bufferedImage, null);
        } catch (Exception ex) {
            Logger.getLogger(ControlImagenes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bufferedImage;
    }

}
