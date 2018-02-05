/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateTest;

import origenes.objetos.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import origenes.daos.CompDAO;

/**
 *
 * @author Cristian
 */
public class ImportarComp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        File compFile = new File("C://AVM//COMP"+args[0]+".PRN");
        String periodo = "20"+compFile.getName().substring(4,8);
        FileReader fr;

        try {
            fr = new FileReader(compFile);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null && linea.length()>2) {
                Comp comp = new Comp(linea,periodo);
                System.out.println(comp);
                CompDAO compDao = new CompDAO();
                compDao.guardaComp(comp);

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ImportarComp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ImportarComp.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
