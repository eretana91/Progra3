
package org.primefaces.icarus.dao;

import java.sql.PreparedStatement;
import org.primefaces.icarus.model.Clientes;


public class ClientesDao extends dao {
        public void registrar(Clientes Cli) throws Exception {
        try {
            this.Conectar();
            String string
                    = "INSERT INTO \n"
                    + "CLIENTES\n"
                    + "(NOMBRE_1,NOMBRE_2,APELLIDO_1,APELLIDO_2,EDAD,GENERO,IDENTIFICACION,DIRECCION)\n"
                    + "values\n"
                    + "(?,?,?,?,?,?,?,?)";
            PreparedStatement st = this.getCn().prepareStatement(string);
            st.setString(1,Cli.getNOMBRE_1());
            st.setString(2,Cli.getNOMBRE_2());
            st.setString(3,Cli.getAPELLIDO_1());
            st.setString(4,Cli.getAPELLIDO_2());
            st.setInt(5,Cli.getEDAD());
            st.setString(6,Cli.getGENERO());
            st.setString(7,Cli.getIDENTIFICACION());
            st.setString(8,Cli.getDIRECCION());
        } catch (Exception e) {

        } finally {
            this.Cerrar();

        }
    }
    
}
