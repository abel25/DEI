/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Vista.ImagenVista;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;
import org.fest.swing.fixture.FrameFixture;
import org.fest.swing.fixture.JButtonFixture;
import org.fest.swing.fixture.JFileChooserFixture;
import org.fest.swing.fixture.JMenuItemFixture;
import org.fest.swing.fixture.JPanelFixture;
import org.fest.swing.fixture.JPopupMenuFixture;
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
 * @author AbelyDiego
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestPopUp {
    
    private FrameFixture frame;
    File file = new File("src\\main\\resources\\imagenes\\chal.png");
    File file2 = new File("src\\main\\resources\\imagenes\\charg.png");
    File file3 = new File("src\\main\\resources\\imagenes\\cuda.png");
    File file4 = new File("src\\main\\resources\\imagenes\\yenko.png");

    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
    
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
    public void probarPopUpAAdd(){
        
        JPanelFixture img = frame.panel("imagePanel");
        img.rightClick();
        
        JMenuItemFixture addp = frame.menuItem("addp");
        addp.click();
        
        JFileChooserFixture choser = frame.fileChooser("choser");
        choser.setCurrentDirectory(file);
        choser.selectFile(file);
        choser.approve();

        img.rightClick();

        addp.click();
        
        choser.setCurrentDirectory(file);
        choser.selectFile(file2);
        choser.approve();
        
        img.rightClick();

        addp.click();
        
        choser.setCurrentDirectory(file);
        choser.selectFile(file3);
        choser.approve();
        
        img.rightClick();

        addp.click();
        
        choser.setCurrentDirectory(file);
        choser.selectFile(file4);
        choser.approve();
    }
    
    @Test
    public void probarPopUpBSave(){
        probarPopUpAAdd();
        
        JPanelFixture img = frame.panel("imagePanel");
        img.rightClick();
        
        JMenuItemFixture savep = frame.menuItem("savep");
        savep.click();
    }
    
    @Test
    public void probarPopUpCLoad(){
        JPanelFixture img = frame.panel("imagePanel");
        img.rightClick();
        
        JMenuItemFixture loadp = frame.menuItem("loadp");
        loadp.click();
    }
    
    @Test
    public void probarPopUpDLoadBlur(){
        probarPopUpCLoad();
        
        JPanelFixture img = frame.panel("imagePanel");
        img.rightClick();
        
        JMenuItemFixture blurp = frame.menuItem("blurp");
        blurp.click();
    }
    
    @Test
    public void probarPopUpELoadGrey(){
        probarPopUpCLoad();
        
        JPanelFixture img = frame.panel("imagePanel");
        img.rightClick();
        
        JMenuItemFixture greyp = frame.menuItem("greyp");
        greyp.click();
    }
}