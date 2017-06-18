/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controledegastos.dao;

import br.com.controledegastos.entity.Gastos;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author vinicius
 */
public class GastosDAO extends GenericoDAO<Gastos>{
    
    private EntityManager etm;
    
    public GastosDAO(EntityManager em) {
        super(em);
        etm = em;
    }
    
    public List<Gastos> buscarTodosGastos(){
        Query q = etm.createNamedQuery("gastos.buscarTodosGastos");
        return q.getResultList();
    }
    
    
    public List<Gastos> buscarEntreDatas(Date ini, Date fim){
        Query q = etm.createNamedQuery("gastos.buscarGastosEntreDatas");
        q.setParameter("data1", ini);
        q.setParameter("data2", fim);
        return q.getResultList();
    }
    
    
    
}
