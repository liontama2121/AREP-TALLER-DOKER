package edu.escuelaing.arep.model;

import java.util.Date;

public class Registro {
    private String detalle;
    private Date fecha;

    public Registro() {

    }

    public Registro(String detalle) {
        this.detalle = detalle;
        this.fecha=new Date();
    }

    public Registro(String detalle, Date fecha) {
        this.detalle = detalle;
        this.fecha = fecha;
    }

    public String getDetalle() {
        return detalle;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Registro{" +
                "detalle='" + detalle + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
