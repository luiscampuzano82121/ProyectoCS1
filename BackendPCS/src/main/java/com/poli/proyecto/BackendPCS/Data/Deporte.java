package com.poli.proyecto.BackendPCS.Data;


public class Deporte {

    String Codigo;
    String Nombre;
    String Tipo;
    String Costo;
    String IdEntrenador;

    public Deporte(String codigo, String nombre, String tipo, String costo, String idEntrenador) {
        Codigo = codigo;
        Nombre = nombre;
        Tipo = tipo;
        Costo = costo;
        IdEntrenador = idEntrenador;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getCosto() {
        return Costo;
    }

    public void setCosto(String costo) {
        Costo = costo;
    }

    public String getIdEntrenador() {
        return IdEntrenador;
    }

    public void setIdEntrenador(String idEntrenador) {
        IdEntrenador = idEntrenador;
    }

    public Deporte() {
    }

    @Override
    public String toString() {
        return "Deporte{" +
                "Codigo='" + Codigo + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", Tipo='" + Tipo + '\'' +
                ", Costo='" + Costo + '\'' +
                ", IdEntrenador='" + IdEntrenador + '\'' +
                '}';
    }
}

