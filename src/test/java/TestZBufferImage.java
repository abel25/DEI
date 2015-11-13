/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dam2
 */
public class TestZBufferImage {
    
    File file = new File("src\\main\\resources\\imagenes\\chal.png");
    File file2 = new File("src\\main\\resources\\imagenes\\charg.png");

    public TestZBufferImage() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void comparaDosBuffered() {
        try {
            BufferedImage bi = ImageIO.read(new File("src\\main\\resources\\imagenes\\chal.png"));
            BufferedImage bi2 = ImageIO.read(new File("src\\main\\resources\\imagenes\\charg.png"));
            assertTrue(compareImages(bi, bi2));
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
