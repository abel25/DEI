/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Controlador.ImagenControl;
import Vista.ImagenVista;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import org.fest.swing.fixture.FrameFixture;
import org.fest.swing.fixture.JFileChooserFixture;
import org.fest.swing.fixture.JMenuItemFixture;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

/**
 *
 * @author AbelDiego
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestZBufferImage {
    private FrameFixture frame;
    File file = new File("src\\main\\resources\\imagenes\\chal.png");
    File file2 = new File("src\\main\\resources\\imagenes\\charg.png");

    public TestZBufferImage() {
    }

    //@BeforeClass
    //public static void setUpClass() {
    //}

    //@AfterClass
    //public static void tearDownClass() {
    //}

    @Before
    public void setUp() {
        frame = new FrameFixture(new ImagenVista());
        frame.show();
    }

    @After
    public void tearDown() {
        frame.cleanUp();
    }
    @Test
    public void menuAdd(){
        JMenuItemFixture menu = frame.menuItem("menu1");
        menu.click();
        JMenuItemFixture add = frame.menuItem("add");
        add.click();
        JFileChooserFixture choser = frame.fileChooser("choser");
        choser.setCurrentDirectory(file);
        choser.selectFile(file);
        choser.approve();
       
        menu.click();
        add.click();
        choser.selectFile(file2);
        choser.approve();
        
        menu.click();
        add.click();
        choser.selectFile(file);
        choser.approve();
    }
    
    @Test
    public void comparaDosBuffered() {
        try {
            BufferedImage bi = ImageIO.read(file);
            BufferedImage bi2 = ImageIO.read(file2);
            assertFalse(compareImages(bi, bi2));
            assertTrue(compareImages(bi, bi));
        } catch (IOException ex) {
            Logger.getLogger(TestZBufferImage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static boolean compareImages(BufferedImage imgA, BufferedImage imgB) {
        // The images mush be the same size.
        if (imgA.getWidth() == imgB.getWidth() && imgA.getHeight() == imgB.getHeight()) {
            int width = imgA.getWidth();
            int height = imgA.getHeight();
            // Loop over every pixel.
            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    // Compare the pixels for equality.
                    if (imgA.getRGB(x, y) != imgB.getRGB(x, y)) {
                        return false;
                    }
                }
            }
        } else {
            return false;
        }     
        return true;
    }

}
