package com.poli.proyecto.BackendPCS.Data;

public class Entrenador {
    String codigoEntrenador;
    String nombre;
    String cedula;
    String telefono;
    String direccion;
    String nit;
    int calificacion;

    public Entrenador(String codigoEntrenador, String nombre, String cedula, String telefono, String direccion,int calificacion ,String nit) {
        this.codigoEntrenador = codigoEntrenador;
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
        this.calificacion = calificacion;
        this.nit = nit;
    }

    public String getCodigoEntrenador() {
        return codigoEntrenador;
    }

    public void setCodigoEntrenador(String codigoEntrenador) {
        this.codigoEntrenador = codigoEntrenador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "codigoEntrenador='" + codigoEntrenador + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", nit='" + nit + '\'' +
                ", calificacion=" + calificacion +
                '}';
    }
}
