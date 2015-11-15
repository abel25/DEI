/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Controlador.ImagenControl;
import Vista.ImagenVista;
import java.awt.Color;
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
public class TestMenuItems {
    
    private FrameFixture frame;
    File file = new File("src\\main\\resources\\imagenes\\chal.png");
    File file2 = new File("src\\main\\resources\\imagenes\\charg.png");
    File file3 = new File("src\\main\\resources\\imagenes\\cuda.png");
    File file4 = new File("src\\main\\resources\\imagenes\\yenko.png");
    private ImagenControl imagencontrol;
    private ImagenVista imagenVista;

    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
    
    @Before
    public void setUp() {
        imagenVista = new ImagenVista();
        imagencontrol = imagenVista.getImagencontrol();
        frame = new FrameFixture(imagenVista);
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
        choser.selectFile(file3);
        choser.approve();
       
        menu.click();
        add.click();
        choser.selectFile(file4);
        choser.approve();
        
        assertEquals(imagencontrol.getTamaño(), 4);
    }
    
    @Test
    public void menuBSave(){
        menuAdd();
        JMenuItemFixture menu = frame.menuItem("menu1");
        menu.click();
        JMenuItemFixture save = frame.menuItem("save");
        save.click();
    }
    
    @Test
    public void menuCLoad(){
        JMenuItemFixture menu = frame.menuItem("menu1");
        menu.click();
        JMenuItemFixture load = frame.menuItem("load");
        load.click();
    }
    
    @Test
    public void menuDelete(){
        menuCLoad();
        JMenuItemFixture menu = frame.menuItem("menu1");
        menu.click();
        JMenuItemFixture delete = frame.menuItem("delete");
        delete.click();
        
        assertEquals(imagencontrol.getTamaño(), 3);
    }
    
}
