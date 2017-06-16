package br.com.controledegastos.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-16T11:32:46")
@StaticMetamodel(Gastos.class)
public class Gastos_ { 

    public static volatile SingularAttribute<Gastos, Date> data;
    public static volatile SingularAttribute<Gastos, String> tipoGasto;
    public static volatile SingularAttribute<Gastos, Double> valor;
    public static volatile SingularAttribute<Gastos, Long> id;
    public static volatile SingularAttribute<Gastos, String> descricao;

}