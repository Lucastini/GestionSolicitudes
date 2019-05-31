/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import presentacion.VentanaPrincipal;
import presentacion.VentanaReportes;

/**
 *
 * @author Mosqueteros
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
        VentanaPrincipal vp=new VentanaPrincipal();
        vp.setVisible(true);
        vp.setAlwaysOnTop(true);
        
    }
    
}
