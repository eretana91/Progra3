package org.primefaces.icarus.model;

public class Empleados {

    private int ID_EMPLEADO, EDAD;
    private String NOMBRE_1, NOMBRE_2, APELLIDO_1, APELLIDO_2, IDENTIFICACION, DIRECCION, CORREO_ELECTRONICO, CONTRASENA;
    private char GENERO;

    public int getID_EMPLEADO() {
        return ID_EMPLEADO;
    }

    public void setID_EMPLEADO(int ID_EMPLEADO) {
        this.ID_EMPLEADO = ID_EMPLEADO;
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

    public String getCORREO_ELECTRONICO() {
        return CORREO_ELECTRONICO;
    }

    public void setCORREO_ELECTRONICO(String CORREO_ELECTRONICO) {
        this.CORREO_ELECTRONICO = CORREO_ELECTRONICO;
    }

    public String getCONTRASENA() {
        return CONTRASENA;
    }

    public void setCONTRASENA(String CONTRASENA) {
        this.CONTRASENA = CONTRASENA;
    }

    public char getGENERO() {
        return GENERO;
    }

    public void setGENERO(char GENERO) {
        this.GENERO = GENERO;
    }

}
