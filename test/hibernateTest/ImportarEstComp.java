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
import origenes.daos.EstcompDAO;

/**
 *
 * @author Cristian
 */
public class ImportarEstComp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        File EstcompFile = new File("C://AVM//ESTCOMP"+args[0]+".CSV");
        FileReader fr;

        try {
            fr = new FileReader(EstcompFile);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null && linea.length()>2) {
                Estcomp estcomp = new Estcomp(linea.split(";"));
                System.out.println(estcomp);
                EstcompDAO estDao = new EstcompDAO();
                estDao.guardaEstcomp(estcomp);

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ImportarEstComp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ImportarEstComp.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
