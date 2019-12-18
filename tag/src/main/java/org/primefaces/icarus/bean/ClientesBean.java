
package org.primefaces.icarus.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.icarus.dao.ClientesDao;
import org.primefaces.icarus.model.Clientes;

@ManagedBean
@RequestScoped
public class ClientesBean {
    
    private Clientes clientes = new Clientes();

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }
    
    public void registrar() throws Exception{
        
        ClientesDao dao;
        try {
            dao = new ClientesDao();
            dao.registrar(clientes);
            
        } catch (Exception e) {
            throw e;
        }
    }
    
}
