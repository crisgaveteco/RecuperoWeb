/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package origenes.daos;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import origenes.objetos.Estcomp;
import origenes.objetos.F404;

/**
 *
 * @author Cristian
 */
public class F404DAO {
    private Session sesion;
    private Transaction tx;
    
    private void iniciaOperacion() throws HibernateException
{
    sesion = HibernateUtil.getSessionFactory().openSession();
    tx = sesion.beginTransaction();
}
    public long guardaEstcomp(F404 f404) throws HibernateException 
    { 
        long id = 0;  

        try 
        { 
            iniciaOperacion(); 
            id = (Long) sesion.save(f404); 
            tx.commit(); 
        } catch (HibernateException he) 
        { 
            //manejaExcepcion(he); 
            throw he; 
        } finally 
        { 
            sesion.close(); 
        }  

        return id; 
    }
    
}
