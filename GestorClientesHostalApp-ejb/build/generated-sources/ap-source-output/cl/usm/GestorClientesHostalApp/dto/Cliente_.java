package cl.usm.GestorClientesHostalApp.dto;

import cl.usm.GestorClientesHostalApp.dto.Ciudad;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-02T22:09:39")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> rut;
    public static volatile SingularAttribute<Cliente, String> mail;
    public static volatile SingularAttribute<Cliente, Date> fechaNacimiento;
    public static volatile SingularAttribute<Cliente, String> apMaterno;
    public static volatile SingularAttribute<Cliente, String> direccion;
    public static volatile SingularAttribute<Cliente, Ciudad> codCiudad;
    public static volatile SingularAttribute<Cliente, String> telefono;
    public static volatile SingularAttribute<Cliente, String> nombre;
    public static volatile SingularAttribute<Cliente, String> apPaterno;

}