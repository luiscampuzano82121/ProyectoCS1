package com.poli.proyecto.BackendPCS.Data;


public class Horario {

    private String codigoHorario;
    private String horario;
    private String codigoDeporte;
    private String codigoEntrenador;

    public Horario(String codigoHorario, String horario) {
        this.codigoHorario = codigoHorario;
        this.horario = horario;
    }

    public String getCodigoHorario() {
        return codigoHorario;
    }

    public void setCodigoHorario(String codigoHorario) {
        this.codigoHorario = codigoHorario;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Horario() {
    }

    public String getCodigoDeporte() {
        return codigoDeporte;
    }

    public void setCodigoDeporte(String codigoDeporte) {
        this.codigoDeporte = codigoDeporte;
    }

    public String getCodigoEntrenador() {
        return codigoEntrenador;
    }

    public void setCodigoEntrenador(String codigoEntrenador) {
        this.codigoEntrenador = codigoEntrenador;
    }
}
