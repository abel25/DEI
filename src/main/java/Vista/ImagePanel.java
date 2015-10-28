/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 *
 * @author Victor
 */
public class ImagePanel extends JPanel{
    private BufferedImage imagen;

    public BufferedImage getImagen() {
        return imagen;
    }

    public void setImagen(BufferedImage imagen) {
        this.imagen = imagen;
        this.repaint();
    }
    
    @Override
    public void paint(Graphics grphcs) {
        super.paintComponent(grphcs);
        grphcs.drawImage(imagen,0, 0, null);
    }
}
