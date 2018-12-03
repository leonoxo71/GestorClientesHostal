package cl.usm.GestorClientesHostalApp.dto;

import cl.usm.GestorClientesHostalApp.dto.Cliente;
import cl.usm.GestorClientesHostalApp.dto.Pais;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-02T22:09:39")
@StaticMetamodel(Ciudad.class)
public class Ciudad_ { 

    public static volatile ListAttribute<Ciudad, Cliente> clienteList;
    public static volatile SingularAttribute<Ciudad, Pais> codPais;
    public static volatile SingularAttribute<Ciudad, Integer> codCiudad;
    public static volatile SingularAttribute<Ciudad, String> nombre;

}