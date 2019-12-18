package org.primefaces.icarus.dao;

import java.sql.PreparedStatement;
import org.primefaces.icarus.model.Empleados;

public class EmpleadosDao extends dao {

    public void registrar(Empleados Emp) throws Exception {
        try {
            this.Conectar();
            String string
                    = "INSERT INTO \n"
                    + "CLIENTES\n"
                    + "(NOMBRE_1,NOMBRE_2,APELLIDO_1,APELLIDO_2,EDAD,GENERO,CORREO_ELECTRONICO,CONTRASENA,IDENTIFICACION,DIRECCION)\n"
                    + "values\n"
                    + "(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement st = this.getCn().prepareStatement(string);
            st.setString(1,Emp.getNOMBRE_1());
            st.setString(2,Emp.getNOMBRE_2());
            st.setString(3,Emp.getAPELLIDO_1());
            st.setString(4,Emp.getAPELLIDO_2());
            st.setInt(5,Emp.getEDAD());
            st.setString(6,Emp.getGENERO());
            st.setString(7,Emp.getCORREO_ELECTRONICO());
            st.setString(8,Emp.getCONTRASENA());
            st.setString(9,Emp.getIDENTIFICACION());
            st.setString(10,Emp.getDIRECCION());
        } catch (Exception e) {

        } finally {
            this.Cerrar();

        }
    }
}
