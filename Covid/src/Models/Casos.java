/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Date;

/**
 *
 * @author maria
 */
public class Casos {
    private Integer id;
    private Date fechaReporteWeb;
    private Date fechaNotificacion;
    private Integer edad;
    private String sexo;
    private String tipoContagio;
    private String ubicacion;
    private String estado;
    private String paisImportado;
    private String recuperado;
    private Date fechaInicioSintomas;
    private Date fechaDiagnostico;
    private Date fechaRecuperacion;
    private Date fechaMuerte;

    public Casos() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaReporteWeb() {
        return fechaReporteWeb;
    }

    public void setFechaReporteWeb(Date fechaReporteWeb) {
        this.fechaReporteWeb = fechaReporteWeb;
    }

    public Date getFechaNotificacion() {
        return fechaNotificacion;
    }

    public void setFechaNotificacion(Date fechaNotificacion) {
        this.fechaNotificacion = fechaNotificacion;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTipoContagio() {
        return tipoContagio;
    }

    public void setTipoContagio(String tipoContagio) {
        this.tipoContagio = tipoContagio;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPaisImportado() {
        return paisImportado;
    }

    public void setPaisImportado(String paisImportado) {
        this.paisImportado = paisImportado;
    }

    public String getRecuperado() {
        return recuperado;
    }

    public void setRecuperado(String recuperado) {
        this.recuperado = recuperado;
    }

    public Date getFechaInicioSintomas() {
        return fechaInicioSintomas;
    }

    public void setFechaInicioSintomas(Date fechaInicioSintomas) {
        this.fechaInicioSintomas = fechaInicioSintomas;
    }

    public Date getFechaDiagnostico() {
        return fechaDiagnostico;
    }

    public void setFechaDiagnostico(Date fechaDiagnostico) {
        this.fechaDiagnostico = fechaDiagnostico;
    }

    public Date getFechaRecuperacion() {
        return fechaRecuperacion;
    }

    public void setFechaRecuperacion(Date fechaRecuperacion) {
        this.fechaRecuperacion = fechaRecuperacion;
    }

    public Date getFechaMuerte() {
        return fechaMuerte;
    }

    public void setFechaMuerte(Date fechaMuerte) {
        this.fechaMuerte = fechaMuerte;
    }
    
    
    
}
