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
 * @author AbelyDiego
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestMenuItems2 {
    
    private FrameFixture frame;
//    File file = new File("src\\main\\resources\\imagenes\\chal.png");
//    File file2 = new File("src\\main\\resources\\imagenes\\charg.png");
//    File file3 = new File("src\\main\\resources\\imagenes\\cuda.png");
//    File file4 = new File("src\\main\\resources\\imagenes\\yenko.png");
    
    @Before
    public void setUp() {
        frame = new FrameFixture(new ImagenVista());
        frame.show();
    }
    
    @After
    public void tearDown() {
        frame.cleanUp();
    }
    
//    public void menuAdd(){
//        JMenuItemFixture menu = frame.menuItem("menu1");
//        menu.click();
//        JMenuItemFixture add = frame.menuItem("add");
//        add.click();
//        JFileChooserFixture choser = frame.fileChooser("choser");
//        choser.setCurrentDirectory(file);
//        choser.selectFile(file);
//        choser.approve();
//       
//        menu.click();
//        add.click();
//        choser.selectFile(file2);
//        choser.approve();
//        
//        menu.click();
//        add.click();
//        choser.selectFile(file3);
//        choser.approve();
//       
//        menu.click();
//        add.click();
//        choser.selectFile(file4);
//        choser.approve();
//    }
    
    @Test
    public void menuLoadBlur(){
        JMenuItemFixture menu = frame.menuItem("menu1");
        menu.click();
        JMenuItemFixture load = frame.menuItem("load");
        load.click();
        JMenuItemFixture menu2 = frame.menuItem("menu2");
        menu2.click();
        JMenuItemFixture blur = frame.menuItem("blur");
        blur.click();
    }
    
    @Test
    public void menuLoadGrey(){
        JMenuItemFixture menu = frame.menuItem("menu1");
        menu.click();
        JMenuItemFixture load = frame.menuItem("load");
        load.click();
        JMenuItemFixture menu2 = frame.menuItem("menu2");
        menu2.click();
        JMenuItemFixture grey = frame.menuItem("grey");
        grey.click();
    }
    
    @Test
    public void menuLoadPintar(){
        JMenuItemFixture menu = frame.menuItem("menu1");
        menu.click();
        JMenuItemFixture load = frame.menuItem("load");
        load.click();
        JMenuItemFixture menu2 = frame.menuItem("menu2");
        menu2.click();
        JMenuItemFixture p = frame.menuItem("pintarItem");
        p.click();
    }
    
}
