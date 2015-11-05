/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ImagenControl;
import Modelo.Imagen;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import org.imgscalr.Scalr;

/**
 *
 * @author ABEL
 */
public class ImagenVista extends javax.swing.JFrame {

    ImagenControl imagencontrol = null;

    /**
     * Creates new form ImagenVista
     */
    public ImagenVista() {
        initComponents();
        imagencontrol = new ImagenControl();   
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        cargar = new javax.swing.JMenuItem();
        load = new javax.swing.JMenuItem();
        save = new javax.swing.JMenuItem();
        blur = new javax.swing.JMenuItem();
        grey = new javax.swing.JMenuItem();
        panelImagen = new javax.swing.JPanel();
        imagePanel = new Vista.ImagePanel();
        panelBotones = new javax.swing.JPanel();
        botonAtras = new javax.swing.JButton();
        casilla1 = new javax.swing.JLabel();
        casilla2 = new javax.swing.JLabel();
        casilla3 = new javax.swing.JLabel();
        botonAdelante = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        cargarImg = new javax.swing.JMenu();
        cargarImagen = new javax.swing.JMenuItem();
        saveIteam = new javax.swing.JMenuItem();
        loadItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        blurItem = new javax.swing.JMenuItem();
        greyItem = new javax.swing.JMenuItem();
        pintarItem = new javax.swing.JMenuItem();

        fileChooser.setName("choser"); // NOI18N

        jPopupMenu1.setName("popup"); // NOI18N

        cargar.setText("Add");
        cargar.setName("addp"); // NOI18N
        cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(cargar);

        load.setText("Load");
        load.setName("loadp"); // NOI18N
        load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadActionPerformed(evt);
            }
        });
        jPopupMenu1.add(load);

        save.setText("Save");
        save.setName("savep"); // NOI18N
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPopupMenu1.add(save);

        blur.setText("Blur");
        blur.setName("blurp"); // NOI18N
        blur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blurActionPerformed(evt);
            }
        });
        jPopupMenu1.add(blur);

        grey.setText("Grey");
        grey.setName("greyp"); // NOI18N
        grey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greyActionPerformed(evt);
            }
        });
        jPopupMenu1.add(grey);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        imagePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        imagePanel.setComponentPopupMenu(jPopupMenu1);
        imagePanel.setName("imagePanel"); // NOI18N

        javax.swing.GroupLayout imagePanelLayout = new javax.swing.GroupLayout(imagePanel);
        imagePanel.setLayout(imagePanelLayout);
        imagePanelLayout.setHorizontalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
        );
        imagePanelLayout.setVerticalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 203, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelImagenLayout = new javax.swing.GroupLayout(panelImagen);
        panelImagen.setLayout(panelImagenLayout);
        panelImagenLayout.setHorizontalGroup(
            panelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImagenLayout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addComponent(imagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );
        panelImagenLayout.setVerticalGroup(
            panelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImagenLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(imagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelImagen);

        panelBotones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        botonAtras.setText("<");
        botonAtras.setName("atras"); // NOI18N
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });
        panelBotones.add(botonAtras);

        casilla1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        casilla1.setMaximumSize(new java.awt.Dimension(20, 20));
        casilla1.setMinimumSize(new java.awt.Dimension(20, 20));
        casilla1.setPreferredSize(new java.awt.Dimension(20, 20));
        panelBotones.add(casilla1);

        casilla2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        casilla2.setMaximumSize(new java.awt.Dimension(20, 20));
        casilla2.setMinimumSize(new java.awt.Dimension(20, 20));
        casilla2.setPreferredSize(new java.awt.Dimension(20, 20));
        panelBotones.add(casilla2);

        casilla3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        casilla3.setMaximumSize(new java.awt.Dimension(20, 20));
        casilla3.setMinimumSize(new java.awt.Dimension(20, 20));
        casilla3.setPreferredSize(new java.awt.Dimension(20, 20));
        panelBotones.add(casilla3);

        botonAdelante.setText(">");
        botonAdelante.setName("avanzar"); // NOI18N
        botonAdelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAdelanteActionPerformed(evt);
            }
        });
        panelBotones.add(botonAdelante);

        getContentPane().add(panelBotones);

        cargarImg.setText("File");
        cargarImg.setName("menu1"); // NOI18N
        cargarImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarImgActionPerformed(evt);
            }
        });

        cargarImagen.setIcon(new javax.swing.ImageIcon("C:\\Users\\ABEL\\Documents\\NetBeansProjects\\CarruselAbel\\src\\main\\resources\\imagenes\\add.png")); // NOI18N
        cargarImagen.setText("Add");
        cargarImagen.setName("add"); // NOI18N
        cargarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarImagenActionPerformed(evt);
            }
        });
        cargarImg.add(cargarImagen);

        saveIteam.setIcon(new javax.swing.ImageIcon("C:\\Users\\ABEL\\Documents\\NetBeansProjects\\CarruselAbel\\src\\main\\resources\\imagenes\\save.png")); // NOI18N
        saveIteam.setText("Save");
        saveIteam.setName("save"); // NOI18N
        saveIteam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveIteamActionPerformed(evt);
            }
        });
        cargarImg.add(saveIteam);

        loadItem.setIcon(new javax.swing.ImageIcon("C:\\Users\\ABEL\\Documents\\NetBeansProjects\\CarruselAbel\\src\\main\\resources\\imagenes\\load.png")); // NOI18N
        loadItem.setText("Load");
        loadItem.setName("load"); // NOI18N
        loadItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadItemActionPerformed(evt);
            }
        });
        cargarImg.add(loadItem);

        jMenuBar1.add(cargarImg);

        jMenu2.setText("Edit");
        jMenu2.setName("menu2"); // NOI18N

        blurItem.setText("Blur");
        blurItem.setName("blur"); // NOI18N
        blurItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blurItemActionPerformed(evt);
            }
        });
        jMenu2.add(blurItem);

        greyItem.setText("GreyScale");
        greyItem.setName("grey"); // NOI18N
        greyItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greyItemActionPerformed(evt);
            }
        });
        jMenu2.add(greyItem);

        pintarItem.setText("Pintar");
        pintarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pintarItemActionPerformed(evt);
            }
        });
        jMenu2.add(pintarItem);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarImgActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cargarImgActionPerformed

    private void cargarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarImagenActionPerformed
        // TODO add your handling code here:
        fileChooser.showOpenDialog(this);
        Imagen imagen = new Imagen(fileChooser.getSelectedFile().getPath());
        imagencontrol.addImagen(imagen);
 
        pintarArrayImagen();
    }//GEN-LAST:event_cargarImagenActionPerformed

    private void botonAdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAdelanteActionPerformed
        // TODO add your handling code here:
        imagencontrol.siguienteImagen();
        pintarArrayImagen();
    }//GEN-LAST:event_botonAdelanteActionPerformed

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        // TODO add your handling code here:
        imagencontrol.atrasImagen();
        pintarArrayImagen();
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void saveIteamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveIteamActionPerformed
        // TODO add your handling code here:
        imagencontrol.salvar();
    }//GEN-LAST:event_saveIteamActionPerformed

    private void loadItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadItemActionPerformed
        // TODO add your handling code here:
        imagencontrol.cargar();
        pintarArrayImagen();
    }//GEN-LAST:event_loadItemActionPerformed

    private void blurItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blurItemActionPerformed
        // TODO add your handling code here:
       imagePanel.setImagen(imagencontrol.blurImagen(imagePanel.getImagen()));
    }//GEN-LAST:event_blurItemActionPerformed

    private void greyItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greyItemActionPerformed
        // TODO add your handling code here:
        imagePanel.setImagen(imagencontrol.greyScaleImagen(imagePanel.getImagen()));
    }//GEN-LAST:event_greyItemActionPerformed

    private void cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarActionPerformed
        // TODO add your handling code here:
        cargarImagenActionPerformed(evt);
    }//GEN-LAST:event_cargarActionPerformed

    private void loadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadActionPerformed
        // TODO add your handling code here:
        loadItemActionPerformed(evt);
    }//GEN-LAST:event_loadActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        saveIteamActionPerformed(evt);
    }//GEN-LAST:event_saveActionPerformed

    private void blurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blurActionPerformed
        // TODO add your handling code here:
        blurItemActionPerformed(evt);
    }//GEN-LAST:event_blurActionPerformed

    private void greyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greyActionPerformed
        // TODO add your handling code here:
        greyItemActionPerformed(evt);
    }//GEN-LAST:event_greyActionPerformed

    private void pintarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pintarItemActionPerformed
        try {                                           
            BufferedImage image = ImageIO.read(new File(imagencontrol.getCurrentImagen().getPathImagen()));
            File f = new File("MyFile.jpg");
            Graphics2D g = image.createGraphics();
            g.fillRect(0, 0, image.getWidth(), image.getHeight());
            g.setColor(Color.RED);
            g.drawLine(0, 0, image.getWidth(), image.getHeight());
            //g.dispose();
            try {
                ImageIO.write(Scalr.rotate(image, Scalr.Rotation.FLIP_VERT, null), "jpg", f);
                //imagePanel.setImagen(Scalr.resize(image, Scalr.Mode.AUTOMATIC, imagencontrol.getCurrentImagen().getWidthGrande(), imagencontrol.getCurrentImagen().getHeightGrande(), null));
            } catch (IOException ex) {
                Logger.getLogger(Imagen.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (IOException ex) {
            Logger.getLogger(ImagenVista.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_pintarItemActionPerformed

    public void pintarArrayImagen() {
        BufferedImage ima;
        try {
            switch (imagencontrol.getTamaño()) {

                default:
                    ima = ImageIO.read(new File(imagencontrol.getBackCurrentImagen().getPathImagen()));
                    casilla1.setIcon(new ImageIcon(ima.getScaledInstance(imagencontrol.getBackCurrentImagen().getWidthIcono(), imagencontrol.getBackCurrentImagen().getHeightIcono(), Image.SCALE_DEFAULT)));
                    ;
                case 2:
                    ima = ImageIO.read(new File(imagencontrol.getNextCurrentImagen().getPathImagen()));
                    casilla3.setIcon(new ImageIcon(ima.getScaledInstance(imagencontrol.getNextCurrentImagen().getWidthIcono(), imagencontrol.getNextCurrentImagen().getHeightIcono(), Image.SCALE_DEFAULT)));
                case 1:
                    ima = ImageIO.read(new File(imagencontrol.getCurrentImagen().getPathImagen()));
                    casilla2.setIcon(new ImageIcon(ima.getScaledInstance(imagencontrol.getCurrentImagen().getWidthIcono(), imagencontrol.getCurrentImagen().getHeightIcono(), Image.SCALE_DEFAULT)));
                    BufferedImage im = ImageIO.read(new File(imagencontrol.getCurrentImagen().getPathImagen()));
                    imagePanel.setImagen(Scalr.resize(im, Scalr.Mode.AUTOMATIC, imagencontrol.getCurrentImagen().getWidthGrande(), imagencontrol.getCurrentImagen().getHeightGrande(), null));
            }
        } catch (IOException ex) {
            Logger.getLogger(ImagenVista.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ImagenVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImagenVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImagenVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImagenVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImagenVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem blur;
    private javax.swing.JMenuItem blurItem;
    private javax.swing.JButton botonAdelante;
    private javax.swing.JButton botonAtras;
    private javax.swing.JMenuItem cargar;
    private javax.swing.JMenuItem cargarImagen;
    private javax.swing.JMenu cargarImg;
    private javax.swing.JLabel casilla1;
    private javax.swing.JLabel casilla2;
    private javax.swing.JLabel casilla3;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JMenuItem grey;
    private javax.swing.JMenuItem greyItem;
    private Vista.ImagePanel imagePanel;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenuItem load;
    private javax.swing.JMenuItem loadItem;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelImagen;
    private javax.swing.JMenuItem pintarItem;
    private javax.swing.JMenuItem save;
    private javax.swing.JMenuItem saveIteam;
    // End of variables declaration//GEN-END:variables
}
