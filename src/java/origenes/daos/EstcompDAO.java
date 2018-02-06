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

/**
 *
 * @author Cristian
 */
public class EstcompDAO {
    private Session sesion;
    private Transaction tx;
    
    private void iniciaOperacion() throws HibernateException
{
    sesion = HibernateUtil.getSessionFactory().openSession();
    tx = sesion.beginTransaction();
}
    public long guardaEstcomp(Estcomp estcomp) throws HibernateException 
    { 
        long id = 0;  

        try 
        { 
            iniciaOperacion(); 
            id = (Long) sesion.save(estcomp); 
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
