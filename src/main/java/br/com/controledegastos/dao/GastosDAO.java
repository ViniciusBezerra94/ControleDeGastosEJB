/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controledegastos.dao;

import br.com.controledegastos.entity.Gastos;
import javax.persistence.EntityManager;

/**
 *
 * @author vinicius
 */
public class GastosDAO extends GenericoDAO<Gastos>{
    
    public GastosDAO(EntityManager em) {
        super(em);
    }
    
    
    
}
