
package org.primefaces.icarus.model;


public class Cliente {
    
    	private int ID_CLIENTE,EDAD;
	private String NOMBRE_1,NOMBRE_2,APELLIDO_1,APELLIDO_2,IDENTIFICACION,DIRECCION;
        private char GENERO;

    public int getID_CLIENTE() {
        return ID_CLIENTE;
    }

    public void setID_CLIENTE(int ID_CLIENTE) {
        this.ID_CLIENTE = ID_CLIENTE;
    }

    public int getEDAD() {
        return EDAD;
    }

    public void setEDAD(int EDAD) {
        this.EDAD = EDAD;
    }

    public String getNOMBRE_1() {
        return NOMBRE_1;
    }

    public void setNOMBRE_1(String NOMBRE_1) {
        this.NOMBRE_1 = NOMBRE_1;
    }

    public String getNOMBRE_2() {
        return NOMBRE_2;
    }

    public void setNOMBRE_2(String NOMBRE_2) {
        this.NOMBRE_2 = NOMBRE_2;
    }

    public String getAPELLIDO_1() {
        return APELLIDO_1;
    }

    public void setAPELLIDO_1(String APELLIDO_1) {
        this.APELLIDO_1 = APELLIDO_1;
    }

    public String getAPELLIDO_2() {
        return APELLIDO_2;
    }

    public void setAPELLIDO_2(String APELLIDO_2) {
        this.APELLIDO_2 = APELLIDO_2;
    }

    public String getIDENTIFICACION() {
        return IDENTIFICACION;
    }

    public void setIDENTIFICACION(String IDENTIFICACION) {
        this.IDENTIFICACION = IDENTIFICACION;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }

    public char getGENERO() {
        return GENERO;
    }

    public void setGENERO(char GENERO) {
        this.GENERO = GENERO;
    }
        
}
