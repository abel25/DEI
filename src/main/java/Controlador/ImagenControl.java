/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.ImagenDAO;
import Modelo.Imagen;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.Transparency;
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
    
    public String tipo(){
        return carreteImagenes.obtenerTipo();
    }
    
    public int getTamaño() {
        return carreteImagenes.getTamaño();
    }

    public void addImagen(Imagen imagen) {
        carreteImagenes.addImagen(imagen);
    }

    public void borrarImagen(Imagen imagen) {
        carreteImagenes.removeImagen(imagen);
    }

    public void borrarTodo() {
        carreteImagenes.removeAll();
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

    public BufferedImage normalImagen(BufferedImage im) {
        BufferedImage bufferedImage = null;

        return bufferedImage;
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
            Logger.getLogger(ImagenControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bufferedImage;
    }

    public BufferedImage greyScaleImagen(BufferedImage inputImage) {
        BufferedImage img = new BufferedImage(inputImage.getWidth(), inputImage.getHeight(), BufferedImage.TYPE_BYTE_GRAY);
        Graphics g = img.getGraphics();
        g.drawImage(inputImage, 0, 0, null);
        g.dispose();
        return img;
    }
    
}
/**
public BufferedImage TIPO1greyScaleImagen(BufferedImage im) {
        BufferedImage bufferedImage = null;
        try {
            bufferedImage = im;

            BufferedImageOp op = new ColorConvertOp(ColorSpace.getInstance(ColorSpace.CS_GRAY), null);

            op = new ConvolveOp(new Kernel(3, 3, new float[]{.1111f, .1111f, .1111f, .1111f, .1111f, .1111f, .1111f, .1111f, .1111f,}));

            bufferedImage = op.filter(bufferedImage, null);
        } catch (Exception ex) {
            Logger.getLogger(ImagenControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bufferedImage;
    }

    public BufferedImage TIPO2greyScaleImagen(BufferedImage bi) {
        BufferedImage biDestino = null;
        try {
            biDestino = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration()
                    .createCompatibleImage(bi.getWidth(), bi.getHeight(), Transparency.OPAQUE);
            //Recorre las imagenes y obtiene el color de la imagen original y la almacena en el destino
            for (int x = 0; x < bi.getWidth(); x++) {
                for (int y = 0; y < bi.getHeight(); y++) {
                    //Obtiene el color
                    Color c1 = new Color(bi.getRGB(x, y));
                    //Calcula la media de tonalidades
                    int med = (c1.getRed() + c1.getGreen() + c1.getBlue()) / 3;
                    //Almacena el color en la imagen destino
                    biDestino.setRGB(x, y, new Color(med, med, med).getRGB());
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(ImagenControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return biDestino;
    }
    * */
