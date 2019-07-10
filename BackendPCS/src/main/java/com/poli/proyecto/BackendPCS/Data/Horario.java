package com.poli.proyecto.BackendPCS.Data;

import java.sql.Date;

public class Horario {

    private String codigoHorario;
    private Date fecha;

    public Horario(String codigoHorario, Date fecha) {
        this.codigoHorario = codigoHorario;
        this.fecha = fecha;
    }

    public Horario() {
    }

    public String getCodigoHorario() {
        return codigoHorario;
    }

    public void setCodigoHorario(String codigoHorario) {
        this.codigoHorario = codigoHorario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Horario{" +
                "codigoHorario='" + codigoHorario + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
