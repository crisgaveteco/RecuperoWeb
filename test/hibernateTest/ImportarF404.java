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
import origenes.daos.F404DAO;

/**
 *
 * @author Cristian
 */
public class ImportarF404 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        File F404File = new File("C://AVM//F404"+args[0]+".CSV");
        FileReader fr;

        try {
            fr = new FileReader(F404File);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null && linea.length()>2) {
                F404 f404 = new F404(linea.split(";"),F404File.getName().replaceFirst("F404", ""));
                System.out.println(f404);
                F404DAO f404Dao = new F404DAO();
                f404Dao.guardaEstcomp(f404);

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ImportarF404.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ImportarF404.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
