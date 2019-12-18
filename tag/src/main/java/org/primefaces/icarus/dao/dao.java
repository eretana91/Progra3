package org.primefaces.icarus.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class dao {

    private Connection cn;

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }

    public void Conectar() throws Exception {
        try {
            Class.forName("com.mysql.jdbo.driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/chardb?user=root&password=Temporal123456789");
        } catch (Exception e) {
            throw e;
        }

    }

    public void Cerrar() throws Exception {
        try {
            if (cn != null) {
                if (cn.isClosed() == false) {
                    cn.close();
                }
            }
        } catch (Exception e) {
            throw e;
        }

    }
}
