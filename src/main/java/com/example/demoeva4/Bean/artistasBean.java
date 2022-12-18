package com.example.demoeva4.Bean;

import javax.persistence.*;

@Entity
@Table(name = "artistas")
public class artistasBean {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idmusico;
    private String nombremusico;

    public Integer getIdmusico() {
        return idmusico;
    }

    public void setIdmusico(Integer idmusico) {
        this.idmusico = idmusico;
    }

    public String getNombremusico() {
        return nombremusico;
    }

    public void setNombremusico(String nombremusico) {
        this.nombremusico = nombremusico;
    }

    public String getGeneromusico() {
        return generomusico;
    }

    public void setGeneromusico(String generomusico) {
        this.generomusico = generomusico;
    }

    public String getTiempoactividad() {
        return tiempoactividad;
    }

    public void setTiempoactividad(String tiempoactividad) {
        this.tiempoactividad = tiempoactividad;
    }

    public Integer getMiembros() {
        return miembros;
    }

    public void setMiembros(Integer miembros) {
        this.miembros = miembros;
    }

    public String getLugarorigen() {
        return lugarorigen;
    }

    public void setLugarorigen(String lugarorigen) {
        this.lugarorigen = lugarorigen;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    private String generomusico;
    private String tiempoactividad;
    private Integer miembros;
    private String lugarorigen;
    private Boolean estado;
}
