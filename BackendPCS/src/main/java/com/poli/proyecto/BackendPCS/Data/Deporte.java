package com.poli.proyecto.BackendPCS.Data;


import org.springframework.stereotype.Service;

@Service
public class Deporte {

    String codigo;
    String tipo;
    String costo;

    public Deporte() {

    }

    public Deporte(String codigo, String tipo, String costo) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.costo = costo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Deporte{" +
                "codigo='" + codigo + '\'' +
                ", tipo='" + tipo + '\'' +
                ", costo='" + costo + '\'' +
                '}';
    }
}

