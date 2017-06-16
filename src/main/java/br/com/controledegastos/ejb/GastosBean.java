/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controledegastos.ejb;

import br.com.controledegastos.dao.GastosDAO;
import br.com.controledegastos.entity.Gastos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author vinicius
 */
@Stateless
public class GastosBean implements GastosRemote {

    @PersistenceContext(unitName = "controlePU")
    private EntityManager em;

    @Override
    public Gastos salvar(Gastos g) throws Exception {

        GastosDAO dao = new GastosDAO(em);
        return dao.salvar(g);
    }

    @Override
    public Gastos consultarPorId(Long id) {
        GastosDAO dao = new GastosDAO(em);
        return dao.consultarPorId(Gastos.class, id);

    }

    @Override
    public void remover(Long id) {
        GastosDAO dao = new GastosDAO(em);
        dao.remover(Gastos.class, id);

    }
}
