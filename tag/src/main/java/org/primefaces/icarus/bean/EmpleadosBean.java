
package org.primefaces.icarus.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.icarus.dao.EmpleadosDao;
import org.primefaces.icarus.model.Empleados;

@ManagedBean
@RequestScoped
public class EmpleadosBean {
 
    private Empleados empleados = new Empleados();

    public Empleados getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleados empleados) {
        this.empleados = empleados;
    }
    public void registrar() throws Exception{
        
        EmpleadosDao dao;
        try {
            dao = new EmpleadosDao();
            dao.registrar(empleados);
            
        } catch (Exception e) {
            throw e;
        }
    }
}
