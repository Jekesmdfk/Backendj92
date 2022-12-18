package com.example.demoeva4.Bean;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name= "cliente")
public class clienteDiegoBean {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcliente;
    private String dnicliente;
    private String nombrecliente;

    public Integer getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Integer idcliente) {
        this.idcliente = idcliente;
    }

    public String getDnicliente() {
        return dnicliente;
    }

    public void setDnicliente(String dnicliente) {
        this.dnicliente = dnicliente;
    }

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public String getApellidocliente() {
        return apellidocliente;
    }

    public void setApellidocliente(String apellidocliente) {
        this.apellidocliente = apellidocliente;
    }

    public String getCorreocliente() {
        return correocliente;
    }

    public void setCorreocliente(String correocliente) {
        this.correocliente = correocliente;
    }

    public String getEdadcliente() {
        return edadcliente;
    }

    public void setEdadcliente(String edadcliente) {
        this.edadcliente = edadcliente;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    private String apellidocliente;
    private String correocliente;
    private String edadcliente;
    private Date fechanacimiento;
    private Boolean estado;
}
